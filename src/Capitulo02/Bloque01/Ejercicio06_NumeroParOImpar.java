package Capitulo02.Bloque01;

import java.util.Scanner;

/*
 * 6º.- Realizar un ejercicio en Java que pida un número al usuario e indique en pantalla si se trata de un número par o impar. Recuerda que un número par es aquel cuyo resto de su división entre dos sea siempre cero, y recuerda que un número impar es aquel cuyo resto de su división entre dos sea siempre uno.
 */

public class Ejercicio06_NumeroParOImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		
		
	}
}
