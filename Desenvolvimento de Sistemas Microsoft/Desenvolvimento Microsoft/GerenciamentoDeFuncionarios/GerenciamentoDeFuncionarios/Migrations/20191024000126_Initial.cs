using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using System;
using System.Collections.Generic;

namespace GerenciamentoDeFuncionarios.Migrations
{
    public partial class Initial : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Funcionario",
                columns: table => new
                {
                    Id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    LotacaoId = table.Column<int>(nullable: true),
                    Nascimento = table.Column<DateTime>(nullable: false),
                    Nome = table.Column<string>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Funcionario", x => x.Id);
                });

            migrationBuilder.CreateTable(
                name: "Departamento",
                columns: table => new
                {
                    Id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    Nome = table.Column<string>(nullable: false),
                    ResponsavelId = table.Column<int>(nullable: false)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Departamento", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Departamento_Funcionario_ResponsavelId",
                        column: x => x.ResponsavelId,
                        principalTable: "Funcionario",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Tarefa",
                columns: table => new
                {
                    Id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    AreaId = table.Column<int>(nullable: true),
                    Descricao = table.Column<string>(nullable: true),
                    ExecutorId = table.Column<int>(nullable: true),
                    Fim = table.Column<DateTime>(nullable: true),
                    Inicio = table.Column<DateTime>(nullable: false),
                    Titulo = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Tarefa", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Tarefa_Departamento_AreaId",
                        column: x => x.AreaId,
                        principalTable: "Departamento",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Restrict);
                    table.ForeignKey(
                        name: "FK_Tarefa_Funcionario_ExecutorId",
                        column: x => x.ExecutorId,
                        principalTable: "Funcionario",
                        principalColumn: "Id",
                        onDelete: ReferentialAction.Restrict);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Departamento_ResponsavelId",
                table: "Departamento",
                column: "ResponsavelId");

            migrationBuilder.CreateIndex(
                name: "IX_Funcionario_LotacaoId",
                table: "Funcionario",
                column: "LotacaoId");

            migrationBuilder.CreateIndex(
                name: "IX_Tarefa_AreaId",
                table: "Tarefa",
                column: "AreaId");

            migrationBuilder.CreateIndex(
                name: "IX_Tarefa_ExecutorId",
                table: "Tarefa",
                column: "ExecutorId");

            migrationBuilder.AddForeignKey(
                name: "FK_Funcionario_Departamento_LotacaoId",
                table: "Funcionario",
                column: "LotacaoId",
                principalTable: "Departamento",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Departamento_Funcionario_ResponsavelId",
                table: "Departamento");

            migrationBuilder.DropTable(
                name: "Tarefa");

            migrationBuilder.DropTable(
                name: "Funcionario");

            migrationBuilder.DropTable(
                name: "Departamento");
        }
    }
}
