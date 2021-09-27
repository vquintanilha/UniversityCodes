using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Contador
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine("7+10 = " + Somar(7, 10));

            Console.ForegroundColor = ConsoleColor.Red;
            Console.Write("Digite o valor 1: ");
            String n1 = Console.ReadLine();
            Console.ForegroundColor = ConsoleColor.Yellow;
            Console.Write("Digite o valor 2: ");
            String n2 = Console.ReadLine();
            int numero1 = int.Parse(n1);
            int numero2 = int.Parse(n2);

            Console.ForegroundColor = ConsoleColor.Green;
            int resultado = Somar(numero1, numero2);
            Console.WriteLine(n1 + " + " + n2 + " = " + resultado);

            if (resultado < 10)
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.WriteLine("Pequeno");
            }
            else if (resultado < 100)
            {
                Console.ForegroundColor = ConsoleColor.Yellow;
                Console.WriteLine("Médio");
            }
            else
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine("Grande");
            }

            switch (resultado)
            {
                case 10:
                    Console.WriteLine("Ótimo");
                    break;

                case 0:
                    Console.WriteLine("Péssimo");
                    break;

                default:
                    Console.WriteLine("Inexistente");
                    break;
            }

            Console.ReadKey();
        }

        static int Somar(int a, int b)
        {
            return a + b;
        }
    }
}
