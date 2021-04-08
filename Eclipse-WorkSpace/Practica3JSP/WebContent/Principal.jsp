<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<% out.println("Hola JSP"); %>
	</h2>
		<%
	
		String nombreUsuario = (String)request.getAttribute("nombreUsuario");
		out.println("<h4>" + nombreUsuario + "</h4>");
		%>
	<ol>
			<% 
				List <String> list = (List <String>)request.getAttribute("listaCosas");
				for(int i=0; i<list.size(); i++)
					out.println("<li>"+ list.get(i)+"</li>");
			%>
	</ol>
	
</body>
</html>