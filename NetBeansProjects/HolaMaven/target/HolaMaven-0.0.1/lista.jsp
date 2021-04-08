<%-- 
    Document   : lista
    Created on : 17/05/2019, 01:32:04 PM
    Author     : Jesus Martinez
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
		List <String> list = (List <String>)request.getAttribute("carros");
		for(int i=0; i<list.size() ; i++)
			out.println("<li>" + list.get(i) + "</li>");
	%>
    </body>
</html>
