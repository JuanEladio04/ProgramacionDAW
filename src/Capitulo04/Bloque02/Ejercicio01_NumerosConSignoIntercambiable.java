package Capitulo04.Bloque02;

import java.util.Iterator;

//1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y 100. Debes conseguir que todos los números pares del array cambien de signo, los positivos deben pasar a negativos y viceversa.

public class Ejercicio01_NumerosConSignoIntercambiable {

	public static void main(String[] args) {
		int secuencia [] = new int [150];
		
		System.out.println("ANTES: "); //Generamos la secudncia de números aleatoria.
		for (int i = 0; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random()* (100 - (-100)) + (-100));
			System.out.print(secuencia [i] + " ");
		}
		
		System.out.println("\n" + "DESPUES: "); //Tras esto comprobamos que los números sean pares.
		for (int i = 0; i < secuencia.length; i++) {
			if ((secuencia[i] % 2) == 0) {
				secuencia[i] = secuencia[i] * -1; //Mediante esta operacion pasamos el numero positivo a negativo y el negativo a positivo. 
			}
			System.out.print(secuencia[i] + " ");
		}	
 		
	}

}
