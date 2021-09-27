﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Connect4.Data;
using Connect4.Models;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Microsoft.AspNetCore.Http;


namespace Connect4.Controllers
{

    /// <summary>
    /// Controlador para o ModelJogos.
    /// Opção para entrar no Lobby, criar jogos e excluir Jogos.
    /// </summary>
    public class JogoController : Controller
    {
        private ApplicationDbContext _context { get; set; }

        private UserManager<ApplicationUser> _userManager { get; set; }

        private SignInManager<ApplicationUser> _signInManager { get; set; }

        public JogoController(
            UserManager<ApplicationUser> userManager,
            SignInManager<ApplicationUser> signInManager,
            ApplicationDbContext dbContext)
        {
            this._context = dbContext;
            this._userManager = userManager;
            this._signInManager = signInManager;
        }

        public IActionResult Index()
        {
            return View();
        }

        /// <summary>
        /// Ação responsável por retornar os dados necessários para 
        /// montagem e operação de um jogo.
        /// </summary>
        /// <param name="id">O id do Jogo.</param>
        /// <returns></returns>
        public IActionResult Tabuleiro(int id)
        {
            Torneio torneio = new Torneio();

            if (torneio.Id != 0)
            {
                ViewBag.mensagem = "Modo Torneio";
            }
            if (torneio.Id == 0)
            {
                ViewBag.mensagem = "Modo Amistoso";
            }

            //Recupera Jogo do banco de dados.
            //Repare que a inclusão de j.Jogador1, não trará
            //j.Jogador1.Usuario, ver na ação de Lobby como fazer.
            var jogo = _context.Jogos
                            .Include(j => j.Jogador1)
                            .Include(j => j.Jogador2)
                            .Include(j => j.Tabuleiro)
                            .Where(j => j.Id == id)
                            .Select(j => j)
                            .FirstOrDefault();

            //Verifica se o id passado via parâmetro existe no banco de dados.
            if (jogo.Jogador1 is JogadorPessoa)
            {
                //Caso seja, será necessário recuperar 
                //Jogador.Usuário, para recuperar o nome do Jogador.
                jogo.Jogador1 = _context.JogadorPessoas
                                .Include(j => j.Usuario)
                                .Where(j => j.Id == jogo.Jogador1Id)
                                .FirstOrDefault();
            }
            if (jogo.Jogador2 is JogadorPessoa)
            {
                jogo.Jogador2 = _context.JogadorPessoas
                                .Include(j => j.Usuario)
                                .Where(j => j.Id == jogo.Jogador2Id)
                                .FirstOrDefault();
            }

            if (jogo == null)
            {
                return NotFound();
            }
            if (jogo.Tabuleiro == null)
            {
                jogo.Tabuleiro = new Tabuleiro();
                _context.SaveChanges();
            }
            return View(jogo);
        }

        /// <summary>
        /// Lobby é uma sala de espera antes de iniciar o jogo.
        /// Somente os jogadores 1 e 2 de um jogo podem 
        /// entrar no Lobby de um Jogo.
        /// </summary>
        /// <param name="id">Id do jogo.</param>
        /// <returns></returns>
        [Authorize]
        public IActionResult Lobby(int id)
        {
            //Recupera o Jogo com o Objeto Jogadores.
            var jogo = _context.Jogos
                .Include(j => j.Jogador1)
                .Include(j => j.Jogador2)
                .Where(j => j.Id == id)
                .Select(j => j)
                .FirstOrDefault();

            if (jogo == null)
            {
                return NotFound();
            }

            //Verifica se o id passado via parâmetro existe no banco de dados.
            if (jogo.Jogador1 is JogadorPessoa)
            {
                //Caso seja, será necessário recuperar 
                //Jogador.Usuário, para recuperar o nome do Jogador.
                jogo.Jogador1 = _context.JogadorPessoas
                                .Include(j => j.Usuario)
                                .Where(j => j.Id == jogo.Jogador1Id)
                                .FirstOrDefault();
            }
            if (jogo.Jogador2 is JogadorPessoa)
            {
                jogo.Jogador2 = _context.JogadorPessoas
                                .Include(j => j.Usuario)
                                .Where(j => j.Id == jogo.Jogador2Id)
                                .FirstOrDefault();
            }
            int? jogadorId =
            _userManager.GetUserAsync(User).Result.JogadorId;
            if (!(jogadorId == jogo.Jogador1Id ||
                jogadorId == jogo.Jogador2Id))
            {
                return Forbid();
            }
            return View(jogo);
        }

