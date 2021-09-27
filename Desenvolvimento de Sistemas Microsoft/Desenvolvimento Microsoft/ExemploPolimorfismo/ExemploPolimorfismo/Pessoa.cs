using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExemploPolimorfismo
{
    public class Pessoa
    {
        public String Nome { get; set; }

        public virtual void Falar()
        {
            Console.WriteLine("Uma Pessoa que Fala.");
        }

        public void Falar(String Mensagem)
        {
            Console.WriteLine("Uma Pessoa que Fala: " + Mensagem);
        }

        public override string ToString()
        {
            return this.Nome;
        }

    }
}
