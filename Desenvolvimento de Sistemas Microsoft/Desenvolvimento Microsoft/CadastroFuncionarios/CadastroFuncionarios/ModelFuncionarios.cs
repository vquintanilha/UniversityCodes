namespace CadastroFuncionarios
{
    using CadastroFuncionarios.Model;
    using System;
    using System.Data.Entity;
    using System.Linq;

    public class ModelFuncionarios : DbContext
    {

        public ModelFuncionarios()
            : base("name=ModelFuncionarios")
        {
        }

        public virtual DbSet<Cargo> Cargos { get; set; }

        public virtual DbSet<Cidade> Cidades { get; set; }

        public virtual DbSet<Departamento> Departamentos { get; set; }

        public virtual DbSet<Endereco> Enderecos { get; set; }

        public virtual DbSet<Funcionario> Funcionarios { get; set; }

        public virtual DbSet<Lotacao> Lotacoes { get; set; }

        public virtual DbSet<Pessoa> Pessoas { get; set; }

    }

}