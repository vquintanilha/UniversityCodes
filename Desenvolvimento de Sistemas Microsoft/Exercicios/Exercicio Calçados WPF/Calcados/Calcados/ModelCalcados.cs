namespace Calcados
{
    using System;
    using System.Data.Entity;
    using System.Data.Entity.ModelConfiguration.Conventions;
    using System.Linq;

    public class ModelCalcados : DbContext
    {
        public ModelCalcados()
            : base("name=ModelCalcados")
        {
        }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Conventions.Remove<PluralizingTableNameConvention>();
        }

        public virtual DbSet<Endereco> Enderecos { get; set; }
        public virtual DbSet<Pessoa> Pessoas { get; set; }
        public virtual DbSet<PessoaJuridica> PessoasJuridicas { get; set; }
        public virtual DbSet<PessoaFisica> PessoasFisicas { get; set; }
        public virtual DbSet<ModeloSapato> ModeloSapatos { get; set; }
        public virtual DbSet<Sapato> Sapatos { get; set; }
        public virtual DbSet<Estoque> Estoques { get; set; }
        public virtual DbSet<Item> Itens { get; set; }
        public virtual DbSet<Venda> Vendas { get; set; }
    }
}