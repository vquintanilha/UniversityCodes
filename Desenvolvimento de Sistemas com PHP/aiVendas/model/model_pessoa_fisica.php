<?php
class pessoaFisica
{
	var $nome = '';
	var $sobrenome = '';
	var $cpf = '';
	var $rg = '';
	var $email = '';
	var $telefone = '';
	var $endereco = '';
	var $nascimento = '';
	var $genero = '';
	var $link = '';

	function  __construct(){
		$this->link = mysqli_connect("localhost", 
								 "aivendasUser2", 
								 "aivendasPasswd2", 
								 "aiVendas");
		if(!$this->link){
			echo "Erro de conexão com a base de dados!";
		}
	}
	
	function create(){
		
		$query = "INSERT INTO pessoaFisica(nome,sobrenome,cpf,rg,".
				 "email,telefone,endereco,nascimento,genero) VALUES ".
				 "('$this->nome','$this->sobrenome','$this->cpf',".
				 "'$this->rg','$this->email','$this->telefone',".
				 "'$this->endereco','$this->nascimento','$this->genero');";
				 
		mysqli_query($this->link, $query);
		
	}
	function read(){
	}
	function update(){
	}
	function del(){
	}
}

?>