using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Adivinhador
{
    class Program
    {
        static void Main(string[] args)
        {
            Random sorteador = new Random();
            int valor = sorteador.Next(100);
            int palpite;
            Console.WriteLine("------ Foi sorteado um valor entre 0 e 100 ------\n");

            do
            {
                Console.ForegroundColor = ConsoleColor.Yellow;
                Console.Write("Digite o seu palpite: ");
                palpite = int.Parse(Console.ReadLine());

                if (palpite > valor)
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine("Seu palpite é muito alto!");
                } else if (palpite < valor)
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine("Seu palpite é muito baixo!");
                } else
                {
                    Console.ForegroundColor = ConsoleColor.Green;
                    Console.Write("\nParabéns!!!! Você acertou o valor!");
                }

            } while (valor != palpite);

            Console.ReadKey();
        }
    }
}
