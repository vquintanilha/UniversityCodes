using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroFuncionarios.Model
{
    public class Cidade
    {
        public int Id { get; set; }

        [Required]
        public String Nome { get; set; }

        [Required]
        public String Estado { get; set; }
    }
}
