using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calcados
{
    public class Venda
    {
        public int Id { get; set; }
        [Required]
        public int QtdItens { get; set; }
        [Required]
        public decimal ValorTotal { get; set; }
        [Required]
        public Pessoa Cliente { get; set; }
        [Required]
        public DateTime DataVenda { get; set; }
        [Required]
        public IList<Item> Itens { get; set; }
    }
}
