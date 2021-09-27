using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aula04
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] numbers = new int[7]{4,5,6,7,8,9,11};
            var pares = from num in numbers
                        where (num % 3) == 0
                        select num;
            Console.Write("Números: ");
            foreach (int x in pares)
            {
                Console.Write(x + ", ");
            }

            Console.WriteLine("\n");

            ExemploPessoa();
            Console.ReadKey();
        }

        static void ExemploPessoa()
        {
            Cidade vitoria = new Cidade() { Nome = "Vitória" };
            Cidade curitiba = new Cidade() { Nome = "Curitiba" };

            IList<Pessoa> Pessoas = new List<Pessoa>();
            Pessoas.Add(new Pessoa()
            {
                Nome = "Victor",
                Nascimento = new DateTime(1999, 07, 27),
                Cidade = curitiba
            });
            Pessoas.Add(new Pessoa()
            {
                Nome = "João",
                Nascimento = new DateTime(2005, 12, 13),
                Cidade = curitiba
            });
            Pessoas.Add(new Pessoa()
            {
                Nome = "Maria",
                Nascimento = new DateTime(1987, 12, 06),
                Cidade = vitoria
            });

            var resultado = from p in Pessoas
                            //where p.Nascimento.Month == 12
                            orderby p.Nascimento descending
                            select p.Nome + " Idade: " + (DateTime.Now.Year - p.Nascimento.Year).ToString();

            foreach (String nome in resultado)
            {
                Console.Write(nome + ", ");
            }

            var resultadoGroup =
                from p in Pessoas
                where (DateTime.Now.Year - p.Nascimento.Year) > 18
                group p by p.Cidade;

            foreach (var grupo in resultadoGroup)
            {
                Console.WriteLine("\n\nInicioGrupo: " + grupo.Key.Nome);
                foreach(var item in grupo)
                {
                    Console.Write(item.Nome + ", ");
                }
            }

            Console.ReadKey();
        }

    }
}
