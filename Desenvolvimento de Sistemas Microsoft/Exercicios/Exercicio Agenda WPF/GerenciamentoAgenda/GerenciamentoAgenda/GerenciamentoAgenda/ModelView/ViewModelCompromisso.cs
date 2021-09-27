using GerenciamentoAgenda.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GerenciamentoAgenda.ModelView
{
    public class ViewModelCompromisso
    {
        public ObservableCollection<Compromisso> Compromissos { get; set; }

        public Compromisso CompromissoSelecionado { get; set; }

        public ObservableCollection<Contato> Contatos { get; set; }

        private ModelAgenda context { get; set; }

        public ViewModelCompromisso()
        {
            context = new ModelAgenda();
            this.Compromissos = new ObservableCollection<Compromisso>(context.Compromissos.ToList());
            this.CompromissoSelecionado = context.Compromissos.Include("Participantes").ToList().FirstOrDefault();
            this.Contatos = new ObservableCollection<Contato>(context.Contatos.ToList());
        }

        public void Adicionar()
        {
            Compromisso c = new Compromisso();
            c.DataInicio = DateTime.Now;
            c.DataFim = DateTime.Now;
            this.Compromissos.Add(c);
            this.context.Compromissos.Add(c);
            this.CompromissoSelecionado = c;
        }

        public void SelecionarParticipantes(ObservableCollection<Contato> contatosSelecionados)
        {
            this.CompromissoSelecionado.Participantes = contatosSelecionados;
        }

        public void Remover()
        {
            if(this.CompromissoSelecionado.Id != 0)
            {
                this.context.Compromissos.Remove(
                    this.CompromissoSelecionado);
            }
            this.Compromissos.Remove(this.CompromissoSelecionado);
        }

        public Boolean PodeRemover
        {
            get
            {
                return this.CompromissoSelecionado != null;
            }
        }

        public void Salvar()
        {
            this.context.SaveChanges();
        }

    }
}
