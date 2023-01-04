package Capitulo04.Bloque04;

import utils.Utils;
import utils.UtilsMatrices;

//6.- Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.

public class Ejercicio06_TableroDeAjedrez {
	public static void main(String[] args) {
		int xAlfil, yAlfil;
		int tablero [][] = UtilsMatrices.CreaMatriz(8, 8, 0);
		boolean dentroLimites ;
		
		System.out.println("Tablero de ajedrez: ");
		UtilsMatrices.muestraMatriz(tablero);
	
		xAlfil = Utils.pedirNumeroEntreLimites(8, 1, "Introduce la fila") - 1;
		yAlfil = Utils.pedirNumeroEntreLimites(8, 1, "Introduce la columna") - 1;
		
		
//		Colocar el alfil dentro del tablero

		tablero [xAlfil] [yAlfil] = 1;
		
		
//		Diagonal arriba a la izquierda
		
		for (int i = xAlfil - 1, j = yAlfil - 1; i > -1 && j > -1; i--, j--) {
			tablero[i][j] = 2;
		}
			
//		Diagonal arriba a la derecha
		for (int i = xAlfil - 1, j = yAlfil + 1; i > -1 && j < tablero[i].length ; i--, j++) {
			tablero[i][j] = 2;
		}
		
//		Diagonal abajo a la derecha
		for (int i = xAlfil + 1, j = yAlfil + 1; i < tablero.length && j < tablero[i].length ; i++, j++) {
			tablero[i][j] = 2;
		}
//		Diagonal abajo a la izquierda
		for (int i = xAlfil + 1, j = yAlfil - 1; i < tablero.length && j > -1 ; i++, j--) {
			tablero[i][j] = 2;
		}
		
		UtilsMatrices.muestraMatriz(tablero);
		
	}

}
