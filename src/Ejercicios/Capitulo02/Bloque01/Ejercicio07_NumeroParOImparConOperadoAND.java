package Ejercicios.Capitulo02.Bloque01;

import java.util.Scanner;

/*
 * 7º.- Utiliza la operación AND y el operador "if", para tratar de averiguar si un número introducido por el usuario es par o impar. Sería recomendable que estudiases el código de la clase "OperadoresANivelDeBits" del capítulo 1 de este tutorial.
 */

public class Ejercicio07_NumeroParOImparConOperadoAND {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca el número: ");
		num = sc.nextInt();
		
		if ((num & 1) == 1) {
			System.out.println("El número es impar");
		}
		else {
			System.out.println("El número es par");
		}
		
		
		
		
	}
}
