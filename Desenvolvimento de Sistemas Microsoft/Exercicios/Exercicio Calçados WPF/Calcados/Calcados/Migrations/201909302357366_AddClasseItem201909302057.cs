namespace Calcados.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class AddClasseItem201909302057 : DbMigration
    {
        public override void Up()
        {
            DropForeignKey("dbo.Sapato", "Venda_Id", "dbo.Venda");
            DropIndex("dbo.Sapato", new[] { "Venda_Id" });
            CreateTable(
                "dbo.Item",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        QtdSapatos = c.Int(nullable: false),
                        Sapato_Id = c.Int(),
                        Venda_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Sapato", t => t.Sapato_Id)
                .ForeignKey("dbo.Venda", t => t.Venda_Id)
                .Index(t => t.Sapato_Id)
                .Index(t => t.Venda_Id);
            
            AddColumn("dbo.Estoque", "QtdTotal", c => c.Int(nullable: false));
            DropColumn("dbo.Estoque", "Quantidade");
            DropColumn("dbo.Sapato", "Venda_Id");
        }
        
        public override void Down()
        {
            AddColumn("dbo.Sapato", "Venda_Id", c => c.Int());
            AddColumn("dbo.Estoque", "Quantidade", c => c.Int(nullable: false));
            DropForeignKey("dbo.Item", "Venda_Id", "dbo.Venda");
            DropForeignKey("dbo.Item", "Sapato_Id", "dbo.Sapato");
            DropIndex("dbo.Item", new[] { "Venda_Id" });
            DropIndex("dbo.Item", new[] { "Sapato_Id" });
            DropColumn("dbo.Estoque", "QtdTotal");
            DropTable("dbo.Item");
            CreateIndex("dbo.Sapato", "Venda_Id");
            AddForeignKey("dbo.Sapato", "Venda_Id", "dbo.Venda", "Id");
        }
    }
}
