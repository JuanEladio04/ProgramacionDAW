package examenes.examen20221123;

import java.util.Iterator;

//(2,5 puntos) Crea una clase con un método “main” que cree una matriz cuadrada de 4x4 con los
//siguientes datos [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]. Debes crear y usar un
//método que reciba como argumento de entrada una matriz cuadrada y devuelva true si todos los
//elementos están ordenados en un orden de lectura de izquierda a derecha y de arriba hacia abajo.
//Si los elementos no están ordenados se debe devolver un valor false. Prueba el método con la
//matriz que has creado.

public class Ejercicio01_MatrizOrdenada {

	public static void main(String[] args) { //Primero generamos una matriz
		int matriz[][] = new int [][] {{1, 2, 3, 4},
									{5, 6, 7, 8},
									{9, 10, 11, 12},
									{13, 14, 15, 16}};
									
		boolean esMatrizOrdenada = matrizOrdenada(matriz); //Mediante esta variable comprobaremos si la matriz está ordenada o no
		
		//Mostramos el resultado
		if(esMatrizOrdenada == true) System.out.println("La matriz es ordenada");
		else System.out.println("La matriz no es ordenada");
		
	}
	
	public static boolean matrizOrdenada(int matriz[][]) {
		boolean esOrdenada = true;
		for (int i = 0; i < matriz.length; i++) { //Creamos dos bucles que recorran la matriz por completo
			for (int j = 0; j < matriz[i].length; j++) {
				if(j != 0 && matriz [i][j] < matriz[i][j - 1]) { //Comprobamos todos los números a excepción del primero de cada array
					esOrdenada = false;
				}
				else {
					if (j == 0 && i != 0 && matriz[i][j] < matriz[i - 1][matriz[i].length - 1]) { //Comprobamos que el primer número de cada array sea mayor que el último del array anterior.
						esOrdenada = false;
					}
				}
			}
		}
		
		//Devolvemos el resultado
		return esOrdenada;
	}

}
