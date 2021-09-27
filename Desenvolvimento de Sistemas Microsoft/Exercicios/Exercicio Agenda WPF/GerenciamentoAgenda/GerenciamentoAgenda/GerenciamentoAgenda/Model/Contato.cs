using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GerenciamentoAgenda.Model
{
    public class Contato
    {
        [Required]
        public int Id { get; set; }

        [Required]
        [MaxLength(100)]
        [MinLength(3)]
        public String Nome { get; set; }

        [Required]
        [MaxLength(100)]
        [MinLength(2)]
        public String Sobrenome { get; set; }

        public DateTime DataNascimento { get; set; }

        [MaxLength(20)]
        public String Telefone { get; set; }

        public IList<Compromisso> Compromissos { get; set; }
    }
}
