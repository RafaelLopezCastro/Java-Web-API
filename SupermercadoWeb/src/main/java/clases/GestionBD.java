package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GestionBD {
	private Connection conexion;
	public GestionBD(){
		// Paso 1: Cargar el driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		System.out.println("No se ha encontrado el driver para MySQL");
		return;
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		// Paso 2: Establecer conexión con la base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/supermercado";
		String user = "root";
		String pass = "curso";
		//Connection con;
		try {
		this.conexion = DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
		System.out.println("Error en la conexión con la BD");
		System.out.println(e.getMessage());
		return;
		}
		System.out.println("Se ha establecido la conexión con la Base de datos");
		
	    
	}
		/*

		// Paso 3: Interactuar con la BD (todavía pendiente)
		
		try {
			
			Statement sentencia = conexion.createStatement();
		    ResultSet rs = sentencia.executeQuery("SELECT * FROM cliente");
			while (rs.next()) {
				
				String idcliente = rs.getString("idcliente");
				String cia = rs.getString("cia");
				String contacto = rs.getString("contacto");
				String cargo = rs.getString("cargo");
				String direccion = rs.getString("direccion");
				String ciudad = rs.getString("ciudad");
				String region = rs.getString("ciudad");
				String cp = rs.getString("cp");
				String pais = rs.getString("pais");
				String tlf = rs.getString("pais");
				String fax = rs.getString("fax");
				
				Cliente newCliente = new Cliente (idcliente, cia, contacto,cargo,direccion,ciudad,region,cp,pais,tlf,fax);
				
			    //return newCliente;
				
				System.out.println(newCliente.getIdcliente());
			     
				System.out.print(rs.getString("idcliente"));
				System.out.print(" - ");
				System.out.print(rs.getString("contacto"));
				System.out.print(" - ");
				System.out.print(rs.getString("tlf"));
				System.out.println(); // Retorno de carro
				
			}
			} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
			}

		// Paso 4: Cerrar la conexión
		try {
		conexion.close();
		} catch (SQLException e) {
		System.out.println("No se ha podido cerrar la conexión con la BD");
		System.out.println(e.getMessage());
		return;
		}
		System.out.println("Se ha cerrado la base de datos");
		
		
		public Connection getConexion() {
			return this.getConexion();
		};
		 
	}
	
	*/
	
	public Connection getConexion() {
		return this.conexion;
	}
	
	
	
		public ResultSet obtenerClientes() throws SQLException {
			String sqlCom = "SELECT * FROM cliente";
			Statement statement = this.conexion.createStatement();
			return statement.executeQuery(sqlCom);
			
		};
		
		public ResultSet obtenerProductos() throws SQLException {
			String sqlCom = "SELECT idproducto, nombre, categoria.categoria, medida, precio, stock from producto inner join categoria on producto.idcategoria = categoria.idcategoria ;";
			Statement statement = this.conexion.createStatement();
			return statement.executeQuery(sqlCom);
			
		};
		
		public ResultSet obtenerVentas() throws SQLException {
			String sqlCom = "SELECT  idpedido, nombre, medida, detalle.precio, unidades, detalle.precio*unidades as subtotal from detalle inner join producto on detalle.idproducto = producto.idproducto order by idpedido;";
			Statement statement = this.conexion.createStatement();
			return statement.executeQuery(sqlCom);
			
		};
		
		public void cerrarConexion() {
			try {
				if(this.conexion != null && !this.conexion.isClosed()) {
					this.conexion.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	};
	
	
