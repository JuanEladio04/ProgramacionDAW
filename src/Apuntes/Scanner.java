package Apuntes;

import java.util.Scanner;

public class Scanner {

	public static void main(String args []) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número entero: ");
		int numEntero = sc.nextInt();
		System.out.println("Valor de numEntero: " + numEntero);
	}
}
