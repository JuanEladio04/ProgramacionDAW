package Capitulo06.Bloque01;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

//2.- Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar el contenido de un archivo ficticio. Para hacer esto utilizarás una lista de elementos de tipo String. Cada línea del texto será representada como un String. Debes mostrar un menú en pantalla, que contenga todas las opciones siguientes, y que funcionen adecuadamente:
//a) "Abandonar el programa".
//b) "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al final de la lista que representa tu fichero ficticio.
//b) "Insertar una línea en cualquier posición del texto". Pedirás al usuario un String y un número. Insertarás el String en la línea pedida.
//c) "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de línea para sobrescribir, mostrarás al usuario la línea actual que desea sobrescribir. Pedirás un nuevo String. Eliminarás el String actual y cambiarás con el nuevo
//d) "Borrar una línea". Pedirás un número de línea y la eliminarás de la lista.
//e) "Cortar un conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un número de línea inicial y uno final. "Transportarás todas las líneas del intervalo a una nueva lista y las borrarás de la lista original.
//f) "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás un número de línea en la que insertar lo que tienes cortado con la opción anterior.
//g) "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá numerada en la consola.

public class Ejercicio02_EditorDeTextos {

	public static void main(String[] args) {
		int option;
		List<String> textLines = new ArrayList<String>();
		
		do {
			System.out.println("Introcuce una opción:"
								+ "\n" + "1. Abandonar programa."
								+ "\n" + "2. Agregar línea de texto."
								+ "\n" + "3. Insertar una línea en cualquier posición del texto."
								+ "\n" + "4. Editar linea de texto."
								+ "\n" + "5. Borrar línea de texto."
								+ "\n" + "6. Cortar conjunto de líneas."
								+ "\n" + "7. Pegar conjunto de líneas cortadas en determinada posición."
								+ "\n" + "8. Mostrar fichero."
								);
			option = Utils.pideNumeroScanner("");
			
			switch (option) {
			case 1: //Abandonar programa
				System.exit(0);
				break;
				
			case 2: // Agregar línea de texto.
				// Pedimos la línea de texto.
				textLines.add(new String(Utils.pideStringScanner("Escribe la linea de texto que desea agregar al documento.")));
				break;
				
			case 3: //Agregar línea de texto en cualquier posición.
				option = Utils.pideNumeroScanner("¿En que posición desea agregar la línea de texto?"); //Pedimos la línea de texto en la que queremos agregarlo.
				textLines.add(option - 1, new String(Utils.pideStringScanner("Introduce la línea de texto."))); // Pedimos la línea de texto.
				break;
				
			case 4: //Editar línea de texto.
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				break;
				
			case 8:
				
				break;

			default:
				System.out.println("Introduce un valor válido.");
				break;
			}
		}while(true);
		
	}

}
