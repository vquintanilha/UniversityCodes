using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class Estoque
    {
        public int Id { get; set; }
        [Required]
        public Sapato Sapato { get; set; }
        [Required]
        public int QtdTotal { get; set; }
    }
}
