package Capitulo04.Bloque05;

import utils.Utils;

public class Ejercicio03_ArrayConDecimalesPorEcimaDeUnValor {

	public static void main(String[] args) {
		int enteros[] = Utils.creaArrayNumerosAzar(20, 0, 100);
		float decimales[] = Utils.getArrayWithDecimals(20, 0, 1);
		float contador;
 		
		
		contador = isInTheRange(decimales);
		
		
		for (int i = 0; i < decimales.length; i++) {
			decimales [i] = (float)enteros[i] + decimales[i]; 
		}
		
		Utils.showArrayWithDecimals(decimales);
		
		System.out.println();
		System.out.println("La cantidad de números entre 0.0 y 0.49 es: " + (int)contador);			
		
	}
	
	public static float isInTheRange(float array[]) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0.49) {
				contador++;
			}
		}
		
		return contador;
		

	}
	
}
