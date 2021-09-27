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

namespace CalcadosWPF
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void ClientesMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new ClienteWindow();
            window.ShowDialog();
        }

        private void SapatosMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new SapatoWindow();
            window.ShowDialog();
        }
               
        private void VendasMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new VendaWindow();
            window.ShowDialog();
        }

        private void ModelosMenu_Click(object sender, RoutedEventArgs e)
        {
            Window window = new ModeloWindow();
            window.ShowDialog();
        }
    }
}
