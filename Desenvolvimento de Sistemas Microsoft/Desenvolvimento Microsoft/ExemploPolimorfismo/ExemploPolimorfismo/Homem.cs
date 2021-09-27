using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploPolimorfismo
{
    public class Homem : Pessoa
    {
        public override void Falar()
        {
            Console.WriteLine("Um Homem que Fala.");
        }

        public void ModoTroglodita()
        {
            Console.WriteLine("#@&(*!#!!@#*(@");
        }

    }
}
