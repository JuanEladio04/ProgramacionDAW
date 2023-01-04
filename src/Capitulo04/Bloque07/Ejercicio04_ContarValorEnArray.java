package Capitulo04.Bloque07;

import utils.Utils;

//4.- Realiza un método llamado "countOccurrences", que reciba:
//- Un array de números enteros.
//- Un valor entero.
//El método debe devolver un valor entero, que corresponda con el número de veces que el valor entero recibido como segundo parámetro exista dentro del array recibido como primer parámetro.

public class Ejercicio04_ContarValorEnArray {

	public static void main(String[] args) {
		//Generamos la secuencia de números y la mostramos.
		int secuence [] = Utils.creaArrayNumerosAzar(100, 0, 50);
		Utils.mostrarArray(secuence);
		
		//Pedimos al usuario el valor que quiere que contemos dentro del array.
		int count = Utils.pideNumeroJOptionPane("Introduce el valor que desea contar: ");
		int counter = countOccurrences(secuence, count); //Contamos los valores que se repiten.
		
		//Por ultimo mostramos la cantidad de veces que el valor se repite dentro del array;
		System.out.println("El número aparece " + counter + " veces.");
		
	}
	

	public static int countOccurrences(int array[], int count) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == count) counter++;
		}
		
		return counter;
	}

}
