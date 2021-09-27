namespace PassagemAerea
{
    using System;
    using System.Data.Entity;
    using System.Linq;

    public class ModelPassagemAerea : DbContext
    {
        public ModelPassagemAerea()
            : base("name=ModelPassagemAerea")
        {
        }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Passagem>()
                .HasOptional<FormaDePagamento>(p => p.Pagamento)
                .WithOptionalPrincipal(f => f.Passagem);
            modelBuilder.Entity<Voo>()
                .HasRequired<Cidade>(v => v.Origem)
                .WithMany(c => c.Partidas)
                .WillCascadeOnDelete(false);
            modelBuilder.Entity<Voo>()
                .HasRequired<Cidade>(v => v.Destino)
                .WithMany(c => c.Chegadas)
                .WillCascadeOnDelete(false);
        }

        public virtual DbSet<Pessoa> Pessoas { get; set; }

        public virtual DbSet<Cidade> Cidades { get; set; }
    }
}