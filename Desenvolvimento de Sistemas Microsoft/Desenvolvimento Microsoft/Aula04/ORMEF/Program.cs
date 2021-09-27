using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.Entity;

namespace ORMEF
{
    class Program
    {
        static void Main(string[] args)
        {
            ModelPessoas context = new ModelPessoas();
            Pessoa p = new Pessoa()
            {
                Nome = "Victor Quintanilha",
                Nascimento = new DateTime(1999, 07, 27)
            };
            Pessoa p2 = new Pessoa()
            {
                Nome = "Joãozinho",
                Nascimento = new DateTime(1980, 12, 03)
            };
            Pessoa resultado = PersistirPessoa(context, p);
            Pessoa resultado2 = PersistirPessoa(context, p2);

            Cidade curitiba = null;
            curitiba = (from c in context.Cidades
                            .Include(c => c.Moradores)
                        where c.Nome == "Curitiba"
                        select c).FirstOrDefault();
            if (curitiba == null)
            {
                curitiba = new Cidade() { Nome = "Curitiba" };
            }

            resultado.Cidade = curitiba;
            resultado2.Cidade = curitiba;

            context.SaveChanges();

            foreach (Pessoa pessoa in curitiba.Moradores)
            {
                Console.WriteLine("Nome: " + pessoa.Nome);
            }

            Casa casa = new Casa()
            {
                Cidade = curitiba,
                Endereco = "Rua: XXXXXX, Nº.1111, Bairro: oooo"
            };
            casa.Moradores.Add(resultado);
            casa.Moradores.Add(resultado2);

            context.Casas.Add(casa);
            context.SaveChanges();
            Console.ReadKey();
        }

        private static Pessoa PersistirPessoa(ModelPessoas context, Pessoa p)
        {
            var resultado = (from pessoa in context.Pessoas
                             where pessoa.Nome == p.Nome
                             select pessoa).FirstOrDefault();

            if (resultado == null)
            {
                resultado = context.Pessoas.Add(p);
            }

            return resultado;
        }
    }
}
