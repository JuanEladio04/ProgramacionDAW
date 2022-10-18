package Capitulo04.Bloque01;

//6º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes mostrar al usuario la suma de los elementos cuyo índice sea par.

import java.util.Scanner;

public class Ejercico06_SumaIndiceNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		int secuencia[] = new int [150];
		
		System.out.println("La secuencia es de: ");
		
		for (int i = 0; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random() * 100);
			System.out.print(secuencia[i] + " ");
		}
		
		for (int i = 0; i < secuencia.length; i++) {

		}
		
				
	}

}
