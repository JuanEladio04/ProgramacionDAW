package Ejercicios.Capitulo04.Bloque02;

import java.util.Scanner;

//3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, pedido al usuario.

public class Ejercicio03_MultiplicarArray {

	public static void main(String[] args) {
		int num, secuencia [] = new int [150];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Secuencia de números: "); //Generamos la secuencia de números.
		for (int i = 0; i < secuencia.length; i++) { 
			secuencia [i] = (int) Math.round(Math.random()* 100);
			System.out.print(secuencia [i] + " ");
		}
		
		System.out.println("\n" + "Introduce el número por el que desea multiplicar los valores del array: ");
		num = sc.nextInt();
		
		System.out.println("La secuencia de números una vez multiplicada corresponde a los siguientes valores: ");
		for (int i = 0; i < secuencia.length; i++) { 
			secuencia [i] = secuencia [i] * num;
			System.out.print(secuencia [i] + " ");
		}
	}

}
