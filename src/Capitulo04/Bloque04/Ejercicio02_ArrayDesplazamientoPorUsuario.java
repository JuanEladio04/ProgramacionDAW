package Capitulo04.Bloque04;

import Utils.Utils;

public class Ejercicio02_ArrayDesplazamientoPorUsuario {

	public static void main(String[] args) {
		int array [] = new int [10], inicial = 0, end = 0, aux;
		 
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.pideNumeroJOptionPane("Introduce un número entre 0 y 9");
		}
		System.out.println("La secuencia inical es: ");
		Utils.mostrarArray(array);
		
		do {	//Creamos un bucle para que no nos permita que el inicial sea mayor que el final
			inicial = Utils.pideNumeroJOptionPane("Introduce la posición inicial");
			end = Utils.pideNumeroJOptionPane("Introduce la posicion final");
		} while (inicial >= end);
		
		aux = array[array.length - 1];
		for (int i = array.length - 1; i >= 0; i--) {
			if (i != 0) {
				if (array [i] == array [end]) {	// Con esto evitaremos que los numeros dentro de nuestro intervalo roten
					array [end + 1] = array [inicial - 1];
					i = inicial;
				}
				else {
					array[i] = array[i - 1];
				}
			} else {
				array[0] = aux;
			}
		}
		
		System.out.println("La secuencia final es: ");
		Utils.mostrarArray(array);
		
	}
}
