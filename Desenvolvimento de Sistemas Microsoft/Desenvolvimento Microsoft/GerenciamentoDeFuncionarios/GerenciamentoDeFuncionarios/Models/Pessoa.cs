using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace GerenciamentoDeFuncionarios.Models
{
    public class Pessoa
    {
        [Key]
        public int Id { get; set; }
        [Required]
        [MinLength(2)]
        public String Nome { get; set; }
        public DateTime Nascimento { get; set; }
    }
}
