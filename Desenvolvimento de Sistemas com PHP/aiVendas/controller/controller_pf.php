<?php
	// importar a classe pessoa física
	require("../model/model_pessoa_fisica.php");
	
	// criar um objeto pessoa física usando a classe importada
	$pf = new pessoaFisica(); 
	$pf->nome = $_POST['nome'];
	$pf->sobrenome = $_POST['sobrenome'];
	$pf->cpf = $_POST['cpf'];
	$pf->rg = $_POST['rg'];
	$pf->email = $_POST['email'];
	$pf->telefone = $_POST['telefone'];
	$pf->endereco = $_POST['endereco'];
	$pf->nascimento = $_POST['nascimento'];
	$pf->genero = $_POST['genero'];
	
	$pf->create();
	
	//echo "<pre>";
	//var_dump($pf);

	
?>