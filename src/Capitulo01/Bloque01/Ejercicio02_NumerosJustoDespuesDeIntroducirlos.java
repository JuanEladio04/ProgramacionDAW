package Capitulo01.Bloque01;

import java.util.Scanner;

public class Ejercicio02_NumerosJustoDespuesDeIntroducirlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número entero: ");
		int nEntero = sc.nextInt();
		System.out.println("El número entero es: " + nEntero);
		
		System.out.println("Introduzca un número flotante :");
		float nFlotante = sc.nextFloat();
		System.out.println("El número flotante es: " + nFlotante);
		
		System.out.println("Introduzca u número doble: ");
		double nDoble = sc.nextDouble();
		System.out.println("El número doble es: " + nDoble);

	}

}