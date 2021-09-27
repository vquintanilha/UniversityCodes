using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroFuncionarios.Model
{
    public class Departamento
    {
        public int Id { get; set; }

        [Required]
        public String Nome { get; set; }

        public IList<Cargo> Cargos { get; set; }
    }
}
