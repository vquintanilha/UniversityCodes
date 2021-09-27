create database Biblioteca;

use Biblioteca;

create table usuario (
id_usuario int identity primary key,
nome varchar(50),
cpf int,
usuario varchar(15),
senha varchar(15),
foto varchar(50));

create table genero (
id_genero int identity primary key,
nome varchar(20),
categoria varchar(10));

create table escritor (
id_escritor int identity primary key,
nome varchar(50),
idade int,
livros int);

create table editora (
id_editora int identity primary key,
nome varchar(50),
logo varchar(50),
livros int);

create table livro (
id_livro int identity primary key,
nome varchar(50),
sinopse varchar(50),
paginas int,
ano int,
id_genero int foreign key references genero,
id_escritor int foreign key references escritor,
id_editora int foreign key references editora);

create table loja (
id_loja int identity primary key,
id_livro int foreign key references livro,
preco int);

create table cartao (
id_cartao int identity primary key,
id_usuario int foreign key references usuario,
cartao int,
datavenc int,
cvv int,
bandeira varchar(20));

create table biblioteca (
id_biblioteca int identity primary key,
id_usuario int foreign key references usuario,
id_livro int foreign key references livro,
datacompra varchar(10));

create table listadesejos (
id_listadesejos int identity primary key,
id_usuario int foreign key references usuario,
id_loja int foreign key references loja,
data_add varchar(10));

alter table livro
	alter column sinopse text;

alter table loja
	alter column preco money;

alter table usuario
	alter column cpf numeric(11);


alter table cartao
	drop column bandeira;

alter table listadesejos
	drop column data_add;

alter table usuario
	drop column foto;


alter table loja
	add avaliacao int;

alter table usuario
	add idade int;

alter table escritor
	add foto varchar(50);


drop table listadesejos;

drop table cartao;