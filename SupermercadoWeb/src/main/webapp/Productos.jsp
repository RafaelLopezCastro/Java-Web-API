<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page
	import="clases.Cliente, clases.GestionBD,java.util.ArrayList,java.sql.Statement,java.sql.ResultSet,java.sql.Connection, java.sql.SQLException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de productos</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h1>Tabla productos</h1>
	<br>
	<table border="1">
		<tr>
			<th>idproducto</th>
			<th>nombre</th>
			<th>categoria</th>
			<th>medida</th>
			<th>precio</th>
			<th>stock</th>
			
		</tr>

		<%
		ResultSet rs;
		GestionBD gestionBD = (GestionBD) application.getAttribute("gestionBD");
		try {

			rs = gestionBD.obtenerProductos();

			while (rs.next()) {

				String idproducto = rs.getString("idproducto");
				String nombre = rs.getString("nombre");
				String categoria = rs.getString("categoria");
				String medida = rs.getString("medida");
				String precio = rs.getString("precio");
				String stock = rs.getString("stock");
			

				
		%>



		<tr>
			<td><%=idproducto%></td>
			<td><%=nombre%></td>
			<td><%=categoria%></td>
			<td><%=medida%></td>
			<td><%=precio%></td>
			<td><%=stock%></td>
			

		</tr>
	
	<%
	}
	} catch (SQLException e) {
	System.out.println("Error al realizar el listado de productos");
	System.out.println(e.getMessage());
	}
	%>

</table>

	
</body>
</html>