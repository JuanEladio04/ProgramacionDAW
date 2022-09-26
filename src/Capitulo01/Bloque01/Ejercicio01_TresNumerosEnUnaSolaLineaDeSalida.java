package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 1.- Realiza un programa que pida al usuario tres números: uno de tipo entero, otro de tipo flotante y otro de tipo doble. A continuación se tienen que mostrar en pantalla los tres números en una sola fila de la consola de salida.
 */

public class Ejercicio01_TresNumerosEnUnaSolaLineaDeSalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nEntero;
		float nFlotante;
		double nDoble;
		
		System.out.println("Introduzca un número entero: ");
		nEntero = sc.nextInt();
		
		System.out.println("Introduzca un número flotante :");
		nFlotante = sc.nextFloat();
		
		System.out.println("Introduzca u número doble: ");
		nDoble = sc.nextDouble();
		
		
		System.out.println("El número entero es: " + nEntero + " El numero flotante es: " + nFlotante + " El número Doble es: " + nDoble );
		
	}

}
