using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploPolimorfismo
{
    public class Mulher : Pessoa
    {
        public override void Falar()
        {
            var oldColor = Console.BackgroundColor;
            Console.BackgroundColor = ConsoleColor.Red;
            base.Falar();
            Console.BackgroundColor = oldColor;
        }

        public void ModoFofoqueira()
        {
            Console.WriteLine("BLABLABLABLABLA");
        }

    }
}
