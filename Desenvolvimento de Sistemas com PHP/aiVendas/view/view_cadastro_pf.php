<html>
	<head>
		<title>aiVendas - Cadastro Pessoa Física</title>
		<meta charset="UTF-8"> 
	</head>
	<body>
		<center>
			<br><br><b>Cadastro de Pessoa Física</b><br><br>
			<form action="/aiVendas/controller/controller_pf.php" method="post">
				<table>
					<tr>
						<td>Nome:</td>
						<td><input type="text" name="nome"></td>
					</tr>
					<tr>
						<td>Sobrenome:</td>
						<td><input type="text" name="sobrenome"></td>
					</tr>
					<tr>
						<td>CPF:</td>
						<td><input type="text" name="cpf"></td>
					</tr>
					<tr>
						<td>RG:</td>
						<td><input type="text" name="rg"></td>
					</tr>
					<tr>
						<td>E-mail:</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Telefone:</td>
						<td><input type="text" name="telefone"></td>
					</tr>
					<tr>
						<td>Endereço:</td>
						<td><input type="text" name="endereco"></td>
					</tr>
					<tr>
						<td>Data de Nascimento:</td>
						<td><input type="text" name="nascimento"></td>
					</tr>
					<tr>
						<td>Gênero:</td>
						<td><input type="text" name="genero"></td>
					</tr>
					<tr>
						<td><input type="submit" value="enviar"></td>
						<td></td>
					</tr>					
				</table>	
			</form>
		</center>
	</body>
</html>