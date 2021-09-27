using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class ModeloSapato
    {
        public int Id { get; set; }
        [Required]
        public String Nome { get; set; }
        [Required]
        public Boolean Cadarco { get; set; }
        [Required]
        public String Material { get; set; }
        [Required]
        public Decimal Preco { get; set; }
        public String Fotografia { get; set; }
    }
}
