﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace Connect4.Models
{
    public class Torneio
    {
        public int Id { get; set; }

        public IList<Jogador> Jogadores { get; set; } = new List<Jogador>();

        public IList<Jogo> Jogos { get; set; } = new List<Jogo>();

        [Display(Name ="Nome")]
        //Expressão regular. Primeira letra maíscula depois letras, números, espaços e '-'.
        [RegularExpression(@"^[A-Z]+[a-zA-Z0-9""'\s-]*$")]
        public String NomeTorneio { get; set; }

        [Display(Name = "Quantidade de Jogadores")]
        [Range(4,16, ErrorMessage ="Quantidade de Jogadores do torneio deve ser entre 4 e 16 jogadores")]
        public int QuantidadeJogadores { get; set; }

        //Esta validação não é aconselhável. Existe como usá-la desabilitando a validação 
        //do JQuery. Mas não é uma boa prática.
        //https://stackoverflow.com/questions/21777412/mvc-model-validation-for-date
        //[Range(typeof(DateTime),@"01/01/2001",@"01/01/2051",ErrorMessage = "A data de início do torneio deve ser entre {1} e {2}.")]
        [DataType(DataType.Date)]
        [Display(Name = "Início do Torneio")]
        public DateTime Inicio { get; set; }

        [Display(Name = "Criador do Torneio")]
        public String Dono { get; set; }

        [Display(Name = "Premiação")]
        [DataType(DataType.Currency)]
        public Decimal Premiacao { get; set; }


    }
}
