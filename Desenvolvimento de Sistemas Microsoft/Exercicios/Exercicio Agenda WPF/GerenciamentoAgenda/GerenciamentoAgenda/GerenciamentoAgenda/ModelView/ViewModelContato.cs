using GerenciamentoAgenda.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GerenciamentoAgenda.ModelView
{
    public class ViewModelContato
    {
        public ObservableCollection<Contato> Contatos { get; set; }

        public Contato ContatoSelecionado { get; set; }

        private ModelAgenda context { get; set; }

        public ViewModelContato()
        {
            context = new ModelAgenda();
            this.Contatos = new ObservableCollection<Contato>(context.Contatos.ToList());
            this.ContatoSelecionado = context.Contatos.Include("Compromissos").ToList().FirstOrDefault();
        }

        public void Adicionar()
        {
            Contato c = new Contato();
            c.DataNascimento = DateTime.Now;
            this.Contatos.Add(c);
            this.context.Contatos.Add(c);
            this.ContatoSelecionado = c;
        }

        public void Remover()
        {
            if(this.ContatoSelecionado.Id != 0 )
            {
                this.context.Contatos.Remove(this.ContatoSelecionado);
            }
            this.Contatos.Remove(this.ContatoSelecionado);
        }

        public Boolean PodeRemover
        {
            get
            {
                return this.ContatoSelecionado != null;
            }
        }

        public void Salvar()
        {
            this.context.SaveChanges();
        }

    }
}
