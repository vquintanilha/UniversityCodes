using Calcados;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcadosWPF.ViewModel
{
    public class ClienteViewModel
    {
        public ObservableCollection<Pessoa> Pessoas { get; set; }

        public Pessoa PessoaSelecionada { get; set; }

        private ModelCalcados Context { get; set; }

        public ClienteViewModel()
        {
            Context = new ModelCalcados();
            this.Pessoas = new ObservableCollection<Pessoa>(Context.Pessoas.Include("Compras").Include("Endereco").ToList());
            this.PessoaSelecionada = Context.Pessoas.Include("Compras").Include("Endereco").ToList().FirstOrDefault();
        }
        
        public void AdicionarPF()
        {
            PessoaFisica pf = new PessoaFisica();
            pf.Nascimento = DateTime.Now;
            this.Pessoas.Add(pf);
            this.Context.Pessoas.Add(pf);
            this.PessoaSelecionada = pf;
        }

        public void AdicionarPJ()
        {
            PessoaJuridica pj = new PessoaJuridica();
            this.Pessoas.Add(pj);
            this.Context.Pessoas.Add(pj);
            this.PessoaSelecionada = pj;
        }

        public void Remover()
        {
            if (this.PessoaSelecionada.Id != 0)
            {
                this.Context.Pessoas.Remove(this.PessoaSelecionada);
            }
            this.Pessoas.Remove(this.PessoaSelecionada);
        }

        public Boolean PodeRemover
        {
            get
            {
                return this.PessoaSelecionada != null;
            }
        }

        public void Salvar()
        {
            this.Context.SaveChanges();
        }
    }
}
