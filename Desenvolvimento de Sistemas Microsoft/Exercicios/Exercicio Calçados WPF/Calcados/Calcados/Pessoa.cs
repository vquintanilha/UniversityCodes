using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public abstract class Pessoa
    {
        public int Id { get; set; }
        [Required]
        public String Nome { get; set; }
        [Required]
        public Endereco Endereco { get; set; }
        public IList<Venda> Compras { get; set; }
    }
}
