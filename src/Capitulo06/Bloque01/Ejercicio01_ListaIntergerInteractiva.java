package Capitulo06.Bloque01;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

//Realiza los siguientes ejercicios, utilizando las listas:
//
//1.- Realiza un programa que trabaje con una Lista de elementos Integer. Debes mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a realizar sobre la lista:
//a) "Abandonar el programa".
//b) "Crear aleatoriamente la lista de valores". Pedirás al usuario los siguientes datos: longitud de la lista, valor mínimo y valor máximo. A continuación limpiarás la lista (por si contenía valores), y agregarás tantos elementos enteros como se haya indicado, con valores que deben oscilar entre el mínimo y el máximo señalado.
//c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro valores.
//d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los siguientes datos: cuántos datos nuevos quiere agregar, posición a partir de la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos valores como indique el usuario, en la posición indicada, con valores entre mínimo y máximo.
//e) "Eliminar elementos cuyo valor esté en un intervalo". Pedirás dos valores al usuario (mínimo y máximo), que conforman un intervalo. Eliminarás los valores de la lista de elementos que se encuentren dentro de ese intervalo (incluyendo los límites) e informarás de cuantos elementos has eliminado de la lista.
//f) "Imprimir la lista". Mostrarás la lista en pantalla.

public class Ejercicio01_ListaIntergerInteractiva {

	public static void main(String[] args) {
		int option, repeat, min, max, suma = 0, media, menor, mayor;
		List<Integer> numberList = new ArrayList<Integer>();
				
		do {
			System.out.println("Introcuce una opción:"
								+ "\n" + "1. Crear lista de valores aleatoria."
								+ "\n" + "2. Agregar nuevos valores."
								+ "\n" + "3. Eliminar intervalo de valores."
								+ "\n" + "4. Calcula suma, media, número mayor y número menor."
								+ "\n" + "5. Mostrar lista."
								+ "\n" + "6. Salir."
								);
			option = Utils.pideNumeroScanner("");
			
			switch (option) {
			case 1: //Crear una lista aleatoria
				numberList.clear(); //Lo primero que haremos sera limpiar la lista
				repeat = Utils.pideNumeroScanner("Cuantos números desea añadir a la lista?");
				min = Utils.pideNumeroScanner("Numero mínimo del intervalo del que desea crear los números aleatorios");
				max = Utils.pideNumeroScanner("Numero máximo del intervalo del que desea crear los números aleatorios");
				
				for(int i = 0; i < repeat; i++) {
					numberList.add(new Integer(Utils.obtenerNumeroAzar(max, min))); //Generamos un número al azar para añadirlo a la lista
				}
				
				break;
				
			case 2: //Agregar nuevos valores a la lista.
				//Pedimos los diferentes valores necesarios para generar los nuevos números
				repeat = Utils.pideNumeroScanner("Cuantos números desea añadir a la lista?");
				option = Utils.pideNumeroScanner("A partir de que posición desea añadir los valores?");
				min = Utils.pideNumeroScanner("Numero mínimo del intervalo del que desea crear los números aleatorios.");
				max = Utils.pideNumeroScanner("Numero máximo del intervalo del que desea crear los números aleatorios.");
				
				for(int i = 0; i < repeat; i++) {
					numberList.add(option - 1, new Integer(Utils.obtenerNumeroAzar(max, min))); //Generamos un número al azar para añadirlo a la lista
				}
				
				break;
				
			case 3: //Eliminar un intervalo determinado de valores
				min = Utils.pideNumeroScanner("Numero mínimo del intervalo del que desea eliminar valores.");
				max = Utils.pideNumeroScanner("Numero máximo del intervalo del que desea eliminar valores.");
				
				for(int i = 0; i < numberList.size(); i++) {
					if (i >= min - 1 && i <= max - 1) {
						numberList.remove(i);
					}
				}
				
				break;
				
			case 4:
				
				//Calculamos la suma menor y mayor.
				menor = numberList.get(1);
				mayor = numberList.get(1);
				for (Integer numero : numberList) {
					suma = suma + numero;
					if (numero < menor) menor = numero;
					if (numero > mayor) mayor = numero;
				}
				
				//Calculamos la media
				media = suma / numberList.size();
								
				//Mostramos resultados
				
				System.out.println();
				System.out.println("La suma de todos los números es: " + suma);
				System.out.println("La media de todos los números es: " + media);
				System.out.println("El número mas pequeño es " + menor + " y el mayor es " + mayor);
				System.out.println();
				
				break;
			
			case 5: //Visualizar la lista
				for (Integer numero : numberList) {
					System.out.println(numero); //Mostramos los diferentes valores de la lista mediante el bucle anterior
				}
				break;
				
			case 6: //Salir del programa
				System.exit(0);	
				break;

			default:
				System.out.println("Valor introducido inválido.");
				break;
			}
		} while (true);	

	}

}
