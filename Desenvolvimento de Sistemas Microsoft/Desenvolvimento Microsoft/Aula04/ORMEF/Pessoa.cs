using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ORMEF
{
    public class Pessoa
    {
        public int Id { get; set; }

        public String Nome { get; set; }

        public DateTime Nascimento { get; set; }

        public Cidade Cidade { get; set; }

        public Cidade LocalNascimento { get; set; }

        //TODO:VERIFIQUEM
        public int Idade {
            get {
                int idade = (DateTime.Now.Year - this.Nascimento.Year);
                if(DateTime.Now.Month >= this.Nascimento.Month)
                {
                    if(DateTime.Now.Month == this.Nascimento.Month)
                    {
                        if (DateTime.Now.Day >= this.Nascimento.Day)
                        {
                            return idade;
                        }
                    }
                }
                return idade - 1;
            }
        }

        [InverseProperty("Moradores")]
        public IList<Casa> Casas { get; set; }
    }
}
