using GerenciamentoAgenda.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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

namespace GerenciamentoAgenda.View
{
    /// <summary>
    /// Lógica interna para CompromissoWindow.xaml
    /// </summary>
    public partial class CompromissoWindow : Window
    {
        public ModelView.ViewModelCompromisso CompromissosViewModel { get; set; }

        public ModelView.ViewModelContato ContatosViewModel { get; set; }

        public ObservableCollection<Contato> ContatosSelecionados { get; set; }

        public CompromissoWindow()
        {
            InitializeComponent();
            this.CompromissosViewModel = new ModelView.ViewModelCompromisso();
            this.ContatosViewModel = new ModelView.ViewModelContato();
            this.DataContext = this;
        }

        private void AdicionarButton_Click(object sender, RoutedEventArgs e)
        {
            this.CompromissosViewModel.Adicionar();
        }

        private void RemoverButton_Click(object sender, RoutedEventArgs e)
        {
            this.CompromissosViewModel.Remover();
        }

        private void SalvarButton_Click(object sender, RoutedEventArgs e)
        {
            this.CompromissosViewModel.Salvar();
            this.Close();
        }

        private void CancelarButton_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }

        private void SelecionarButton_Click(object sender, RoutedEventArgs e)
        {
            this.ContatosSelecionados = new ObservableCollection<Contato>();
            foreach (Contato item in ListViewParticipantes.SelectedItems)
            {
                this.ContatosSelecionados.Add(item);
            }
            this.CompromissosViewModel.SelecionarParticipantes(this.ContatosSelecionados);
        }
    }
}
