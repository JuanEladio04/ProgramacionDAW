package Capitulo08.bloque02.controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.Utils;

public class Update {

	public static void realizaUpdate(Connection conexion, String tabla) throws SQLException {
		Statement s = (Statement) conexion.createStatement(); 
		int id = Utils.pideNumeroScanner("Introduce el id del objeto a modificar");
		String sentencia = obtenerYPedirDatosAlUsuario(conexion, tabla ,id);

		int filasAfectadas = s.executeUpdate("update tutorialjavacoches." + tabla 
							+" " + sentencia + "\r\n"
							+ " where id = " + id);
		
		s.close();
	}
	
	/**
	 * Metodo para asignar valores a las variables
	 * @param conexion
	 * @param tabla
	 * @param id
	 * @return
	 */
	private static String obtenerYPedirDatosAlUsuario(Connection conexion, String tabla, int id) {
		String valorUsuario, valor, sentencia = " set ";
		
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("describe " + tabla);
			
		     int numColumnas=rs.getMetaData().getColumnCount();
			
			for (int i = 2; i < numColumnas ; i++) {
				valorUsuario = null;
				valorUsuario = Utils.pideStringScanner("Introduce el valor de la columna: " + Listado.muestraNombreColumna(conexion, tabla, i));
					
				if (valorUsuario != null && valorUsuario.isEmpty() == false) {
					valor = valorUsuario;
				}
				else {
					valor = obtenerDatosExistentes(conexion, tabla, i, i);
				}
				
				if (i == numColumnas - 1) {
					sentencia = sentencia + " " + Listado.muestraNombreColumna(conexion, tabla, i) + " = '" + valor + "'";
				}
				else {
					sentencia = sentencia + " " + Listado.muestraNombreColumna(conexion, tabla, i) + " = '" + valor + "', ";
				}
			}
			
			return sentencia;
			
		}
		catch (SQLException ex) {
			System.out.println("No es posible asignar datos");
		}
		return null;
	}
	
	/**
	 * Metodo para obtener datos ya existentes
	 * @param conexion
	 * @param tabla
	 * @param orden
	 * @param id
	 * @return
	 */
	private static String obtenerDatosExistentes(Connection conexion, String tabla, int orden, int id) {
		try {
			Statement s = (Statement) conexion.createStatement(); 

			ResultSet rs = s.executeQuery ("select * from " + tabla);
			
		    int numColumnas = rs.getMetaData().getColumnCount();
		   
			for (int i = 0; i < id; i++) {
				rs.next();
			}
			System.out.println(rs.getString(orden));
			return rs.getString(orden);
		    
		}
		catch (SQLException ex) {
			System.out.println("No es posible dar un valor existente en la base de datos");
		}
		return null;
	}
	
}
