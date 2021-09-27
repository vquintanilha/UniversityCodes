namespace CadastroFuncionarios.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Seed201909112004 : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Cargoes",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(nullable: false),
                        Atribuicao = c.String(nullable: false),
                        SalarioBase = c.Decimal(nullable: false, precision: 18, scale: 2),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Departamentoes",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(nullable: false),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Cidades",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(nullable: false),
                        Estado = c.String(nullable: false),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Enderecoes",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Rua = c.String(nullable: false),
                        CEP = c.String(),
                        Numero = c.String(),
                        Complemento = c.String(),
                        Cidade_Id = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Cidades", t => t.Cidade_Id, cascadeDelete: true)
                .Index(t => t.Cidade_Id);
            
            CreateTable(
                "dbo.Pessoas",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(nullable: false),
                        CPF = c.String(nullable: false),
                        DataNascimento = c.DateTime(nullable: false),
                        Admissao = c.DateTime(),
                        Demissao = c.DateTime(),
                        Discriminator = c.String(nullable: false, maxLength: 128),
                        Endereco_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Enderecoes", t => t.Endereco_Id)
                .Index(t => t.Endereco_Id);
            
            CreateTable(
                "dbo.Lotacaos",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Salario = c.Decimal(nullable: false, precision: 18, scale: 2),
                        DataInicio = c.DateTime(nullable: false),
                        DataFim = c.DateTime(nullable: false),
                        Cargo_Id = c.Int(nullable: false),
                        Departamento_Id = c.Int(nullable: false),
                        Funcionario_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Cargoes", t => t.Cargo_Id, cascadeDelete: true)
                .ForeignKey("dbo.Departamentoes", t => t.Departamento_Id, cascadeDelete: true)
                .ForeignKey("dbo.Pessoas", t => t.Funcionario_Id)
                .Index(t => t.Cargo_Id)
                .Index(t => t.Departamento_Id)
                .Index(t => t.Funcionario_Id);
            
            CreateTable(
                "dbo.DepartamentoCargoes",
                c => new
                    {
                        Departamento_Id = c.Int(nullable: false),
                        Cargo_Id = c.Int(nullable: false),
                    })
                .PrimaryKey(t => new { t.Departamento_Id, t.Cargo_Id })
                .ForeignKey("dbo.Departamentoes", t => t.Departamento_Id, cascadeDelete: true)
                .ForeignKey("dbo.Cargoes", t => t.Cargo_Id, cascadeDelete: true)
                .Index(t => t.Departamento_Id)
                .Index(t => t.Cargo_Id);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.Pessoas", "Endereco_Id", "dbo.Enderecoes");
            DropForeignKey("dbo.Lotacaos", "Funcionario_Id", "dbo.Pessoas");
            DropForeignKey("dbo.Lotacaos", "Departamento_Id", "dbo.Departamentoes");
            DropForeignKey("dbo.Lotacaos", "Cargo_Id", "dbo.Cargoes");
            DropForeignKey("dbo.Enderecoes", "Cidade_Id", "dbo.Cidades");
            DropForeignKey("dbo.DepartamentoCargoes", "Cargo_Id", "dbo.Cargoes");
            DropForeignKey("dbo.DepartamentoCargoes", "Departamento_Id", "dbo.Departamentoes");
            DropIndex("dbo.DepartamentoCargoes", new[] { "Cargo_Id" });
            DropIndex("dbo.DepartamentoCargoes", new[] { "Departamento_Id" });
            DropIndex("dbo.Lotacaos", new[] { "Funcionario_Id" });
            DropIndex("dbo.Lotacaos", new[] { "Departamento_Id" });
            DropIndex("dbo.Lotacaos", new[] { "Cargo_Id" });
            DropIndex("dbo.Pessoas", new[] { "Endereco_Id" });
            DropIndex("dbo.Enderecoes", new[] { "Cidade_Id" });
            DropTable("dbo.DepartamentoCargoes");
            DropTable("dbo.Lotacaos");
            DropTable("dbo.Pessoas");
            DropTable("dbo.Enderecoes");
            DropTable("dbo.Cidades");
            DropTable("dbo.Departamentoes");
            DropTable("dbo.Cargoes");
        }
    }
}
