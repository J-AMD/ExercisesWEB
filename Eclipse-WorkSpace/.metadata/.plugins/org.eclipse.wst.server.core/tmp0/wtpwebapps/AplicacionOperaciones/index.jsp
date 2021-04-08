<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Operaciones</h2>
	<a href="operacion/suma">Suma</a>
	<a href="operacion/resta">Resta</a>
	<a href="operacion/multiplicacion">Multiplicacion</a>
	<a href="operacion/division">Division</a>
	<form action="calcular/resultado">
	<div>
		<label>Numero 1:</label>
		<input type="text" name="numero1" placeholder="Ingresa un numero">
	</div>
	<div>
		<label>Numero 2:</label>
		<input type="text" name="numero2" placeholder="Ingresa un numero">
	</div>
	<div>
		<label><br>Tipo de operacion:</label>
	</div>
	<div>
		<label><br> Suma</label>
		<input type="radio" name="operacion" value="suma">
		<label>Resta</label>
		<input type="radio" name="operacion" value="resta">
		<label>Multiplicacion</label>
		<input type="radio" name="operacion" value="multiplicacion">
		<label>Division</label>
		<input type="radio" name="operacion" value="division">
	</div>
	<div>
		<input type="submit" value="Calcular">
	</div>
	</form>
	<form action="calcular/nombre">
	<div><br>
		<label>Nombre: </label>
		<input type="text" name="nombre" placeholder="Tu nombre">
	</div>
	<div>
		<input type="submit" value="Submit">
	</div>
	
	</form>
	<form action="calcular/tabla">
		<div><br>
			<label>Tabla de multiplicar del: </label>
			<input type="text" name="multiplo" placeholder="numero">
		</div>
		<div>
		<input type="submit" value="Generar">
	</div>
	</form>
	<form action="">
		<div><br>
			<label>Serie Fibonacci de: </label>
			<input type="text" name="fibonacci" placeholder="Numero">
		</div>
		<div>
			<input type="submit" value="Serie">
		</div>
	</form>
</body>
</html>