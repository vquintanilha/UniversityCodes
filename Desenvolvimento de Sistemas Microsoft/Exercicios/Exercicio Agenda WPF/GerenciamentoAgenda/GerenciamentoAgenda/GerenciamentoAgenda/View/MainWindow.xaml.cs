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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace GerenciamentoAgenda
{
    /// <summary>
    /// Interação lógica para MainWindow.xam
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            this.DataContext = this;
        }

        private void ContatosButton_Click(object sender, RoutedEventArgs e)
        {
            View.ContatoWindow contato = new View.ContatoWindow();
            contato.Show();
        }

        private void CompromissosButton_Click(object sender, RoutedEventArgs e)
        {
            View.CompromissoWindow compromisso = new View.CompromissoWindow();
            compromisso.Show();
        }

        private void FinalizarButton_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
    }
}
