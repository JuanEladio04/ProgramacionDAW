package Capitulo04.Bloque07;

import utils.Utils;

//2.- Un método llamado "findAndReplace", que reciba:
//- Un array de números enteros.
//- Un valor entero que debe buscarse en el array.
//- Un valor entero que debe servir para reemplazar.
//El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y reemplazará ese valor con el valor del tercer parámetro.
//El método main debe crear un array, imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola.

public class Ejercicio02_EncontrarYReemplazar {

	public static void main(String[] args) {
		int secuence [] = Utils.creaArrayNumerosAzarSinRepeticiones(20, 0, 100);
		Utils.mostrarArray(secuence); //Mostramos la secuencia de números generada.
		
		//Pedimos al usuario los valores necesarios.
		int find = Utils.pideNumeroJOptionPane("Introduzca el número que desea reemplazar: ");
		int replaze = Utils.pideNumeroJOptionPane("Introduzca el valor por el que desea reemplazarlo: ");
		
		//Mediante el método sustituimos los números.
		secuence = finAndReplaze(secuence, find, replaze);
		Utils.mostrarArray(secuence);
	}
	
	public static int[] finAndReplaze(int array[], int find, int replaze) {
		//Con el siguiente bucle recorremos el array reemplazando los números.
		for (int i = 0; i < array.length; i++) {
			if (array[i] == find) array[i] = replaze;
		}
		
		return array;
	}
}
