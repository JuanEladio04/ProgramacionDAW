package Capitulo04.Bloque04;

import Utils.Utils;

//1.- Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.

public class Ejercicio01_ArrayConPrimerosNumerosPares {

	public static void main(String[] args) {
		
		int secuencia [] = Utils.creaArrayNumerosAzar(20, 0, 100);
		int aux [] = new int [20];
		int j = 0;
		
		System.out.println("La secuencia numerica es: ");
		Utils.mostrarArray(secuencia);
		
		//Bucle para escribir los números pares
		for (int i = 0; i < secuencia.length; i++) {
			if ((secuencia [i] % 2) == 0) {
				aux [j] = secuencia [i];
				j++;
			}
		}
		
		//Bucle para escribir los números impares
		for (int i = 0; i < secuencia.length; i++) {
			if ((secuencia [i] % 2) != 0) {
				aux [j] = secuencia [i];
				j++;
			}
		}
		
		System.out.println("\nLa secuencia separado los pares y los impares es: ");
		Utils.mostrarArray(aux);
		
	}

}
