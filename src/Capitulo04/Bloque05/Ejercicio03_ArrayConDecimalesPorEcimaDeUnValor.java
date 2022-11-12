package Capitulo04.Bloque05;

//3º.- Crea un array de 20 números decimales creados al azar entre 0 y 100. Para crear el número decimal debes generar al azar la parte entera y la parte decimal por separado para después unir las dos partes. A continuación debes examinar la cantidad de números cuya parte decimal está comprendida entre .00 y .49

import Utils.Utils;

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
