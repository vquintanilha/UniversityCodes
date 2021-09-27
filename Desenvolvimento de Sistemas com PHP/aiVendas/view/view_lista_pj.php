<html>
	<head>
		<title>aiVendas - Cadastro Pessoa Jurídica</title>
		<meta charset="UTF-8"> 
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
				
	</head>
	<body>
		<center>
		<br><br>
		<table>
		<?php
			require("../model/model_pessoa_juridica.php");			
			$pjt = new pessoaJuridica();
			$pjs = $pjt->list();
		
			foreach($pjs as $pj){
				?>
				<tr>
					<td><?=$pj->razao?>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td>
						<a href="/aiVendas/view/view_cadastro_pj.php?id=<?=$pj->id?>">
							<img src="../imgs/edit.png">
						</a>
					</td>
					<td>
						<a href="/aiVendas/controller/controller_pj.php?action=delete&id=<?=$pj->id?>">
							<img src="../imgs/delete.png">
						</a>
					</td>
				</tr>
				<?php
			}
		?>
		</table>
		</center>
	</body>
</html>