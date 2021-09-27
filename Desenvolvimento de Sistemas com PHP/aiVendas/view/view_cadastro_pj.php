<html>
	<head>
		<title>aiVendas - Cadastro Pessoa Jurídica</title>
		<meta charset="UTF-8"> 
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
	</head>
	<body>
		<?php
			require("../model/model_pessoa_juridica.php");
			$id = 0;
			if(isset($_GET['id'])){
				$id = $_GET['id'];
			}
			$action = 'create';
			
			$pj = new pessoaJuridica();
			if($id){
				$pj->id = $id;
				$pj->read();
				$action = 'update';
			}
		?>
		<center>
			<br><br><b>Cadastro de Pessoa Jurídica</b><br><br>
			<form action="/aiVendas/controller/controller_pj.php?action=<?=$action?>&id=<?=$id?>"
				method="post">
				<table>
					<tr>
						<td>Razão Social:</td>
						<td><input type="text" name="razao" 
						value="<?=$pj->razao?>"></td>
					</tr>
					<tr>
						<td>Nome Fantasia:</td>
						<td><input type="text" name="fantasia"
						value="<?=$pj->fantasia?>"></td>
					</tr>
					<tr>
						<td>CNPJ:</td>
						<td><input type="text" name="cnpj"
						value="<?=$pj->cnpj?>"></td>
					</tr>
					<tr>
						<td>I.E.:</td>
						<td><input type="text" name="ie"
						value="<?=$pj->ie?>"></td>
					</tr>
					<tr>
						<td>E-mail:</td>
						<td><input type="text" name="email"
						value="<?=$pj->email?>"></td>
					</tr>
					<tr>
						<td>Telefone:</td>
						<td><input type="text" name="telefone"
						value="<?=$pj->telefone?>"></td>
					</tr>
					<tr>
						<td>Endereço:</td>
						<td><input type="text" name="endereco"
						value="<?=$pj->endereco?>"></td>
					</tr>
					<tr>
						<td>Site:</td>
						<td><input type="text" name="site"
						value="<?=$pj->site?>"></td>
					</tr>
					<tr>
						<td>
						<input type="submit" value="enviar">
						</td>
						<td></td>
					</tr>					
				</table>	
			</form>
		</center>
	</body>
</html>