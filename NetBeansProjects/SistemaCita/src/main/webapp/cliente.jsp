<%-- 
    Document   : cliente
    Created on : 3/06/2019, 04:25:28 PM
    Author     : Jesus Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar cliente</title>
    </head>
    <body>
        <form action="cliente/agregar" method="post">
            <label>Nombre:</label>
            <input type="text" name="nombreCliente">
            <label>Apellido paterno</label>
            <input type="text" name="apellidoP">
            <label>Apellido materno:</label>
            <input type="text" name="apellidoM">
            <label>Genero:</label>
            <input type="radio" name="generoCliente" value="M">Masculino
            <input type="radio" name="generoCliente" value="F">Femenino
            <input type="radio" name="generoCliente" value="O">otro
            <label>Correo</label>
            <input type="email" name="correoCliente">
            <label>Telefono</label>
            <input type="tel" name="telefonoCliente">
            <label>Fecha nacimiento:</label>
            <input type="date" name="fechaNacCliente">
            <input type="submit" value="Agregar">
        </form>
    </body>
</html>
