using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumerosFlutuantes
{
    class Program
    {
        static void Main(string[] args)
        {
            float a = 1.1f;
            double b = 1.1;
            decimal c = 1.1m;

            Console.WriteLine("Float: " + a.ToString("e20"));
            Console.WriteLine("Double: " + b.ToString("e20"));
            Console.WriteLine("Decimal: " + c.ToString("e20"));

            Console.ReadKey();
        }
    }
}
