using PassagemAerea;
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

namespace AviacaoWPF
{
    /// <summary>
    /// Interação lógica para MainWindow.xam
    /// </summary>
    public partial class MainWindow : Window
    {
        public String TextoExemplo { get; set; } = "Exemplo";
        
        public MainWindow()
        {
            InitializeComponent();
            this.DataContext = this;
        }

        private void PessoasButton_Click(object sender, RoutedEventArgs e)
        {
            //ModelPassagemAerea ctx = new ModelPassagemAerea();
            //var pessoa = ctx.Pessoas.First();
            WindowPessoa wp = new WindowPessoa();
            //wp.Pessoa = pessoa;
            wp.Show();
        }

        private void CidadesButton_Click(object sender, RoutedEventArgs e)
        {
            WindowCidade wc = new WindowCidade();
            wc.Show();
        }
    }
}
