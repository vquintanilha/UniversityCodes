using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploAula2
{
    public class Livro
    {

        /// <summary>
        /// O Título ou nome do livro.
        /// </summary>
        public String Titulo { get; set; }

        /// <summary>
        /// A pessoa que escreveu o livro.
        /// </summary>
        public List<Pessoa> Autores { get; set; }

        public String Editora { get; set; }

        public String Genero { get; set; }

        public int Paginas { get; set; }

        public DateTime Lancamento { get; set; }

        public List<Locacao> Locacoes { get; set; }

    }
}
