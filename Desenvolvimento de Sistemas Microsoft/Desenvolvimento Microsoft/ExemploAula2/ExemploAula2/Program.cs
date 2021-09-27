using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploAula2
{
    class Program
    {
        static void Main(string[] args)
        {

            Pessoa p1 = new Pessoa();
            p1.Nome = "Joãozinho";
            p1.Altura = 1.63;
            p1.Nascimento = new DateTime(1999, 07, 27);
            p1.Massa = 60;

            Livro l1 = new Livro();
            l1.Autores = new List<Pessoa>();
            l1.Autores.Add(p1);
            l1.Titulo = "Auditoria de Sistemas da Informação";
            l1.Genero = "Técnico";
            l1.Paginas = 250;
            l1.Editora = "Positivo";
            l1.Lancamento = new DateTime(2019, 08, 07);

            Telefone telefone = new Telefone();
            while (true)
            {
                telefone.Tocar();
            }

            Console.ReadKey();
        }
    }
}
