package Capitulo01.Bloque01.copy;

import java.util.Scanner;

/*
 * 4.- Realiza un programa que muestre la media de tres números introducidos.
 */

public class Ejercicio04_MediaDeLosTresNumerosIntroducidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("Introduce los números los 3 números de los que quieras hacer la media: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println("La media de estos tres numeros es de: " + (num1 + num2 + num3)/3.0);
	}

}
