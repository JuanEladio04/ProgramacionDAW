package Capitulo06.Bloque02;

import java.util.HashMap;
import Capitulo06.Bloque02.objects.Producto;
import utils.Utils;

//Dentro del repositorio de tus ejercicios, crea un nuevo paquete llamado "hashMap" y realiza en su interior el siguiente ejercicio:
//
//1º.- Crear una aplicación que gestione los artículos guardados en un almacén, guardándolos dentro de un objeto de tipo HashMap. Cada artículo tiene un código de barras, un número de estante y una cantidad de unidades en stock. La aplicación, que funcionará en la consola, permitirá que el usuario añada artículos nuevos, los borre, actualice el estante y el número de unidades en stock de un artículo, e imprima la lista de artículos. Además el usuario podrá consultar la localización de un determinado artículo por su código de barras. Básicamente deberás crear un menú funcional con las siguientes opciones:
//
//
//  0.- Salir
//  1.- Lista de artículos (Recorrerás todos los artículos guardados en un objeto de tipo HashMap y los imprimirás en consola).
//  2.- Crear un nuevo artículo (Preguntarás al usuario los datos del artículo, crearás el mismo y lo introducirás en el HashMap. Como consejo podrías utilizar el código del artículo como un "key" que te permita encontrarlo dentro del hashMap).
//  3.- Eliminar un artículo (Pedirás el código al usuario, gracias a este código podrás eliminar el artículo del hashMap).
//  4.- Actualizar un artículo (Pedirás el código al usuario, a continuación le pedirás que introduzca el nuevo número de estante y la nueva cantidad de unidades en stock).

public class Ejercicio01_GestionDelAlmacen {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		muestraMenu(hm);
	}
	
	/*
	 * Método con el cual mostraremos el menú.
	 */
	public static void muestraMenu(HashMap hm) {
		int option;
		do {//Creamos un bucle infinito para que el menú se muestre cada vez que se realice una acción.
			//Creamos un menu con las diferentes opciones.
			System.out.println("GESTION DEL ALMACÉN:"
					+ "\n 0.- Salir."
					+ "\n 1.- Mostrar la lista de artículos."
					+ "\n 2.- Crear un nuevo artículo."
					+ "\n 3.- Eliminar un artículo."
					+ "\n 4.- Actualizar un artículo."
					);
			option = Utils.pideNumeroScanner("INTRODUCE UNA OPCIÓN DE LAS ANTERIORES."); //Pedimos una opción al ususario.
			
			 switch (option) {
				case 0: { //Cerrar el programa
					System.exit(0);
				}
				
				case 1: { //Lista de artículos.
					muestraHashMap(hm);
					break;
				}
				
				case 2: { //Crear un nuevo artículo.
					anadeObjeto(hm);
					break;
				}
				
				case 3: { //Eliminar artículo.
					eliminaElemento(hm);
					break;
				}
				
				case 4: { //Actualizar artículo.
					editaElemento(hm);
					break;
				}
				
				default:
					System.out.println("Introduce una opción válida");
					break;
				}
		} while (true);
	}
	
	/*
	 * Con este mmétodo recorreremos el HashMap.
	 */
	public static void muestraHashMap(HashMap hm) {
		//Recorremos el HashMap.
		if(hm.isEmpty()) {
			System.out.println("No hay elementos en la lista");
		}
		else {
			Object claves[] = hm.keySet().toArray();//Creamos una variable para almacenar 
			for (int i = 0; i < claves.length; i++) {
				System.out.println("Codigo de Barras: " + claves[i] + " - Objeto obtenido: "  + hm.get(claves[i])); //Mostramos los objetos.
			}
		}
	}
	
	/*
	 * Metodo para añadir objetos al HashMap.
	 */
	public static void anadeObjeto(HashMap hm) {
		int codigo, estante, stock;
			//Pedimos los datos al usuario.
			codigo = Utils.pideNumeroScanner("Introduce el código de barras.");
			estante = Utils.pideNumeroScanner("Indica el estante en el que se encuentra el producto");
			stock = Utils.pideNumeroScanner("Introduce el stock disponible de este artículo");
			//Añadimos los datos al HashMap.
			hm.put(codigo, new Producto (codigo, estante, stock));
	}
	
	public static void eliminaElemento(HashMap hm) {//Con este método eliminaremos algun elemento de HashMap.
		int option = Utils.pideNumeroScanner("Indica el  el objeto que desea eliminar.");
		hm.remove(option); //Eliminamos el elemento.
	}
	
	public static void editaElemento(HashMap hm) {//Nos permite modificar un valor dentro del HashMap
		int codigo, estante, stock;
		//Pedimos los datos al usuario.
		codigo = Utils.pideNumeroScanner("Introduce el código de barras del objeto que desea modificar.");
		estante = Utils.pideNumeroScanner("Indica el nuevo estante del producto.");
		stock = Utils.pideNumeroScanner("Introduce el nuevo stock disponible del producto");
		
		hm.replace(codigo, new Producto(codigo, estante, stock)); //Reemplazamos los diferentes datos.
	}

}
