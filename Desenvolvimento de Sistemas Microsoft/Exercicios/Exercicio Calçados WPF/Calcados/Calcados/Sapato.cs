using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class Sapato
    {
        public int Id { get; set; }
        [Required]
        public ModeloSapato Modelo { get; set; }
        [Required]
        public int Tamanho { get; set; }
        public Estoque Estoque { get; set; }
        public String Cor { get; set; }
    }
}
