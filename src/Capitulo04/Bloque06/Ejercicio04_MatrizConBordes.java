package Capitulo04.Bloque06;

import Utils.Utils;

//4º.- Realizar un programa que cree una matriz de tipo char, con 20 filas y 10 columnas. Los elementos que constituyen el borde de la matriz se deben rellenar, mediant bucles, con un asterisco. En el interior de la matriz, no en los bordes, debes crear un caracter '0' en una posición aleatoria. El resto de la matriz debe tener espacios en blanco. Muestra la matriz por consola. Ejemplo:
//********************
//*                  *
//*                  *
//*                  *
//*                  *
//*                  *
//*      0           *
//*                  *
//*                  *
//********************


public class Ejercicio04_MatrizConBordes {

	public static void main(String[] args) {
		char marco [][] = new char [20][10];
		int fila = Utils.obtenerNumeroAzar(1, marco.length -2), columna = Utils.obtenerNumeroAzar(1, marco[1].length - 2); //esto nos servirá para más adelante
		
//		Primero crearemos el marco de asteriscos
		
		for (int i = 0; i < marco.length; i++) {
			for (int j = 0; j < marco[i].length; j++) {
				if (i == 0 || i == marco.length - 1 || j == 0 || j == marco[i].length - 1) {
					marco[i][j] = '*';
				}
				else marco[i][j] = ' ';
			}
		}
		
//		Por ultimo generamoe el 0 en una posición aleatoria;
		
		marco[fila][columna] = '0';
		
//		Mostramos la matriz para ver el resultado
		muestraMatrizChar(marco);
	}

	public static void muestraMatrizChar(char matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	
}
