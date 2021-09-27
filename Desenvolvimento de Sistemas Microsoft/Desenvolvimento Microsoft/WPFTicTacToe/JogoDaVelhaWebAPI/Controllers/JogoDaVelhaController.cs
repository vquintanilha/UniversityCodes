using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using JogoDaVelha;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace JogoDaVelhaWebAPI.Controllers
{
    [Produces("application/json")]
    [Route("api/JogoDaVelha")]
    public class JogoDaVelhaController : Controller
    {      
        static TabuleiroJogo Jogo { get; set; }
        
        [HttpGet("{jogador}/{posX}/{posY}")]
        public String Jogar(int jogador, int posX, int posY)
        {
            Jogo.Jogar(jogador, posX, posY);
            if (Jogo.Ganhador == 0)
            {
                Random r = new Random();
                bool ocupado = true;
                while (ocupado)
                {
                    int h = r.Next(3);
                    int v = r.Next(3);
                    if (Jogo.Tabuleiro[v][h] == 0)
                    {
                        Jogo.Jogar(Jogo.JogadorAtual, h, v);
                        ocupado = false;
                    }
                }
            }
            switch (Jogo.VerificarGanhador())
            {
                case 0:
                    return "Jogo em andamento!";
                case -1:
                    return "Jogo terminou empatado!";
                case 1:
                    return "Jogador 1 venceu!";
                case 2:
                    return "Jogador 2 venceu!";
            }
            return "";
        }

        [HttpGet("Reset")]
        public String Reiniciar()
        {
            Jogo = new TabuleiroJogo();
            return "Jogo Reiniciado!";
        }

        [HttpGet()]
        public TabuleiroJogo Get()
        {
            return Jogo;
        }
    }
}