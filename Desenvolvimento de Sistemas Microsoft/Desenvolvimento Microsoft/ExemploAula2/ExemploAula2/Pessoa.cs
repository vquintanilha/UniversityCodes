using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploAula2
{
    public class Pessoa
    {

        public String Nome { get; set; }

        public double Altura { get; set; }

        public DateTime Nascimento { get; set; }

        public double Massa { get; set; }

        public List<Locacao> Locacoes { get; set; }

    }
}
