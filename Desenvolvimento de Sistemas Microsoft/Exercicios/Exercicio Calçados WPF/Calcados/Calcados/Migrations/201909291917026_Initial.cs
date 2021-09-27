namespace Calcados.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Endereco",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Rua = c.String(nullable: false),
                        CEP = c.String(nullable: false),
                        Numero = c.String(),
                        Complemento = c.String(),
                        Cidade = c.String(),
                        Estado = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Estoque",
                c => new
                    {
                        Id = c.Int(nullable: false),
                        Quantidade = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Sapato", t => t.Id)
                .Index(t => t.Id);
            
            CreateTable(
                "dbo.Sapato",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Tamanho = c.Int(nullable: false),
                        Cor = c.String(),
                        Modelo_Id = c.Int(),
                        Venda_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.ModeloSapato", t => t.Modelo_Id)
                .ForeignKey("dbo.Venda", t => t.Venda_Id)
                .Index(t => t.Modelo_Id)
                .Index(t => t.Venda_Id);
            
            CreateTable(
                "dbo.ModeloSapato",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(nullable: false),
                        Cadarco = c.Boolean(nullable: false),
                        Material = c.String(nullable: false),
                        Preco = c.Decimal(nullable: false, precision: 18, scale: 2),
                        Fotografia = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Pessoa",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(nullable: false),
                        CPF = c.String(),
                        Nascimento = c.DateTime(),
                        CNPJ = c.String(),
                        RazaoSocial = c.String(),
                        Discriminator = c.String(nullable: false, maxLength: 128),
                        Endereco_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Endereco", t => t.Endereco_Id)
                .Index(t => t.Endereco_Id);
            
            CreateTable(
                "dbo.Venda",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        QtdItens = c.Int(nullable: false),
                        ValorTotal = c.Int(nullable: false),
                        DataVenda = c.DateTime(nullable: false),
                        Cliente_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Pessoa", t => t.Cliente_Id)
                .Index(t => t.Cliente_Id);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.Pessoa", "Endereco_Id", "dbo.Endereco");
            DropForeignKey("dbo.Sapato", "Venda_Id", "dbo.Venda");
            DropForeignKey("dbo.Venda", "Cliente_Id", "dbo.Pessoa");
            DropForeignKey("dbo.Estoque", "Id", "dbo.Sapato");
            DropForeignKey("dbo.Sapato", "Modelo_Id", "dbo.ModeloSapato");
            DropIndex("dbo.Venda", new[] { "Cliente_Id" });
            DropIndex("dbo.Pessoa", new[] { "Endereco_Id" });
            DropIndex("dbo.Sapato", new[] { "Venda_Id" });
            DropIndex("dbo.Sapato", new[] { "Modelo_Id" });
            DropIndex("dbo.Estoque", new[] { "Id" });
            DropTable("dbo.Venda");
            DropTable("dbo.Pessoa");
            DropTable("dbo.ModeloSapato");
            DropTable("dbo.Sapato");
            DropTable("dbo.Estoque");
            DropTable("dbo.Endereco");
        }
    }
}
