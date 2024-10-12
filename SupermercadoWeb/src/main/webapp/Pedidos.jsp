<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page
	import="clases.Cliente, clases.GestionBD,java.util.ArrayList,java.sql.Statement,java.sql.ResultSet,java.sql.Connection, java.sql.SQLException"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de pedidos</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
		<h1>Tabla pedidos</h1>
		<br>
	<table border="1">
		<tr>
			<th>idproducto</th>
			<th>nombre</th>
			<th>medida</th>
			<th>precio</th>
			<th>unidades</th>
			<th>subtotal</th>
			
		</tr>

		<%
		ResultSet rs;
		GestionBD gestionBD = (GestionBD) application.getAttribute("gestionBD");
		try {

			rs = gestionBD.obtenerVentas();

			while (rs.next()) {

				String idproducto = rs.getString("idpedido");
				String nombre = rs.getString("nombre");
				String medida = rs.getString("medida");
				String precio = rs.getString("precio");
				String unidades = rs.getString("unidades");
				String subtotal = rs.getString("subtotal");

				
		%>



		<tr>
			<td><%=idproducto%></td>
			<td><%=nombre%></td>
			<td><%=medida%></td>
			<td><%=precio%></td>
			<td><%=unidades%></td>
			<td><%= subtotal %></td>
			

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