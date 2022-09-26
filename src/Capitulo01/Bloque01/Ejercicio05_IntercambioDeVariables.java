package Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 5.- Realiza un programa en Java que pida dos variables al usuario, intercambie los valores de las dos variables y las muestre en pantalla ANTES y DESPUÉS del intercambio de valores.
 */

public class Ejercicio05_IntercambioDeVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1;
		int num2;
		int num;				
		
		System.out.println("Introduce los valores que desea intercambiar: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("ANTES" +
				"\n" + num1 + "       " + num2
				);
		num = num1;
		num1 = num2;
		num2 = num;
		
		System.out.println("DESPUES" + 
				"\n" + num1 + "       " + num2
				);
		
	}

}
