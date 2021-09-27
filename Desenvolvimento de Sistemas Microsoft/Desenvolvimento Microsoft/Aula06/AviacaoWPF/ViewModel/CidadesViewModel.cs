using PassagemAerea;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AviacaoWPF.ViewModel
{
    public class CidadesViewModel
    {

        public ObservableCollection<Cidade> Cidades { get; set; }

        public Cidade CidadeSelecionada { get; set; }

        private ModelPassagemAerea context { get; set; }

        public CidadesViewModel()
        {
            context = new ModelPassagemAerea();
            this.Cidades = new ObservableCollection<Cidade>(context.Cidades.ToList());
            this.CidadeSelecionada = context.Cidades.FirstOrDefault();
        }

        public Boolean PodeRemover
        {
            get
            {
                return this.CidadeSelecionada != null;
            }
        }

        public void Adicionar()
        {
            Cidade c = new Cidade();
            this.Cidades.Add(c);
            this.context.Cidades.Add(c);
            this.CidadeSelecionada = c;
        }

        public void Remover()
        {
            if(this.CidadeSelecionada.Id != 0)
            {
                this.context.Cidades.Remove(this.CidadeSelecionada);
            }
            this.Cidades.Remove(this.CidadeSelecionada);
        }

        public void Salvar()
        {
            this.context.SaveChanges();
        }
    }
}
