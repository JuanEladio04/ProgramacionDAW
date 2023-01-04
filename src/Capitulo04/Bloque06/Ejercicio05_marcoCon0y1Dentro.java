package Capitulo04.Bloque06;

import utils.Utils;

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


public class Ejercicio05_marcoCon0y1Dentro {

	public static void main(String[] args) {
		char marco [][] = new char [20][10];
		
//		Primero crearemos el marco de asteriscos
		
		for (int i = 0; i < marco.length; i++) {
			for (int j = 0; j < marco[i].length; j++) {
				if (i == 0 || i == marco.length - 1 || j == 0 || j == marco[i].length - 1) {
					marco[i][j] = '*';
				}
				else marco[i][j] = ' ';
			}
		}
		
//		Procedemos ha crear el bucle con el cual rellenaremos la matriz de 0 y 1.
		
		for (int i = 1; i < marco.length - 1; i++) {
			for (int j = 1; j < marco[i].length - 1; j++) {
				int num = Utils.obtenerNumeroAzar(1, 0);
				if (num == 1) marco[i][j] = '1';
				else marco[i][j] = '0';
			}
		}
		
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
