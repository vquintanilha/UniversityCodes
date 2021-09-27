using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GerenciamentoAgenda.Model
{
    public class Compromisso
    {
        [Required]
        public int Id { get; set; }

        [Required]
        [MaxLength(200)]
        [MinLength(5)]
        public String Titulo { get; set; }

        [MaxLength(500)]
        public String Local { get; set; }

        [Required]
        public DateTime DataInicio { get; set; }

        public DateTime DataFim { get; set; }

        public IList<Contato> Participantes { get; set; }
    }
}
