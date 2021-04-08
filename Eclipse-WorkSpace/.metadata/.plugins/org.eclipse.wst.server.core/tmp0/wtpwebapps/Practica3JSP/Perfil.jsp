<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<a href="miperfil">Perfil</a>
		<a>Conficuracion</a>
		<a>Salir</a>
	</div>

	<ol>
		<%
		List <String> list = (List <String>)request.getAttribute("listaPerfil");
		for(int i=0; i<list.size(); i++)
			out.println("<li>"+ list.get(i)+"</li>");
		%>
	</ol>

</body>
</html>