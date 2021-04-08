<%-- 
    Document   : Servicio
    Created on : 3/06/2019, 04:33:57 PM
    Author     : Jesus Martinez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar servicio</title>
    </head>
    <body>
        <form action="servicio/agregar" method="post">
            <label>Nombre: </label>
            <input type="text" name="nombreServicio">
            <label>Descripcion: </label>
            <textarea name="descripcionServicio" rows="5" maxlength="250"></textarea>
            <label>Precio: </label>
            <input type="number" name="precioServicio">
            <label>Duracion:  </label>
            <input type="text" maxlength="10" name="duracionServicio">
            <input type="submit" value="Agregar">
        </form>
    </body>
</html>
