using Calcados;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcadosWPF.ViewModel
{
    public class ModeloViewModel
    {
        public ObservableCollection<ModeloSapato> ModeloSapatos { get; set; }

        public ModeloSapato ModeloSapatoSelecionado { get; set; }

        private ModelCalcados Context { get; set; }

        public ModeloViewModel()
        {
            Context = new ModelCalcados();
            this.ModeloSapatos = new ObservableCollection<ModeloSapato>(Context.ModeloSapatos.ToList());
            this.ModeloSapatoSelecionado = Context.ModeloSapatos.ToList().FirstOrDefault();
        }

        public void Adicionar()
        {
            ModeloSapato ModeloSapato = new ModeloSapato();
            this.ModeloSapatos.Add(ModeloSapato);
            this.Context.ModeloSapatos.Add(ModeloSapato);
            this.ModeloSapatoSelecionado = ModeloSapato;
        }

        public void Remover()
        {
            if (this.ModeloSapatoSelecionado.Id != 0)
            {
                this.Context.ModeloSapatos.Remove(this.ModeloSapatoSelecionado);
            }
            this.ModeloSapatos.Remove(this.ModeloSapatoSelecionado);
        }

        public Boolean PodeRemover
        {
            get
            {
                return this.ModeloSapatoSelecionado != null;
            }
        }

        internal bool VerificarChaveEstrangeira()
        {
            IList<Sapato> SapatosModelo = Context.Sapatos.Where(sapato => sapato.Modelo.Id == ModeloSapatoSelecionado.Id).ToList();
            if(SapatosModelo.Count() != 0)
            {
                return false;
            }
            else
            {
                return true;
            }
            
        }

        public void Salvar()
        {
            this.Context.SaveChanges();
        }
    }
}