package Capitulo08.bloque01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Capitulo08.ejemplo.bbddProperties;
import utils.Utils;

public class MenuBaseDatos {
		
	public static void main(String[] args) {
		do {
			muestraMenu(); //Mostramos el menú del programa
		} while (true);
	}
	
	public static void muestraMenu() {
		Connection conexion = null;
		int option;

		try { //Realizamos una conexión con la Base de Datos.
			conexion = realizaConexion();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("ADMINISTRACIÓN TABLA CLIENTES: \n"
							+ "1.- Realizar Insert. \n"
							+ "2.- Realiza Update. \n"
							+ "3.- Realiza Delete. \n"
							+ "4.- Muestra tabla. \n"
							+ "5.- Salir"
							);
		option = Utils.pideNumeroScanner("Introduce una opción."); //Pedimos una opcion al susuario
		
		switch (option) {
		case 1: //Realizar Insert.
			try {
				realizaInsert(conexion);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
			
		case 2: //Realizar Update.
			try {
				realizaUpdate(conexion);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case 3: // Realizar Delete.
			try {
				realizarDelete(conexion);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
			
		case 4: //Salir del programa.
			muestraTabla(conexion);
			break;

			
		case 5: //Salir del programa.
			System.exit(0);
			break;

		default:
			System.out.println("Valor no válido.");
			break;
		}
	}
	
	/**
	 * 
	 * @param conexion
	 * @throws SQLException
	 */
	public static void realizaUpdate(Connection conexion) throws SQLException {
		Statement s = (Statement) conexion.createStatement(); 

		int id = Utils.pideNumeroScanner("Introduce la id del objeto a modificar");
		int idFabricante = Utils.pideNumeroScanner("Introduce la id del fabricante");
		String bastidor = Utils.pideStringScanner("Introduce el numero de bastidor");
		String modelo = Utils.pideStringScanner("Introduce el modelo del coche");
		String color = Utils.pideStringScanner("Introduce el color del coche");

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches.coche "
				+ "set idFabricante = '" + idFabricante + "', "
				+ "bastidor = '" + bastidor + "', "
				+ "modelo = '" + modelo  + "', " 
				+ "color = '" + color + "'\r\n"
				+ "where id = " + id
				);
	}
	
	/**
	 * 
	 * @param conexion
	 * @throws SQLException
	 */
	public static void realizaInsert(Connection conexion) throws SQLException {
		Statement s = (Statement) conexion.createStatement(); 
		
		int id = getSiguienteIdValidoConcesionario(conexion);
		int idFabricante = Utils.pideNumeroScanner("Introduce la id del fabricante");
		String bastidor = Utils.pideStringScanner("Introduce el numero de bastidor");
		String modelo = Utils.pideStringScanner("Introduce el modelo del coche");
		String color = Utils.pideStringScanner("Introduce el color del coche");

		int filasAfectadas = s.executeUpdate("insert into tutorialjavacoches.coche (id, idFabricante, bastidor, modelo, color)"
                + "values('" + id + "','" + idFabricante
                + "','" + bastidor + "','" + modelo + "','" + color + "')"
				);
			
		System.out.println("Filas afectadas: " + filasAfectadas);
	
		s.close();
	}
	
	/**
	 * 
	 * @param conexion
	 * @throws SQLException
	 */
	public static void realizarDelete(Connection conexion) throws SQLException {
		String modID = Utils.pideStringScanner("Introduce el ID del objeto a eliminar.");
		int num = Integer.parseInt(modID);
		
		Statement s = (Statement) conexion.createStatement(); 

		int filasAfectadas = s.executeUpdate("Delete from "
			+ "tutorialjavacoches.coche "
			+ "where id like " + num);
	
		System.out.println("Filas afectadas: " + filasAfectadas);
	
		s.close();
	}
	
	/**
	 * 
	 * @param conexion
	 */
	public static void  muestraTabla(Connection conexion) {	
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("select * from coche");
		   
			while (rs.next()) { 
				System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getString(3)+ " " + rs.getString(4)+ " " + rs.getString(5)); 
			}
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public static Connection realizaConexion() throws SQLException, ClassNotFoundException {
		String driver = bbddProperties.getProperty("JDBC_DRIVER_CLASS");
		String user = bbddProperties.getProperty("JDBC_USER");
		String password = bbddProperties.getProperty("JDBC_PASSWORD");
		String host = bbddProperties.getProperty("JDBC_HOST");
		String schema = bbddProperties.getProperty("JDBC_SCHEMA_NAME");
		String properties = bbddProperties.getProperty("JDBC_PROPERTIES");
		
		Class.forName(driver);
		
		return (Connection) DriverManager.getConnection ("jdbc:mysql://" + host + "/" + schema + properties, user, password);			
		
	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException 
	 */
	private static int getSiguienteIdValidoConcesionario(Connection conexion) throws SQLException {
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId "
				+ "from tutorialjavacoches.coche");
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		
		return 1;
	}

}
