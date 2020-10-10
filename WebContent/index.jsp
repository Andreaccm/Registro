<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body style="background-color:#CAE88A;">

<center>
<br> <br>
<br>
	<h1>Registrar</h1>
	
	<form action="controlador" method="POST">
		<table>
	<tr>
		<td> Email:  </td>
		<td><input type="email" name="email" value=""></td>
	</tr>
	
	<tr>
		<td> Usuario: </td>
		<td><input type="text" name="usuario" value=""></td>
	</tr>
	
	<tr>
		<td> Password:  </td>
		<td><input type="password" name="password" value=""></td>
	</tr>
	<tr>
		<td></td>
		<td ><input type="submit" value= "Registrar"/></td>
	</tr>
		</table>
	
	</form>
</center>
	
</body>
</html>