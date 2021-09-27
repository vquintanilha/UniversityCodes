using Calcados;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Data.Entity;
using System.Text;
using System.Threading.Tasks;

namespace CalcadosWPF.ViewModel
{
    public class SapatoViewModel
    {
        public ObservableCollection<Sapato> Sapatos { get; set; }

        public ObservableCollection<ModeloSapato> Modelos { get; set; }

        public Sapato SapatoSelecionado { get; set; }

        private ModelCalcados Context { get; set; }

        public SapatoViewModel()
        {
            Context = new ModelCalcados();
            this.Sapatos = new ObservableCollection<Sapato>(Context.Sapatos.Include("Modelo").Include("Estoque").ToList());
            this.SapatoSelecionado = Context.Sapatos.Include("Modelo").Include("Estoque").ToList().FirstOrDefault();
            this.Modelos = new ObservableCollection<ModeloSapato>(Context.ModeloSapatos.ToList());
        }

        public void Adicionar()
        {
            Sapato Sapato = new Sapato();
            Estoque Estoque = new Estoque();
            Sapato.Estoque = Estoque;
            this.Sapatos.Add(Sapato);
            this.Context.Sapatos.Add(Sapato);
            this.SapatoSelecionado = Sapato;
        }

        public void Remover()
        {
            if (this.SapatoSelecionado.Id != 0)
            {
                this.Context.Sapatos.Remove(this.SapatoSelecionado);
            }
            this.Sapatos.Remove(this.SapatoSelecionado);
        }

        public Boolean PodeRemover
        {
            get
            {
                return this.SapatoSelecionado != null;
            }
        }

        public void Salvar()
        {
            this.Context.SaveChanges();
        }

    }
}
