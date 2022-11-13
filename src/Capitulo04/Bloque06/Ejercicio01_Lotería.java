package Capitulo04.Bloque06;

//1.- Realiza un programa que genere una apuesta aleatoria de la lotería primitiva. Consiste en generar seis números y otro complementario entre 1 y 49 que no se repitan. Ejemplo: Combinación: 2 14 20 37 39 41 complementario: 13. Utiliza un array, en el ejemplo expuesto sería un array de 7 posiciones correspondiendo la séptima posición al "complementario" de la loteria.

import java.util.Iterator;

import Utils.Utils;

public class Ejercicio01_Lotería {

	public static void main(String[] args) {
		System.out.println("El número de la lotería es: ");
		int nLoteria[] = Utils.creaArrayNumerosAzarSinRepeticiones(7, 49, 1);
		mostrarLotería(nLoteria);

	}
	
	private static void mostrarLotería(int array[]) {
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print(" complementario: " + array[array.length - 1]);
	}
	

}
