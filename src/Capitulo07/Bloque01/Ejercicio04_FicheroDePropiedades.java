package Capitulo07.Bloque01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//4.- Crea un programa que lea un fichero de propiedades, creado por ti, y que contenga:
//- Una propiedad de tipo texto.
//- Una propiedad de tipo entero.
//- Una propiedad de tipo flotante.
//- Una propiedad de tipo booleano

public class Ejercicio04_FicheroDePropiedades {
	
	private static Properties propiedades = null;

	public Ejercicio04_FicheroDePropiedades() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				File file = new File("./src/Capitulo07/Bloque01/ejer04.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}	

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Boolean getBooleanProperty (String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		String usuario = Ejercicio04_FicheroDePropiedades.getProperty("NOMBREYAPELLIDOS");
		int edad = Ejercicio04_FicheroDePropiedades.getIntProperty("EDAD");
		float porcentaje = Ejercicio04_FicheroDePropiedades.getFloatProperty("PORCENTAJE");
		boolean esUsuario = Ejercicio04_FicheroDePropiedades.getBooleanProperty("USUARIO");
		
		System.out.println("El usuario es " + usuario + " con edad " + edad + " el cul ha obtenido un puntaje de " + porcentaje + ". Estado de usuario: " + usuario);
		
				
	}
	
		

}
