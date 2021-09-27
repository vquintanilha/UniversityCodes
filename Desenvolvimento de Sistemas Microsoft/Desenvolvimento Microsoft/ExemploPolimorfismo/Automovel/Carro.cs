using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Automovel
{
    class Carro
    {
        Motor Motor { get; set; }

        public int Portas { get; set; }

        public DateTime Fabricacao { get; set; }

        public CorCarro Cor { get; set; }

    }
}
