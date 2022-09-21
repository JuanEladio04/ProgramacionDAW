package Capitulo01.Bloque01;

import java.util.Scanner;

public class Ejercicio05_IntercambioDeVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce los valores que desea intercambiar: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num;				
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
