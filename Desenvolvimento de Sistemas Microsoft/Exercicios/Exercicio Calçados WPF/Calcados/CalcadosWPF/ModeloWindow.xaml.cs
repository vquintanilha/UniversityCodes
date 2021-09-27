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
using System.Windows.Forms;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using MessageBox = System.Windows.MessageBox;

namespace CalcadosWPF
{
    /// <summary>
    /// Lógica interna para Modelo.xaml
    /// </summary>
    public partial class ModeloWindow : Window
    {
        public ModeloViewModel ModeloViewModel { get; set; }

        public ModeloWindow()
        {
            ModeloViewModel = new ModeloViewModel();
            InitializeComponent();
            DataContext = ModeloViewModel;

            if (FotoTextBox.Text == "")
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
            ModeloViewModel.Adicionar();
        }

        private void BtnRemover_Click(object sender, RoutedEventArgs e)
        {
            if (ModeloViewModel.VerificarChaveEstrangeira() == false)
            {
                MessageBox.Show("Existe um sapato cadastrado com este modelo, não foi possível remover!", "Calçados NosSeusPes");
            }
            else
            {
                ModeloViewModel.Remover();
            }
        }

        private void BtnSalvar_Click(object sender, RoutedEventArgs e)
        {
            if (ModeloViewModel.ModeloSapatoSelecionado != null)
            {
                if (ModeloViewModel.ModeloSapatoSelecionado.Nome == null ||
                   ModeloViewModel.ModeloSapatoSelecionado.Material == null ||
                   PrecoTextBox.Text == null)
                {
                    MessageBox.Show("Por favor, preencha os campos obrigatórios! (*)", "Calçados NosSeusPes");
                }
                else
                {
                    ModeloViewModel.Salvar();
                    this.Close();
                }
            }
            else
            {
                ModeloViewModel.Salvar();
                this.Close();
            }
        }

        private void BtnCancelar_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void BtnProcurar_Click(object sender, RoutedEventArgs e)
        {
            OpenFileDialog dlg = new OpenFileDialog();
            dlg.Filter = "Image files (*.jpg)|*.jpg|Image files (*.png)|*.png|All Files (*.*)|*.*";
            dlg.RestoreDirectory = true;

            if (dlg.ShowDialog() == System.Windows.Forms.DialogResult.OK)
            {
                FotoTextBox.Text = dlg.FileName;
                BitmapImage bitmap = new BitmapImage();
                bitmap.BeginInit();
                bitmap.UriSource = new Uri(FotoTextBox.Text);
                bitmap.EndInit();
                ImagemModelo.Source = bitmap;
                FotoTextBox.Focus();
            }
        }

        private void FotoTextBox_TextChanged(object sender, TextChangedEventArgs e)
        {
            if (FotoTextBox.Text != "")
            {
                try
                {
                    BitmapImage bitmap = new BitmapImage();
                    bitmap.BeginInit();
                    bitmap.UriSource = new Uri(FotoTextBox.Text);
                    bitmap.EndInit();
                    ImagemModelo.Source = bitmap;
                }
                catch (Exception)
                {
                    MessageBox.Show("Formato Inválido!", "Calçados NosSeusPes");
                }
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
