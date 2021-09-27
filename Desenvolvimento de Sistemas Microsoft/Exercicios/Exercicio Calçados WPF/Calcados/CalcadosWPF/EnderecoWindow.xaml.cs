using Calcados;
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
    /// Interaction logic for EnderecoWindow.xaml
    /// </summary>
    public partial class EnderecoWindow : Window
    {
        public EnderecoViewModel EnderecoViewModel { get; set; }

        public EnderecoWindow()
        {
            EnderecoViewModel = new EnderecoViewModel();
            InitializeComponent();
            DataContext = EnderecoViewModel;
        }

        private Endereco Endereco;

        public new Endereco ShowDialog()
        {
            base.ShowDialog();
            return Endereco;
        }

        private void BtnOk_Click(object sender, RoutedEventArgs e)
        {
            if (EnderecoViewModel.Endereco.Rua == null ||
                EnderecoViewModel.Endereco.CEP == null ||
                EnderecoViewModel.Endereco.Cidade == null ||
                EnderecoViewModel.Endereco.Estado == null)
            {
                MessageBox.Show("Por favor, preencha os campos obrigatórios! (*)", "Calçados NosSeusPes");
            }
            else
            {
                Endereco = EnderecoViewModel.Endereco;
                this.Close();
            }
        }
    }
}
