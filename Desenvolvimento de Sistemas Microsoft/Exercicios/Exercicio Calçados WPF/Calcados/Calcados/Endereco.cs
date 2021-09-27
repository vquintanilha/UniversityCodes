using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class Endereco
    {
        public int Id { get; set; }
        [Required]
        public String Rua { get; set; }
        [Required]
        public String CEP { get; set; }
        public String Numero { get; set; }
        public String Complemento { get; set; }
        [Required]
        public String Cidade { get; set; }
        [Required]
        public String Estado { get; set; }
    }
}
