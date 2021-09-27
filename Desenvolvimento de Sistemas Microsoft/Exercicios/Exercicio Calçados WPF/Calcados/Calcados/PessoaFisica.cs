using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class PessoaFisica : Pessoa
    {
        [Required]
        public String CPF { get; set; }
        [Required]
        public DateTime Nascimento { get; set; }
    }
}
