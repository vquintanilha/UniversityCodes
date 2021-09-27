using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmpresaAerea
{
    public class Voo
    {
        public int id { get; set; }

        public DateTime InicioPrevisto { get; set; }

        public DateTime InicioReal { get; set; }

        public DateTime ChegadaPrevista { get; set; }

        public DateTime ChegadaReal { get; set; }
    }
}
