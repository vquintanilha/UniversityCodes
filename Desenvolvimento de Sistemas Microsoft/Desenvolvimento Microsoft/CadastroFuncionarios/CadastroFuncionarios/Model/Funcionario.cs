using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroFuncionarios.Model
{
    public class Funcionario : Pessoa
    {
        [Required]
        public DateTime Admissao { get; set; }

        public DateTime Demissao { get; set; }

        public IList<Lotacao> Lotacoes { get; set; }
    }
}
