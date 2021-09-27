using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EditorDeArquivo
{
    public class Editor
    {

        private static String ObterCaminhoArquivo()
        {
            Console.Write("Qual o caminho do arquivo: ");
            return Console.ReadLine();
        }

        public static void LerArquivo()
        {
            String path = ObterCaminhoArquivo();
            try
            {
                String[] linhas = System.IO.File.ReadAllLines(path);
                foreach (string linha in linhas)
                {
                    Console.WriteLine(linha);
                }
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
            
        }

        public static void EditarArquivo()
        {
            String path = ObterCaminhoArquivo();
            try
            {
                String novoTexto = Console.ReadLine();
                System.IO.File.WriteAllText(path, novoTexto);
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

    }
}
