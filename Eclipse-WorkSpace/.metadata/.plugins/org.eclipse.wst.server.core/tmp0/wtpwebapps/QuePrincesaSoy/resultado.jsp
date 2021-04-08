<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<%
			String nombrePrincesa = (String)request.getAttribute("nombre");
			out.print(nombrePrincesa);
		%>
	</h1>
	
	<p>
		<% 
			String descripcionPrincesa = (String)request.getAttribute("descripcion");
			out.print(descripcionPrincesa);
		%>
	</p>
		<% 
			String urlImagen = (String)request.getAttribute("imagen");
		    out.print("<img src=imagen\"" + urlImagen + ".jpg>");
		%>
</body>
</html>