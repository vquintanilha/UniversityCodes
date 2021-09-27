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
    public class VendaViewModel
    {

        public ObservableCollection<Pessoa> Clientes { get; set; }

        public ObservableCollection<Sapato> Sapatos { get; set; }

        public ObservableCollection<Item> Itens { get; set; }

        public Sapato SapatoSelecionado { get; set; }

        public Item ItemSelecionado { get; set; }

        public Venda Venda { get; set; }

        private ModelCalcados Context { get; set; }

        public VendaViewModel()
        {
            Context = new ModelCalcados();
            Clientes = new ObservableCollection<Pessoa>(Context.Pessoas.ToList());
            Sapatos = new ObservableCollection<Sapato>(Context.Sapatos.Include("Estoque").Include("Modelo").ToList());
            SapatoSelecionado = Context.Sapatos.Include("Estoque").Include("Modelo").ToList().FirstOrDefault();
            Itens = new ObservableCollection<Item>();

            Venda = new Venda();
            Venda.Itens = Itens;
            Venda.DataVenda = DateTime.Now;
            Context.Vendas.Add(Venda);
        }

        internal void AtualizarValores()
        {
            int QtdItens = 0;
            decimal ValorTotal = 0;
            foreach(Item i in Itens)
            {
                QtdItens += i.QtdSapatos;
                ValorTotal += i.QtdSapatos * i.Sapato.Modelo.Preco;
            }
            Venda.QtdItens = QtdItens;
            Venda.ValorTotal = ValorTotal;
        }

        internal void Adicionar()
        {
            Item Item = new Item();
            Itens.Add(Item);
            ItemSelecionado = Item;
        }

        internal void Remover()
        {
            Itens.Remove(ItemSelecionado);
        }

        public void Salvar()
        {
            foreach (Item i in Itens)
            {
                Sapato s = Context.Sapatos.Where(sapato => sapato.Id == i.Sapato.Id).ToList().FirstOrDefault();
                s.Estoque.QtdTotal = s.Estoque.QtdTotal - i.QtdSapatos;
            }
            Context.SaveChanges();
        }

    }
}