        /// <summary>
        /// Ação para criar o jogo.
        /// Irá verificar se existe algum jogo disponível sem 
        /// todos os jogadores. Caso não exista irá criar um
        /// novo jogo.
        /// </summary>
        /// <returns>Redireciona o usuário para o Lobby.</returns>
        public IActionResult CriarJogo()
        {
            Jogo jogo;
            int? jogadorId =
                _userManager.GetUserAsync(User).Result.JogadorId;
            if (jogadorId == null)
            {
                throw new ApplicationException("O usuário atual não é um jogador.");
            }
            var jogadorAtual = _context.JogadorPessoas.Find(jogadorId);
            if (jogadorAtual == null || jogadorAtual.Id == 0)
            {
                return NotFound();
            }
            //Verificar se existe jogo com um jogador
            jogo = (from item in _context.Jogos.Include(j => j.Jogador1)
                                               .Include(j => j.Jogador2)
                    where (item.Jogador1 == null ||
                         item.Jogador2 == null) &&
                         (item.Jogador1 != jogadorAtual &&
                         item.Jogador2 != jogadorAtual)
                    select item).FirstOrDefault();
            if (jogo != null)
            {
                if (jogo.Jogador1 == null)
                {
                    jogo.Jogador1 = jogadorAtual;
                }
                else if (jogo.Jogador2 == null)
                {
                    jogo.Jogador2 = jogadorAtual;
                }
            }
            //Caso contrário
            else
            {
                jogo = new Jogo();
                jogo.Jogador1 = jogadorAtual;
                _context.Add(jogo);
            }
            _context.SaveChanges();
            //Redirecionar para Lobby
            return RedirectToAction(nameof(Lobby),
                new { id = jogo.Id });
        }

        [Authorize]
        public IActionResult ContinuarJogo()
        {
            JogadorPessoa JogadorPessoa;
            List<Jogo> Jogos;
            int? JogadorId = _userManager.GetUserAsync(User).Result.JogadorId;
            if (JogadorId == null)
            {
                throw new ApplicationException("O usuário atual é inválido!");
            }
            Jogos = (from item in _context.Jogos.Include(j => j.Tabuleiro)
                                                .Include(j => j.Jogador1)
                                                .Include(j => j.Jogador2)
                     where (item.Jogador1Id != null || item.Jogador2Id != null)
                     select item).ToList();
            JogadorPessoa = _context.JogadorPessoas.Find(JogadorId);
            JogadorPessoa.Jogos = Jogos;
            var ListaJogos = new List<Jogo>();
            foreach (var jogo in JogadorPessoa.Jogos)
            {
                Jogo Jogo = null;
                Jogo = _context.Jogos.Include(j => j.Jogador1)
                                             .Include(j => j.Jogador2)
                                             .Include(j => j.Tabuleiro)
                                             .Where(j => j.Id == jogo.Id)
                                             .Select(j => j)
                                             .FirstOrDefault();
                ListaJogos.Add(Jogo);
                if (Jogo.Jogador1 is JogadorPessoa)
                {
                    Jogo.Jogador1 = _context.JogadorPessoas
                                    .Include(j => j.Usuario)
                                    .Where(j => j.Id == Jogo.Jogador1Id)
                                    .FirstOrDefault();
                }

                if (Jogo.Jogador2 is JogadorPessoa)
                {
                    Jogo.Jogador2 = _context.JogadorPessoas
                                    .Include(j => j.Usuario)
                                    .Where(j => j.Id == Jogo.Jogador2Id)
                                    .FirstOrDefault();
                }
            }
            if (ListaJogos.Any())
            {
                JogadorPessoa.Jogos = ListaJogos;
                return View(JogadorPessoa);
            }
            return NotFound("Não há jogos em andamento!");
        }
    }
}