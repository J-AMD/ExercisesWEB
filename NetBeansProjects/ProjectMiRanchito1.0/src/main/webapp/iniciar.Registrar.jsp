<%-- 
    Document   : iniciar.Registrar
    Created on : 9/07/2019, 08:16:38 AM
    Author     : Jesus Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Iniciar/Registrar</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Questrial&display=swap" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<style type="text/css">
	body{
		background-color: #F5F5F5;
		font-family: 'Questrial', sans-serif;
	}
</style>
<body>
	<header class="site-header">
		<div>
			<div class="d-flex justify-content-around" id="titulo">
				<div><h1><a id="titulo" href="index.jsp">MiRanchito!</a></h1></div>
				<nav class="btnTitulo" style="padding-top: 10px">
					<a href="index.jsp">Inicio</a>
					<a href="infosite.jsp" >Informacion</a>
					<a href="iniciar.Registrar.jsp">Iniciar/Registrarse</a>
				</nav>
			</div>
		</div>
	</header>
	<form action="">
		<div class="container">
		<div class="row centrar" style="padding: 100px">
			<div class="col-sm-4"></div>
			<div class="col-sm-4 contorno rounded shadow p-3 mb-5 bg-white">
				<h3>Iniciar sesión</h3>
				<div><input type="text" name="usuario" placeholder="Usuario"></div>
				<div><input type="password" name="contrasenia" placeholder="contraseña"></div>
				<div><a href="">He olvidado mi contraseña</a></div>
				<div><button class="btn btn-success" type="submit" name="iniciar">Entrar</button></div>
				<div>No estoy registrado <a href="registro.html">Registrar</a></div>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
	</form>
</body>
</html>
