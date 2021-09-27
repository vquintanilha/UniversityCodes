using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Automovel
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Corsa c = new Corsa();
                Corsa d = null;
                d.Cor = CorCarro.Preto;
            }
            catch(NullReferenceException e)
            {
                Console.WriteLine("Problema na execução do código. A aplicação será fechada.");
            }
            finally{
                Console.ReadKey();
            }
            
        }
    }
}
