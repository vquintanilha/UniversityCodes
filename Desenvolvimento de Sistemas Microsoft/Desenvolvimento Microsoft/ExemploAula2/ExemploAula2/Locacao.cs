using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploAula2
{
    public class Locacao
    {

        public Pessoa Locatario { get; set; }

        public Livro Livro { get; set; }

        public DateTime DataEmprestimo { get; set; }

        public DateTime DataDevolucao { get; set; }

    }
}
