package examenes.examen20230209;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import Capitulo06.Bloque02.objects.Producto;
import Capitulo07.Bloque01.Ejercicio04_FicheroDePropiedades;

//Crea un fichero de propiedades, asígnale al menos cuatro propiedades con cualquier nombre
//pero cuyo valor sea numérico. Asígnale también cuatro propiedades con cualquier nombre pero con valor
//de tipo String. Lee el fichero de propiedades y pasa todas las propiedades leídas a un objeto de tipo
//Hashmap<String, Object>. Extrae todos los objetos almacenados en el Hashmap, localiza sólo aquellos
//cuyo valor sea numérico y pasa estos valores a un objeto de tipo List<Integer>.

public class Ejercicio01_FicheroDePropiedades {

	private static Properties propiedades = null;

	public Ejercicio01_FicheroDePropiedades() {
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
				File file = new File("./src/examenes/examen20230209/examen.properties");
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

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		List<Integer> numberList = new ArrayList<Integer>();
		
		int edad = Ejercicio01_FicheroDePropiedades.getIntProperty("EDAD");
		int nota = Ejercicio01_FicheroDePropiedades.getIntProperty("NOTA");
		int kilometros = Ejercicio01_FicheroDePropiedades.getIntProperty("KILOMETROS");
		int dinero = Ejercicio01_FicheroDePropiedades.getIntProperty("DINERO");
		
		String nombre =  Ejercicio01_FicheroDePropiedades.getProperty("NOMBRE");
		String apellidos =  Ejercicio01_FicheroDePropiedades.getProperty("APELLIDOS");
		String profesion =  Ejercicio01_FicheroDePropiedades.getProperty("PROFESION");
		String hobbies =  Ejercicio01_FicheroDePropiedades.getProperty("HOBBIES");
		
		Object claves[] = propiedades.keySet().toArray();
		  
		for (int i = 0; i < claves.length; i++) {
			hm.put(claves[i], propiedades.get(claves[i]).toString());
		}
		numberList = creaLista(hm);

		muestraHashMap(hm, numberList);
	}
	
	
	/**
	 * 
	 * @param hm
	 */
	public static void muestraHashMap(HashMap hm, List<Integer> numberlist) {
		System.out.println("HashMap: ");
		if(hm.isEmpty()) {
			System.out.println("No hay elementos en la lista");
		}
		else {
			Object claves[] = hm.keySet().toArray(); 
			for (int i = 0; i < claves.length; i++) {
				System.out.println("Clave: " + claves[i] + " - Propiedad obtenida: "  + hm.get(claves[i]));
			}
		}
		
		System.out.println("Lista: ");
		for (Integer numero : numberlist) {
			System.out.println(numero); //
		}
	}
	
	public static List<Integer> creaLista(HashMap hm) {
		List<Integer> numberList = new ArrayList<Integer>();

		Object claves[] = hm.keySet().toArray(); 
		for (int i = 0; i < claves.length; i++) {
			try {
				numberList.add(Integer.parseInt((String) hm.get(claves[i])));
			} catch (NumberFormatException ex) {
				
			}
		}
		
		return numberList;
	}

}
