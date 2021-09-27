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

namespace GerenciamentoAgenda.View
{
    /// <summary>
    /// Lógica interna para ContatoWindow.xaml
    /// </summary>
    public partial class ContatoWindow : Window
    {
        public ModelView.ViewModelContato ContatosViewModel { get; set; }

        public ModelView.ViewModelCompromisso CompromissosViewModel { get; set; }

        public ContatoWindow()
        {
            InitializeComponent();
            this.ContatosViewModel = new ModelView.ViewModelContato();
            this.CompromissosViewModel = new ModelView.ViewModelCompromisso();
            this.DataContext = this;
        }

        private void AdicionarButton_Click(object sender, RoutedEventArgs e)
        {
            this.ContatosViewModel.Adicionar();
        }

        private void RemoverButton_Click(object sender, RoutedEventArgs e)
        {
            this.ContatosViewModel.Remover();
        }

        private void SalvarButton_Click(object sender, RoutedEventArgs e)
        {
            this.ContatosViewModel.Salvar();
            this.Close();
        }

        private void CancelarButton_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
