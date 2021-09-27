using CalcadosWPF.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace CalcadosWPF
{
    /// <summary>
    /// Interaction logic for VendaWindow.xaml
    /// </summary>
    public partial class VendaWindow : Window
    {
        public VendaViewModel VendaViewModel { get; set; }

        public VendaWindow()
        {
            VendaViewModel = new VendaViewModel();
            InitializeComponent();
            DataContext = VendaViewModel;
        }

        private void BtnAdicionar_Click(object sender, RoutedEventArgs e)
        {
            VendaViewModel.Adicionar();
        }

        private void BtnRemover_Click(object sender, RoutedEventArgs e)
        {
            VendaViewModel.Remover();
        }

        private void BtnSalvar_Click(object sender, RoutedEventArgs e)
        {
            if (VendaViewModel.Venda.Cliente == null)
            {
                MessageBox.Show("Por favor, selecione o comprador!", "Calçados NosSeusPes");
            }
            else if (VendaViewModel.Venda.Itens == null ||
                     VendaViewModel.SapatoSelecionado == null ||
                     VendaViewModel.Venda.QtdItens <= 0)
            {
                MessageBox.Show("Por favor, preenha todos os campos!", "Calçados NosSeusPes");
            }
            else
            {
                VendaViewModel.Salvar();
                this.Close();
            }
        }

        private void BtnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void DataGridVenda_CellEditEnding(object sender, DataGridCellEditEndingEventArgs e)
        {
            if (VendaViewModel.ItemSelecionado.Sapato != null && 
                VendaViewModel.ItemSelecionado.QtdSapatos != 0 &&
                VendaViewModel.ItemSelecionado.Sapato.Estoque.QtdTotal != 0 &&
                VendaViewModel.ItemSelecionado.Sapato.Estoque.QtdTotal > VendaViewModel.ItemSelecionado.QtdSapatos)
            {
                VendaViewModel.AtualizarValores();
                TxtValorTotal.Text = "R$ " + VendaViewModel.Venda.ValorTotal.ToString();
            }
            else if(VendaViewModel.ItemSelecionado.Sapato.Estoque.QtdTotal == 0)
            {
                MessageBox.Show("Desculpe, infelizmente não temos esse produto em estoque! )=", "Indisponível");
            }
            else if(VendaViewModel.ItemSelecionado.Sapato.Estoque.QtdTotal < VendaViewModel.ItemSelecionado.QtdSapatos)
            {
                MessageBox.Show("Desculpe, não temos essa quantidade em estoque! )=", "Indisponível");
            }
        }
    }
}
