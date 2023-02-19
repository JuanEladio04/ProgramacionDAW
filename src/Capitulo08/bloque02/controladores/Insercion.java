package Capitulo08.bloque02.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.Utils;

public class Insercion {
	
	/**
	 * Realiza un insert
	 * @param conexion
	 * @throws SQLException
	 */
	public static void realizaInsert(Connection conexion, String tabla) throws SQLException {
		
	    int numColumnas;
	    String valorUsuario;
	    
	    numColumnas = Listado.obtenerNumeroColumnas(tabla, conexion);

		PreparedStatement ps = conexion.prepareStatement(
				"insert into tutorialjavacoches." + tabla
				+ " values (" + columnasAInsertar(numColumnas) + ")");
		
		ps.setInt(1, getSiguienteIdValido(conexion, tabla));		
		
		for (int i = 2; i <= numColumnas ; i++) {
			valorUsuario = Utils.pideStringScanner("Introduce el valor de la columna: " + Listado.muestraNombreColumna(conexion, tabla, i));
			try {
				ps.setInt(i, Integer.parseInt(valorUsuario));
			} catch (Exception e) {
				ps.setString(i, valorUsuario);
			}
		}
		
		int filasAfectadas = ps.executeUpdate();
		
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		ps.close();
	}
	
	/**
	 * Genera el siguiente if válido
	 * @return
	 * @throws SQLException 
	 */
	private static int getSiguienteIdValido(Connection conexion, String tabla) throws SQLException {
		Statement s = conexion.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId "
				+ "from tutorialjavacoches." + tabla);
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		
		return 1;
	}
	
	/**
	 * Genera un String con la cantidad necesaria de columnas para insertar
	 * @param numColumnas
	 * @return
	 */
	public static String columnasAInsertar(int numColumnas) {
		String columnas = "?";
		
		for (int i = 0; i < numColumnas - 1; i++) {
			columnas = columnas +", ?";
		}
		
		return columnas;
	}

	
}
