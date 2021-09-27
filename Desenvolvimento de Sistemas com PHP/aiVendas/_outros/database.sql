CREATE DATABASE aiVendas;
CREATE USER 'aivendasUser2'@'localhost' IDENTIFIED BY 'aivendasPasswd2';
GRANT ALL PRIVILEGES ON aiVendas.* TO 'aivendasUser2'@'localhost';

USE aiVendas;

CREATE TABLE pessoaFisica (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome varchar(255),
	sobrenome varchar(255),
	cpf varchar(255),
	rg varchar(255),
	email varchar(255),
	telefone varchar(255),
	endereco varchar(255),
	nascimento varchar(255),
	genero varchar(255)	
);

CREATE TABLE pessoaJuridica (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    razao varchar(255),
	fantasia varchar(255),
	cnpj varchar(255),
	ie varchar(255),
	email varchar(255),
	telefone varchar(255),
	endereco varchar(255),
	site varchar(255)
);