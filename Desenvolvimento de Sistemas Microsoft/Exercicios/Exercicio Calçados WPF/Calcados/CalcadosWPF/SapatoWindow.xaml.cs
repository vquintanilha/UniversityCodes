using CalcadosWPF.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Forms;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using MessageBox = System.Windows.Forms.MessageBox;

namespace CalcadosWPF
{
    /// <summary>
    /// Lógica interna para SapatoWindow.xaml
    /// </summary>
    public partial class SapatoWindow : Window
    {
        public SapatoViewModel SapatoViewModel { get; set; }

        public SapatoWindow()
        {
            SapatoViewModel = new SapatoViewModel();
            InitializeComponent();
            DataContext = SapatoViewModel;

            if(SapatoViewModel.SapatoSelecionado == null)
            {
                BitmapImage bitmap = new BitmapImage();
                bitmap.BeginInit();
                bitmap.UriSource = new Uri("pack://application:,,,/Imagens/Indisponivel.jpg");
                bitmap.EndInit();
                ImagemModelo.Source = bitmap;
            }
        }

        private void BtnAdicionar_Click(object sender, RoutedEventArgs e)
        {
            SapatoViewModel.Adicionar();
        }

        private void BtnRemover_Click(object sender, RoutedEventArgs e)
        {
            SapatoViewModel.Remover();
        }

        private void BtnSalvar_Click(object sender, RoutedEventArgs e)
        {
            if(SapatoViewModel.SapatoSelecionado != null)
            {
                if(SapatoViewModel.SapatoSelecionado.Modelo == null ||
                   TxtTamanho == null)
                {
                    MessageBox.Show("Por favor, preencha os campos obrigatórios! (*)", "Calçados NosSeusPes");
                }
                else
                {
                    SapatoViewModel.Salvar();
                    this.Close();
                }
            }
            else
            {
                SapatoViewModel.Salvar();
                this.Close();
            }
        }

        private void BtnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void BtnAddModelo_Click(object sender, RoutedEventArgs e)
        {
            ModeloWindow window = new ModeloWindow();
            window.ShowDialog();
        }

        private void BtnSoma_Click(object sender, RoutedEventArgs e)
        {
            int NovaQdt;
            int QdtAtual;
            int QdtAdicional;

            QdtAtual = int.Parse(TxtQtd.Text);
            QdtAdicional = int.Parse(TxtSomaQtd.Text);
                                   
            NovaQdt = QdtAtual + QdtAdicional;

            TxtQtd.Text = NovaQdt.ToString();

            TxtQtd.Focus();
        }

        private void ModeloComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (ModeloComboBox.SelectedValue != null && SapatoViewModel.SapatoSelecionado != null &&
                SapatoViewModel.SapatoSelecionado.Modelo.Fotografia != null)
            {
                BitmapImage bitmap = new BitmapImage();
                bitmap.BeginInit();
                bitmap.UriSource = new Uri(SapatoViewModel.SapatoSelecionado.Modelo.Fotografia);
                bitmap.EndInit();
                ImagemModelo.Source = bitmap;
            }
            else
            {
                BitmapImage bitmap = new BitmapImage();
                bitmap.BeginInit();
                bitmap.UriSource = new Uri("pack://application:,,,/Imagens/Indisponivel.jpg");
                bitmap.EndInit();
                ImagemModelo.Source = bitmap;
            }
        }
    }
}
