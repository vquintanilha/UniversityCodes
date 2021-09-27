namespace ORMEF.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Cidades",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        NOME_CIDADE = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.Pessoas",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nome = c.String(),
                        Nascimento = c.DateTime(nullable: false),
                        Cidade_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Cidades", t => t.Cidade_Id)
                .Index(t => t.Cidade_Id);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.Pessoas", "Cidade_Id", "dbo.Cidades");
            DropIndex("dbo.Pessoas", new[] { "Cidade_Id" });
            DropTable("dbo.Pessoas");
            DropTable("dbo.Cidades");
        }
    }
}
