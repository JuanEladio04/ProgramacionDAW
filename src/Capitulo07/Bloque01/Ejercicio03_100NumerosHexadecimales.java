package Capitulo07.Bloque01;

import java.util.Iterator;

//3º.- Realizar un programa que imprima los 100 primeros números enteros en código hexadecimal.

public class Ejercicio03_100NumerosHexadecimales {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println("El número " + i + " en hexadecimal es: " + Integer.toHexString(i));
		}
		
	}

}
