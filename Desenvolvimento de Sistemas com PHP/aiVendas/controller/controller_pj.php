<?php
	// importar a classe pessoa jurídica
	require("../model/model_pessoa_juridica.php");	
	$action = '';
	if(isset($_GET['action'])){
		$action = $_GET['action'];
	}
	$id = 0;
	if(isset($_GET['id'])){
		$id = $_GET['id'];
	}
	$pj = new pessoaJuridica();
	
	if($action == 'create' ||  $action == 'update'){ 
		$pj->razao = $_POST['razao'];
		$pj->fantasia = $_POST['fantasia'];
		$pj->cnpj = $_POST['cnpj'];
		$pj->ie = $_POST['ie'];
		$pj->email = $_POST['email'];
		$pj->telefone = $_POST['telefone'];
		$pj->endereco = $_POST['endereco'];
		$pj->site = $_POST['site'];
		if($action == 'create'){
			$pj->create();
		}else{
			$pj->id = $id;
			$pj->update();
		}
		header("Location: /aiVendas/view/view_lista_pj.php");
		
	}elseif($action == 'delete'){
		$pj->id = $id;
		$pj->del();
		header("Location: /aiVendas/view/view_lista_pj.php");
	}elseif($action == 'read'){
		$pj->id = $id;
		$pj->read();
	}
?>