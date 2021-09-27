namespace Calcados.Migrations
{
    using System;
    using System.Collections.ObjectModel;
    using System.Data.Entity;
    using System.Data.Entity.Migrations;
    using System.Linq;

    internal sealed class Configuration : DbMigrationsConfiguration<Calcados.ModelCalcados>
    {
        public Configuration()
        {
            AutomaticMigrationsEnabled = false;
        }

        protected override void Seed(Calcados.ModelCalcados context)
        {
            Endereco Endereco1 = new Endereco()
            {
                Rua = "André de Barros",
                CEP = "80010-080",
                Numero = "832",
                Complemento = "Comércio",
                Cidade = "Curitiba",
                Estado = "PR"
            };
            Endereco Endereco2 = new Endereco()
            {
                Rua = "Augusto Corrêa",
                CEP = "66075-110",
                Numero = "01",
                Complemento = "Casa",
                Cidade = "Belém",
                Estado = "PA"
            };
            AdicionarEnderecoBanco(context, Endereco1);
            AdicionarEnderecoBanco(context, Endereco2);

            PessoaJuridica PessoaJuridica1 = new PessoaJuridica()
            {
                Nome = "Auto Escola ABA",
                Endereco = Endereco1,
                CNPJ = "123",
                RazaoSocial = "ABA"
            };
            PessoaFisica PessoaFisica1 = new PessoaFisica()
            {
                Nome = "Joãozinho da Silva",
                Endereco = Endereco2,
                CPF = "456",
                Nascimento = new DateTime(1980, 01, 01)
            };
            AdicionarPessoaJuridicaBanco(context, PessoaJuridica1);
            AdicionarPessoaFisicaBanco(context, PessoaFisica1);

            ModeloSapato Modelo1 = new ModeloSapato()
            {
                Nome = "Nike Total 90",
                Cadarco = true,
                Material = "Couro",
                Preco = 340
            };
            ModeloSapato Modelo2 = new ModeloSapato()
            {
                Nome = "Adidas Predator",
                Cadarco = false,
                Material = "Tecido",
                Preco = (decimal)179.99
            };
            AdicionarModeloBanco(context, Modelo1);
            AdicionarModeloBanco(context, Modelo2);

            Sapato Sapato1 = new Sapato()
            {
                Modelo = Modelo1,
                Tamanho = 40,
                Cor = "Branco"
            };
            Sapato Sapato2 = new Sapato()
            {
                Modelo = Modelo2,
                Tamanho = 38,
                Cor = "Azul"
            };
            Sapato Sapato3 = new Sapato()
            {
                Modelo = Modelo2,
                Tamanho = 42,
                Cor = "Preto"
            };
            AdicionarSapatoBanco(context, Sapato1);
            AdicionarSapatoBanco(context, Sapato2);
            AdicionarSapatoBanco(context, Sapato3);

            Estoque Estoque1 = new Estoque()
            {
                Sapato = Sapato1,
                QtdTotal = 4
            };
            Estoque Estoque2 = new Estoque()
            {
                Sapato = Sapato2,
                QtdTotal = 8
            };
            Estoque Estoque3 = new Estoque()
            {
                Sapato = Sapato3,
                QtdTotal = 16
            };
            AdicionarEstoqueBanco(context, Estoque1);
            AdicionarEstoqueBanco(context, Estoque2);
            AdicionarEstoqueBanco(context, Estoque3);

            Item Item1Venda1 = new Item()
            {
                Sapato = Sapato1,
                QtdSapatos = 1
            };
            Item Item2Venda1 = new Item()
            {
                Sapato = Sapato3,
                QtdSapatos = 2
            };
            Item Item1Venda2 = new Item()
            {
                Sapato = Sapato2,
                QtdSapatos = 1
            };
            AdicionarItemBanco(context, Item1Venda1);
            AdicionarItemBanco(context, Item2Venda1);
            AdicionarItemBanco(context, Item1Venda2);

            Venda Venda1 = new Venda()
            {
                QtdItens = 3,
                ValorTotal = (decimal)699.98,
                Cliente = PessoaFisica1,
                DataVenda = DateTime.Now,
                Itens = new ObservableCollection<Item>()
            };
            Venda1.Itens.Add(Item1Venda1);
            Venda1.Itens.Add(Item2Venda1);
            Venda Venda2 = new Venda()
            {
                QtdItens = 1,
                ValorTotal = (decimal)179.99,
                Cliente = PessoaJuridica1,
                DataVenda = new DateTime(2019, 07, 07),
                Itens = new ObservableCollection<Item>()
            };
            Venda2.Itens.Add(Item1Venda2);
            AdicionarVendaBanco(context, Venda1);
            AdicionarVendaBanco(context, Venda2);

            context.SaveChanges();
        }

        private static void AdicionarEnderecoBanco(ModelCalcados context, Endereco end)
        {
            context.Enderecos.Add(end);
        }

        private static void AdicionarPessoaJuridicaBanco(ModelCalcados context, PessoaJuridica pj)
        {
            PessoaJuridica PessoaJuridica = (from db in context.PessoasJuridicas
                                             where db.CNPJ == pj.CNPJ
                                             select db).ToList().FirstOrDefault();
            if (PessoaJuridica == null)
            {
                context.PessoasJuridicas.Add(pj);
            }
        }

        private static void AdicionarPessoaFisicaBanco(ModelCalcados context, PessoaFisica pf)
        {
            PessoaFisica PessoaFisica = (from db in context.PessoasFisicas
                                         where db.CPF == pf.CPF
                                         select db).ToList().FirstOrDefault();
            if (PessoaFisica == null)
            {
                context.PessoasFisicas.Add(pf);
            }
        }

        private static void AdicionarModeloBanco(ModelCalcados context, ModeloSapato model)
        {
            ModeloSapato Modelo = (from db in context.ModeloSapatos
                                   where db.Nome == model.Nome
                                   select db).ToList().FirstOrDefault();
            if (Modelo == null)
            {
                context.ModeloSapatos.Add(model);
            }
        }

        private static void AdicionarSapatoBanco(ModelCalcados context, Sapato sap)
        {
            var Sapatos = context.Sapatos.Include("Modelo").ToList();
            Sapato Sapato = (from db in Sapatos
                             where db.Modelo == sap.Modelo && db.Tamanho == sap.Tamanho
                             select db).ToList().FirstOrDefault();
            if (Sapato == null)
            {
                context.Sapatos.Add(sap);
            }
        }

        private static void AdicionarEstoqueBanco(ModelCalcados context, Estoque est)
        {
            var Estoques = context.Estoques.Include("Sapato").ToList();
            Estoque Estoque = (from db in Estoques
                               where db.Sapato == est.Sapato
                               select db).ToList().FirstOrDefault();
            if (Estoque == null)
            {
                context.Estoques.Add(est);
            }
        }

        private static void AdicionarItemBanco(ModelCalcados context, Item it)
        {
            context.Itens.Add(it);
        }

        private static void AdicionarVendaBanco(ModelCalcados context, Venda vend)
        {
            var Vendas = context.Vendas.Include("Itens").ToList();
            Venda Venda = (from db in Vendas
                           where db.Itens == vend.Itens
                           select db).ToList().FirstOrDefault();
            if (Venda == null)
            {
                context.Vendas.Add(vend);
            }
        }

    }
}
