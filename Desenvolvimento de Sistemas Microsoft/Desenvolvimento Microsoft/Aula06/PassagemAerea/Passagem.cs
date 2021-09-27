using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PassagemAerea
{
    [Table("Passagens")]
    public class Passagem
    {
        public int Id { get; set; }

        public Pessoa Passageiro { get; set; }

        public IList<Voo> Trechos { get; set; }

        public Cidade Origem { get; set; }

        public Cidade Destino { get; set; }

        public FormaDePagamento Pagamento { get; set; }

        public IList<Poltrona> Poltronas { get; set; }
    }
}
