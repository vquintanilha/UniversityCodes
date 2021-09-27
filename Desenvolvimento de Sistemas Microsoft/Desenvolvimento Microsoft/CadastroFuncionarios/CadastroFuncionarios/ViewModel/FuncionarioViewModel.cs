using CadastroFuncionarios.Model;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroFuncionarios.ViewModel
{
    public class FuncionarioViewModel
    {
        public Funcionario Funcionario { get; set; }

        public IList<Departamento> Departamentos { get; set; }

        public IList<Cargo> Cargos { get; set; }

        private ModelFuncionarios Context = new ModelFuncionarios();

        public FuncionarioViewModel()
        {
            this.Funcionario = new Funcionario()
            {
                Nome = "Fulano de Tal",
                CPF = "111.111.111-22",
                Admissao = new DateTime(2018, 01, 01)
            };
            this.Funcionario.Lotacoes = new List<Lotacao>();
            Departamento departamento = Context.
                Departamentos.Where(d =>
                    d.Nome.Contains("Banco de Dados")).
                    FirstOrDefault();
            Cargo cargo = new Cargo()
            {
                Nome = "Chefe"
            };
            Cargo cargo2 = new Cargo()
            {
                Nome = "Auxiliar"
            };
            Lotacao l1 = new Lotacao();
            l1.Cargo = cargo2;
            l1.Departamento = departamento;
            l1.DataInicio = new DateTime(2018, 01, 01);
            l1.DataFim = new DateTime(2018, 12, 31);
            this.Funcionario.Lotacoes.Add(l1);

            Lotacao l2 = new Lotacao();
            l2.Cargo = cargo;
            l2.Departamento = departamento;
            l2.DataInicio = new DateTime(2019, 01, 01);
            this.Funcionario.Lotacoes.Add(l2);
            this.Departamentos = Context
                .Departamentos.ToList();

            this.Cargos = Context.Cargos.ToList();

            //Context = new ModelFuncionarios();
            //this.Departamentos = context.Departamentos.ToList();
            //this.Cargos = Context.Cargos.ToList();
            //this.Funcionario = Context.Funcionarios.FirstOrDefault();
        }

        public void Salvar()
        {
            this.Context.SaveChanges();
        }

    }
}
