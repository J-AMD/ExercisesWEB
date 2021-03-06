<%-- 
    Document   : index
    Created on : 8/07/2019, 11:20:33 PM
    Author     : Jesus Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Mi ranchito</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Questrial&display=swap" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/styles.css">

	<!-- Implementacion de los script de JQUERY-->
	<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
	<script src="https://cdn.rawgit.com/nnattawat/flip/master/dist/jquery.flip.min.js"></script>
	<style type="text/css">
	body{
		background-color: #F5F5F5;
		font-family: 'Questrial', sans-serif;
	}
</style>
</head>
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
    <section>
        <div class="row" style="padding: 100px" id="buscadorImg">
            <div class="col-2"></div>
            <div class="input-group mb-3 col-sm-8">
                <input class="form-control" type="sumbmit" name="buscar" placeholder="Buscar negocio">
                <button type="button" class="btn btn-primary">buscar</button>
            </div>
        </div>
        <div class="centrar" style="padding-top: 3px">
            <h2>Encuentra lo que necesitas como en tu ranchito desde tu casa</h2>
        </div>
    </section>

    <div class="container">
        <div class="row d-flex justify-content-between">
            <div class="col-sm-1"></div>
            <a href="#" class="col-sm-3 contorno centrar rounded shadow p-3 mb-5 bg-white" style="text-decoration: none">
                <img class="imgNegocio rounded" src="Imagenes/compios.png">
                <div class="fuente">
                    Comida r??pida Plaza Inglaterra, Avenida Inglaterra 5003 Cerrado ??? Horario de apertura: lun. 9:00 
                </div>
            </a>
            <a href="#" class="col-sm-3 contorno centrar rounded shadow p-3 mb-5 bg-white" style="text-decoration: none">
                <img class="imgNegocio rounded" src="Imagenes/sonoraameat.jpg">
                <div class="fuente">
                    SM Sonora's Meat Metropolitano - Av. Mision de San Lorenzo 367, 45030 Zapopan Calificaci??n de 4.6
                </div>
            </a>
            <a href="#" class="col-sm-3 contorno centrar rounded shadow p-3 mb-5 bg-white" style="text-decoration: none">
                <img class="imgNegocio" src="Imagenes/omarcarlos.jpg">
                <div class="fuente">
                    Tacos Omar Carlos - Av. Manuel J. Clouthier 1682, 45054 Zapopan - Calificaci??n de 4.1
                </div>
            </a>
            <div class="col-sm-1"></div>
        </div>
        <header>
            <div class="centrar" style="padding: 100px">
                <h5>Si eres nuevo en un lugar no te preocupes, mi ranchito te ayuda a encotrar lo que necesitas a tu alrededor</h5>
            </div>
        </header>
</body>
</html>
