using System;
using System.ComponentModel.DataAnnotations;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class PessoaJuridica : Pessoa
    {
        [Required]
        public String CNPJ { get; set; }
        [Required]
        public String RazaoSocial { get; set; }
    }
}
