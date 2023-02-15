package Capitulo08.bloque02.controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listado {
	
	private static void inicializaLista(List<String> tablas, Connection conexion) {
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("show tables");
		   
			while (rs.next()) { 
				tablas.add(rs.getString(1));
			}
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}
	
	/**
	 * Muestra el contenido de la tabla seleccionada.
	 * @param conexion
	 */
	public static void  muestraTabla(Connection conexion, String tabla) {	
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("select * from " + tabla);
			
		     int numColumnas=rs.getMetaData().getColumnCount();
		   
			while (rs.next()) { 
				for (int i = 1; i <= numColumnas; i++) {
					System.out.print (rs.getString (i) + " "); 
				}
				System.out.println();
			}
		}
		catch (SQLException ex) {
		}
		
	}
	
	/**
	 * Muestra las tablas disponibles
	 * @param conexion
	 */
	public static void muestraTablas(Connection conexion) {
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("show tables");
		   
			while (rs.next()) { 
				System.out.println (rs.getString (1)); 
			}
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
		
	}
	
	public static Boolean compruebaTabla(String valor, Connection conexion) {
		List<String> tablas = new ArrayList<>();
		inicializaLista(tablas, conexion);
		
		for(String tabla : tablas) {
			if(tabla.equals(valor)) {
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * Obten el número de columnas
	 * @param tabla
	 * @param conexion
	 * @return
	 * @throws SQLException
	 */
	public static int obtenerNumeroColumnas(String tabla, Connection conexion) throws SQLException {
		Statement s = (Statement) conexion.createStatement(); 

		ResultSet rs = s.executeQuery ("select * from " + tabla);
		
	     int numColumnas=rs.getMetaData().getColumnCount();
	     
	     return numColumnas;
	}
	
	/**
	 * Muestra el nombre de una columna específica.
	 * @param conexion
	 */
	public static String  muestraNombreColumna(Connection conexion, String tabla, int orden) {	
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("describe " + tabla);
			
		   
			for (int i = 0; i < orden; i++) {
				rs.next();
			}
			
			return rs.getString (1);
		}
		catch (SQLException ex) {
		}
		
		return null;
	}
	
}
