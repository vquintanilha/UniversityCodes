using CadastroFuncionarios.View;
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

namespace CadastroFuncionarios
{
    /// <summary>
    /// Interação lógica para MainWindow.xam
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void CargosMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new CargoWindow();
            window.Show();
        }

        private void DepartamentosMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new DepartamentoWindow();
            window.Show();
        }

        private void FuncionariosMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new FuncionarioWindow();
            window.Show();
        }

        private void CidadesMenu_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}
