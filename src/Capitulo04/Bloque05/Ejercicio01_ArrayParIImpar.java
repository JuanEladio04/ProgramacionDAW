package Capitulo04.Bloque05;

import utils.Utils;

//1º.- Crea un programa que reciba un array de números enteros creados al azar entre 0 y 100. Se debe examinar la longitud del array, comprobar que la longitud es un valor impar y devolver el valor que se encuentre en la posición media. En caso de que la longitud del array sea un número par se debe devolver un valor -1.

public class Ejercicio01_ArrayParIImpar {

	public static void main(String[] args) {
		int array [] = Utils.creaArrayNumerosAzar(Utils.obtenerNumeroAzar(0, 20), 0, 100);
		
		System.out.println("La secuencia de números es: ");
		Utils.mostrarArray(array);
		
		//Comprobar si el array es par o impar

		
		System.out.println("El resultado es: ");
		System.out.println(getMiddleItem(array));
		
	}
	
	public static int getMiddleItem(int array[]) { //Devolver el resultado
		if ((array.length % 2) == 0) {
			return -1;
		}
		else  {
			return array[array.length / 2];
		}
	}

}
