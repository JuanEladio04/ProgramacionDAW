package Capitulo08.bloque02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Capitulo08.bloque02.controladores.Delete;
import Capitulo08.bloque02.controladores.Insercion;
import Capitulo08.bloque02.controladores.Listado;
import Capitulo08.ejemplo.bbddProperties;
import utils.Utils;

public class Main {

	public static void main(String[] args) {
		
		Connection conexion = null;

		try { //Realizamos una conexión con la Base de Datos.
			conexion = realizaConexion();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		do { //Mostramos los menus
			escogeTabla(conexion);
		} while (true);
	}
	
	/**
	 * 
	 * @param conexion
	 */
	public static void escogeTabla(Connection conexion) {
		String tabla;
		int option;
		
		System.out.println("ADMINISTRACIÓN DE LAS TABLAS: \n" //Mostramos las diferentes opciones
				+ "1.- Mostrar todas las tablas. \n"
				+ "2.- Administrar una tabla. \n"
				+ "3.- Salir"
				);
		
		option = Utils.pideNumeroScanner("Escoge una opción");
		
		switch (option) {
		case 1:
			Listado.muestraTablas(conexion); //Mostramos las diferentes tablas al usuario
			break;
			
		case 2:
			tabla = Utils.pideStringScanner("Introduce el nombre de la tabla:");
			
			muestraMenuCRUD(tabla, conexion); //Mostramos el menu de gestion de la tabla
			break;
			
		case 3://Salir
			System.exit(0);
			break;

		default:
			System.out.println("Valor no válido");
			break;
		}
	}
	
	/**
	 * 
	 */
	public static void muestraMenuCRUD(String tabla, Connection conexion) {
		int option;
		boolean menuAbierto = true;
		
		if (Listado.compruebaTabla(tabla, conexion) == false) {
			menuAbierto = false;
			System.out.println("¡Esa tabla no existe!");
		}

		
		
		while(menuAbierto) {
			System.out.println("ADMINISTRACIÓN TABLA " + tabla.toUpperCase() + ": \n" //Mostramos las diferentes opciones
					+ "1.- Realizar Insert. \n"
					+ "2.- Realiza Update. \n"
					+ "3.- Realiza Delete. \n"
					+ "4.- Muestra tabla. \n"
					+ "5.- Administrar otra tabla"
					);
			option = Utils.pideNumeroScanner("Introduce una opción."); //Pedimos una opcion al susuario
			
			switch (option) {
			case 1: //Realizar Insert.
				try {
					Insercion.realizaInsert(conexion, tabla);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 2: //Realizar Update.
				
				break;
				
			case 3: // Realizar Delete.
				try {
					Delete.realizaDelete(tabla, conexion);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 4: //Muestra tabla.
				Listado.muestraTabla(conexion, tabla);
				break;
			
				
			case 5: //Salir del menú
				menuAbierto = false;
				break;
			
			default:
				System.out.println("Valor no válido.");
				break;
			}
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
}
