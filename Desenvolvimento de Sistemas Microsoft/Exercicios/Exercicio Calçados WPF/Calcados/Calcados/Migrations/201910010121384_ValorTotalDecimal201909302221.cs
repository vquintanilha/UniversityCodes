namespace Calcados.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class ValorTotalDecimal201909302221 : DbMigration
    {
        public override void Up()
        {
            AlterColumn("dbo.Venda", "ValorTotal", c => c.Decimal(nullable: false, precision: 18, scale: 2));
        }
        
        public override void Down()
        {
            AlterColumn("dbo.Venda", "ValorTotal", c => c.Int(nullable: false));
        }
    }
}
