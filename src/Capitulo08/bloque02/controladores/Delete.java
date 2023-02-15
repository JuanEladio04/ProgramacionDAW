package Capitulo08.bloque02.controladores;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utils.Utils;

public class Delete {
	
	public static void realizaDelete(String tabla, Connection conexion) throws SQLException {
		
		int idDel = Utils.pideNumeroScanner("Introduce la id del objeto a borrar.");
		
		Statement s = (Statement) conexion.createStatement(); 
		
		int filasAfectadas = s.executeUpdate("Delete from "
				+ "tutorialjavacoches." + tabla
				+ " where id = " + idDel);
		
		System.out.println("Filas afectadas: " + filasAfectadas);
		
		s.close();
	}
	
}
