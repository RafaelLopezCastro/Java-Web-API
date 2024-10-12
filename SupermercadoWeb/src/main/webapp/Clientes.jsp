<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="clases.Cliente, clases.GestionBD,java.util.ArrayList,java.sql.Statement,java.sql.ResultSet,java.sql.Connection, java.sql.SQLException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de clientes</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h1>Tabla Clientes</h1>
	<br>
	<table border="1">
		<tr>
			<th>idcliente</th>
			<th>cia</th>
			<th>contacto</th>
			<th>cargo</th>
			<th>dirección</th>
			<th>ciudad</th>
			<th>region</th>
			<th>cp</th>
			<th>pais</th>
			<th>tlf</th>
			<th>fax</th>
		</tr>

		<%
		ResultSet rs;
		GestionBD gestionBD = (GestionBD) application.getAttribute("gestionBD");
		try {

			rs = gestionBD.obtenerClientes();

			while (rs.next()) {

				String idcliente = rs.getString("idcliente");
				String cia = rs.getString("cia");
				String contacto = rs.getString("contacto");
				String cargo = rs.getString("cargo");
				String direccion = rs.getString("direccion");
				String ciudad = rs.getString("ciudad");
				String region = rs.getString("region");
				String cp = rs.getString("cp");
				String pais = rs.getString("pais");
				String tlf = rs.getString("tlf");
				String fax = rs.getString("fax");

				//Cliente newCliente = new Cliente (idcliente, cia, contacto,cargo,direccion,ciudad,region,cp,pais,tlf,fax);

				//return newCliente;
		%>



		<tr>
			<td><%=idcliente%></td>
			<td><%=cia%></td>
			<td><%=contacto%></td>
			<td><%=cargo%></td>
			<td><%=direccion%></td>
			<td><%=ciudad%></td>
			<td><%=region%></td>
			<td><%=cp%></td>
			<td><%=pais%></td>
			<td><%=tlf%></td>
			<td><%=fax%></td>

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