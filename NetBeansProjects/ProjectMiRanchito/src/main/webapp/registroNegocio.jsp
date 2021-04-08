<%-- 
    Document   : registro
    Created on : 9/07/2019, 08:17:50 AM
    Author     : Jesus Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Nuevo registro</title>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Questrial&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro&display=swap" rel="stylesheet">
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
    <form action="ServletRegistrarNegocio" method="POST" style="padding-top: 100px">
        <div class="container">
            <div class="row d-flex justify-content-center">
                <div class="col-sm-8 centrar">
                    <label>
                        <input class="form-control centrar" type="text" name="nombre" placeholder="Nombre">
                    </label>
                    <label>
                        <input class="form-control centrar" type="text" name="ubicacion" placeholder="Ubicacion">
                    </label>
                    <label>
                        <input class="form-control centrar" type="text" name="telefono" placeholder="Telefono">
                    </label>
                </div>
            </div>
            
            <div class="row d-flex justify-content-center">
                <div class="col-5">
                    <input class="form-control centrar" type="horario" name="horario" placeholder="Horario 0:00-0:00">
                </div>
            </div>
            <div class="row d-flex justify-content-center">
                <div class="col-5">
                    <input class="form-control centrar" type="email" name="correo" placeholder="email">
                </div>
            </div>
            <div class="row d-flex justify-content-center">
            <div class="col-5 centrar">
                <input class="form-control centrar" type="text" name="imagen" placeholder="Imagen">
                <!--
                <input class="contorno rounded" type=file name="file">
                 -->
            </div>
        </div>
        </div>
        <div class="row">
            <div class="col-7"></div>
            <div class="col-7"></div>
            <button class="btn btn-success" type="submit">Registrar</button>
        </div>
    </form>
</body>
</html>

