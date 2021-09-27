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
    /// Interaction logic for ClienteWindow.xaml
    /// </summary>
    public partial class ClienteWindow : Window
    {
        public ClienteViewModel ClienteViewModel { get; set; }

        public ClienteWindow()
        {
            ClienteViewModel = new ClienteViewModel();
            InitializeComponent();
            DataContext = ClienteViewModel;
        }

        private void BtnAdicionarPF_Click(object sender, RoutedEventArgs e)
        {
            ClienteViewModel.AdicionarPF();
        }

        private void BtnAdicionarPJ_Click(object sender, RoutedEventArgs e)
        {
            ClienteViewModel.AdicionarPJ();
        }

        private void BtnRemover_Click(object sender, RoutedEventArgs e)
        {
            ClienteViewModel.Remover();
        }

        private void BtnEndereco_Click(object sender, RoutedEventArgs e)
        {
            EnderecoWindow window = new EnderecoWindow();
            ClienteViewModel.PessoaSelecionada.Endereco = window.ShowDialog();
            if(ClienteViewModel.PessoaSelecionada.Endereco != null)
            {
                EnderecoToString(ClienteViewModel.PessoaSelecionada);
            }
        }

        private void BtnSalvar_Click(object sender, RoutedEventArgs e)
        {
            if(ClienteViewModel.PessoaSelecionada != null)
            {
                if(ClienteViewModel.PessoaSelecionada.Nome == null ||
                   ClienteViewModel.PessoaSelecionada.Endereco == null)
                {
                    MessageBox.Show("Por favor, preencha os campos obrigatórios! (*)", "Calçados NosSeusPes");
                }
                else
                {
                    ClienteViewModel.Salvar();
                    this.Close();
                }
            }
            else
            {
                ClienteViewModel.Salvar();
                this.Close();
            }
        }

        private void BtnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void PessoasDataGrid_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            Pessoa p = ClienteViewModel.PessoaSelecionada;
            if (p != null)
            {
                EnderecoToString(p);
            }
            UserControl page = PessoaViewFactory.VisualizarPessoa(p);
            while (PessoaContent.Children.Count > 0)
            {
                PessoaContent.Children.RemoveAt(0);
            }
            if (page != null)
            {
                PessoaContent.Children.Add(page);
            }
        }

        private void EnderecoToString(Pessoa p)
        {
            if (p.Endereco == null)
            {
                TxtEndereco.Text = "";
            }
            else
            {
                String Rua = p.Endereco.Rua;
                String CEP = p.Endereco.CEP;
                String Numero = p.Endereco.Numero;
                String Complemento = p.Endereco.Complemento;
                String Cidade = p.Endereco.Cidade;
                String Estado = p.Endereco.Estado;
                TxtEndereco.Text = (Rua + ", " + Numero + ", " + Complemento + " - " + CEP + " - " + Cidade + "/" + Estado);
            }
        }
    }

    public class PessoaViewFactory
    {
        static public UserControl VisualizarPessoa(Pessoa pessoa)
        {
            if (pessoa is PessoaFisica)
            {
                var pg = new PessoaFisicaUC();
                pg.Pessoa = (PessoaFisica)pessoa;
                return pg;
            }
            else if (pessoa is PessoaJuridica)
            {
                var pg = new PessoaJuridicaUC();
                pg.Pessoa = (PessoaJuridica)pessoa;
                return pg;
            }
            return null;
        }   
    }

}
