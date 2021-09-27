using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmpresaAerea
{
    public class Pessoa
    {
        public int id { get; set; }
        public String Nome { get; set; }

        public String Sobrenome { get; set; }

        public String Documento { get; set; }

        public DateTime Nascimento { get; set; }

        public String Telefone { get; set; }
    }
}
