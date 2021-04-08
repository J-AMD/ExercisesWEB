<%-- 
    Document   : Cita
    Created on : 3/06/2019, 04:41:59 PM
    Author     : Jesus Martinez
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creacion de cita</title>
    </head>
    <body>
        <h1>Registro de una cita</h1>
        <form>
            <label>Cliente</label>
        <select name="idClienteCita"></select>
            <%
                List<Cliente> list = request.getAttribute("clientes");
                for(Cliente cliente: list){
                    out.println("<option value=\"" + cliente.getIdCliente() + "\">" + cliente.getNombre() + "</option>");
                }
                %>
        </select>
        <select name="idServicioCita"></select>
            <%
                List<Servicio> listServicios = request.getAttribute("servicios");
                for(Servicio servicio: list){
                    out.println("<option value=\"" + servicio.getIdServicio() + "\">" + servicio.getNombre() + "</option>");
                }
                %>
        </select>
        <label>Fecha cita: </label>
        <input type="datetime" name="fechaCita">
        <label>Comentarios: </label>
        <textarea ></textarea>
        <input type="submit" value="Registrar">
        </form>
    </body>
</html>
