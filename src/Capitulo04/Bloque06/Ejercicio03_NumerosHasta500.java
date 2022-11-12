package Capitulo04.Bloque06;

import java.util.Iterator;

import Utils.Utils;

//3.- Realizar un programa que genere números aleatorios entre 1 y 1000 hasta que el valor medio de los números generados se aproxime a 500 con un margen de error de 0,5. El programa deberá decir cuantos números aleatorios han sido generados cuando finalice.

public class Ejercicio03_NumerosHasta500 {

	public static void main(String[] args) {
		int suma = 0, contador = 1;
		float media = 0; 
		
		System.out.println("Secuencia de números: ");
		
		do {
			int numero = Utils.obtenerNumeroAzar(1000, 1);
			suma = suma + numero;
			media = suma / contador;
			contador++;
			System.out.print(numero + " ");
		} while(!(media >= 499.5 && media <= 500.5));
		System.out.println();
		System.out.println("La media es de: " + media);
		System.out.println("El total de números es de: " + contador);
		
	}

	
}
