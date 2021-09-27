use Biblioteca;

--C4------------------------------------------------------------------------------------------

	-- 3 Constraint

alter table usuario
	add constraint u_cpf unique (cpf);

alter table escritor
	add constraint u_nome unique (nome);
	
alter table usuario
	alter column nome varchar(50) not null;

--C5/PT1--------------------------------------------------------------------------------------

	-- 3 Insert

insert into usuario (nome, usuario, cpf, senha, idade) values
	('José', 'jos_97', 52367845123, 'santos@1997', 20);

insert into usuario (nome, usuario, cpf, senha, idade) values
	('Klemer', 'klemer159', 14045869234, '28setembro', 18);

insert into usuario (nome, usuario, cpf, senha, idade) values
	('Cleuza', 'acleuza45', 03254863257, 'cleuza_pe', 45);

insert into genero (nome, categoria) values
	('Ficção Científica', 'Juvenil');

insert into genero (nome, categoria) values
	('Fantasia', 'Infantil');

insert into genero (nome, categoria) values
	('Romance', 'Adulto');

insert into escritor (nome, idade, livros) values
	('J. K. Rowling', 53, 39);

insert into escritor (nome, idade, livros) values
	('George R. R. Martin', 69, 49);

insert into escritor (nome, idade, livros) values
	('Rick Riordan', 54, 49);

insert into editora (nome, livros) values
	('Rocco', 10000);

insert into editora (nome, livros) values
	('Arqueiro', 2250);

insert into editora (nome, livros) values
	('Intrínseca', 700);

insert into livro (nome, paginas, ano, id_genero, id_escritor, id_editora) values
	('Percy Jackson e o Ladrão de Raios', 384, 2005, 1, 3, 3);

insert into livro (nome, paginas, ano, id_genero, id_escritor, id_editora) values
	('Harry Potter e a Pedra Filosofal', 309, 1998, 2,1,1);

insert into livro (nome, paginas, ano, id_genero, id_escritor, id_editora) values
	('Game of Thrones: A Guerra dos Tronos', 694, 1996, 3, 2, 2);

insert into loja (id_livro, preco, avaliacao) values
	(1, 23.90, 4);

insert into loja (id_livro, preco, avaliacao) values
	(2, 26.90, 5);

insert into loja (id_livro, preco, avaliacao) values
	(3, 42.90, 5);

insert into biblioteca (id_usuario, id_livro, datacompra) values
	(1, 1, '12/05/2018');

insert into biblioteca (id_usuario, id_livro, datacompra) values
	(2, 2, '01/03/2017');

insert into biblioteca (id_usuario, id_livro, datacompra) values
	(3, 3, '23/08/2018');

	-- 3 Update

update usuario
	set idade = '25' where id_usuario = '1';

update usuario
	set idade = '32' where id_usuario = '2';

update usuario
	set idade = '48' where id_usuario = '3';

update genero
	set nome = 'Fantasia' where id_genero = '1';

update genero
	set nome = 'Ficção' where id_genero = '2';

update genero
	set nome = 'Épico' where id_genero = '3';

update escritor
	set idade = '32' where id_escritor = '1';

update escritor
	set idade = '45' where id_escritor = '2';

update escritor
	set idade = '24' where id_escritor = '3';

update editora
	set livros = '15000' where id_editora = '1';

update editora
	set livros = '897' where id_editora = '2';

update editora
	set livros = '5346' where id_editora = '3';

update livro
	set ano = '1974' where id_livro = '1';

update livro
	set ano = '2003' where id_livro = '2';

update livro
	set ano = '1998' where id_livro = '3';

update loja
	set avaliacao = '3' where id_livro = '1';

update loja
	set avaliacao = '4' where id_livro = '2';

update loja
	set avaliacao = '2' where id_livro = '3';

update Biblioteca
	set id_usuario = '3' where id_biblioteca = '1';

update Biblioteca
	set id_usuario = '2' where id_biblioteca = '2';

update Biblioteca
	set id_usuario = '1' where id_biblioteca = '3';

--C6------------------------------------------------------------------------------------------

select * from 

	-- 2 Where

select * from genero
	where nome='Fantasia';

select * from loja
	where avaliacao='3';

	-- 2 Join

SELECT usuario.*, livro.* FROM usuario INNER JOIN livro
	ON id_usuario = id_livro;

SELECT usuario.*, livro.* FROM usuario CROSS JOIN livro;

	-- 2 Between

select nome from usuario
	where idade between 30 and 40;

select nome from livro
	where ano between 2000 and 2010;

	-- 1 Like

select nome from usuario
	where nome like '%J%';

	-- 1 Order By

select * from escritor
	order by nome asc;

--C7------------------------------------------------------------------------------------------

	-- 1 View

CREATE VIEW Livros_Ano
AS
SELECT p.nome, e.ano
FROM livro AS e JOIN
Escritor AS p
ON e.id_livro = p.id_escritor;
--Query the view
SELECT nome, ano
FROM Livros_Ano
ORDER BY nome desc;

--C8------------------------------------------------------------------------------------------

	-- 1 Check

alter table loja
	add check (avaliacao in ('1','2','3','4','5'));

--C5/PT2--------------------------------------------------------------------------------------

	-- 1 Delete
	
delete from usuario where id_usuario='3';

delete from genero where id_genero='3';

delete from escritor where id_escritor='3';

delete from editora where id_editora='3';

delete from livro where id_livro='3';

delete from loja where avaliacao='2';

delete from Biblioteca where id_biblioteca='3';