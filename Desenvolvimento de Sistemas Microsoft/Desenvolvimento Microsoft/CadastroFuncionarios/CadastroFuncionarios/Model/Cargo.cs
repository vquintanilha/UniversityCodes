using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroFuncionarios.Model
{
    public class Cargo
    {
        public int Id { get; set; }

        [Required]
        public String Nome { get; set; }

        [Required]
        public String Atribuicao { get; set; }

        public decimal SalarioBase { get; set; }

        public IList<Departamento> Departamentos { get; set; }
    }
}
