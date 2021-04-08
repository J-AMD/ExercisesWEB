<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="dia/semana">
		<div>
			<label>Dia de la semana: </label>
			<input type="text" name="dia" placeholder="Ingresa un numero">
		</div>
		<div>
			<input type="submit" value="Dia">
		</div>
	</form>
	<form action="niveles/piramide">
		<div><br>
			<label>Base del triangulo: </label>
			<input type="text" name="triangulo" placeholder="*Base">
		</div>
		<div>
			<input type="submit" value="Triangulo">
		</div>
	</form>
	<form action="figura/rombo">
		<div><br>
			<label>Base del rombo: </label>
			<input type="text" name=rombo placeholder="Base del rombo">
		</div>
		<div>
			<input type="submit" value="Rombo">
		</div>
	</form>
	<form action="mostrar/cadena">
		<div><br>
			<label>Ingresa una cadena</label>
			<input type="text" name="cadena" placeholder="1-2-3">
		</div>
		<div>
			<input type="submit" value="Cadena">
		</div>
	</form>
</body>
</html>