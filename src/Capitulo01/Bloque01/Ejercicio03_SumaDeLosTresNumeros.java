package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 3.- Realiza un programa que pida al usuario tres números y calcule y muestre en pantalla la suma de los tres.
 */

public class Ejercicio03_SumaDeLosTresNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce los números que desee sumar: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("El resultado de la suma es: " +
				(num1 + num2 + num3)
				);
		
		
	}

}
