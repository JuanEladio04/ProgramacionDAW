package Capitulo01.Bloque01;

import java.util.Scanner;

public class Ejercicio04_MediaDeLosTresNumerosIntroducidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce los números los 3 números de los que quieras hacer la media: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int media = ((num1 + num2 + num3)/3);
		
		System.out.println("La media de estos tres numeros es de: " + media);
		
	}

}
