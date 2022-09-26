package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 2.- Realiza un programa igual al anterior, con la particularidad de que ahora se debe mostrar cada número justo a continuación del momento en que ha sido introducido.
 */

public class Ejercicio02_NumerosJustoDespuesDeIntroducirlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nEntero;
		float nFlotante;
		double nDoble;
		
		
		System.out.println("Introduzca un número entero: ");
		nEntero = sc.nextInt();
		System.out.println("El número entero es: " + nEntero);
		
		System.out.println("Introduzca un número flotante :");
		nFlotante = sc.nextFloat();
		System.out.println("El número flotante es: " + nFlotante);
		
		System.out.println("Introduzca u número doble: ");
		nDoble = sc.nextDouble();
		System.out.println("El número doble es: " + nDoble);

	}

}
