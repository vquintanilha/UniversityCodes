using Calcados;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcadosWPF.ViewModel
{
    public class EnderecoViewModel
    {
        public Endereco Endereco { get; set; }
        
        public EnderecoViewModel()
        {
            Endereco = new Endereco();
        }
    }
}
