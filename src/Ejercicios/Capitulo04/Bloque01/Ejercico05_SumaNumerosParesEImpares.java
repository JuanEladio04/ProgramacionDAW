package Ejercicios.Capitulo04.Bloque01;

//5º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes obtener la suma de los números pares y los impares en variables separadas.

import java.util.Scanner;

public class Ejercico05_SumaNumerosParesEImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pares = 0, impares = 0;
		int secuencia[] = new int [150];
		
		System.out.println("La secuencia es de: ");
		
		for (int i = 0; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random() * 100);
			System.out.print(secuencia[i] + " ");
		}
		
		for (int i = 0 ; i < secuencia.length; i++) {
			if ((secuencia[i] % 2) == 0) {
				pares = pares + secuencia[i];
			}
			else {
				impares = impares + secuencia[i];
			}
		}
		System.out.println("\n" + "La suma de los pares es: " + pares);
		System.out.println("La suma de los impares es: " + impares);
				
	}

}
