<?php
// Criar uma classe pessoa jurídica
class pessoaJuridica
{
	var $id = 0;
	var $razao = '';
	var $fantasia = '';
	var $cnpj = '';
	var $ie = '';
	var $email = '';
	var $telefone = '';
	var $endereco = '';
	var $site = '';
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
		$query = "INSERT INTO pessoaJuridica(razao,fantasia,cnpj,ie,".
				 "email,telefone,endereco,site) VALUES ".
				 "('$this->razao','$this->fantasia','$this->cnpj',".
				 "'$this->ie','$this->email','$this->telefone',".
				 "'$this->endereco','$this->site');";
				 
		mysqli_query($this->link, $query);
	}
	function read(){
		$query = "SELECT * FROM pessoaJuridica WHERE id=$this->id;";		 
		$result = mysqli_query($this->link, $query);
		$row = $result->fetch_array(MYSQLI_NUM);
		$this->razao = $row[1];
		$this->fantasia = $row[2];
		$this->cnpj = $row[3];
		$this->ie = $row[4];
		$this->email = $row[5];
		$this->telefone = $row[6];
		$this->endereco = $row[7];
		$this->site = $row[8];
	}
	function update(){
		$query = "UPDATE pessoaJuridica SET
				  razao='$this->razao',
				  fantasia = '$this->fantasia',
				  cnpj = '$this->cnpj',
				  ie = '$this->ie',
				  email = '$this->email',
				  telefone = '$this->telefone',
				  endereco = '$this->endereco',
				  site = '$this->site' WHERE
				  id = $this->id;";
						 
		mysqli_query($this->link, $query);
	}
	function del(){
		$query = "DELETE FROM pessoaJuridica
				  WHERE id = $this->id;";				 
		mysqli_query($this->link, $query);
	}
	
	function list(){
		$query = "SELECT id FROM pessoaJuridica;";				 
		$result = mysqli_query($this->link, $query);
		
		$pjs = [];
		while($row = $result->fetch_array(MYSQLI_NUM)){
			$pj = new pessoaJuridica();
			$pj->id = $row[0];
			$pj->read();
			array_push($pjs,$pj);
		}
		return $pjs;
	}
}

?>