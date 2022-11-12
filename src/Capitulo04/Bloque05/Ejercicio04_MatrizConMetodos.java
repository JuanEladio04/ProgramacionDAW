package Capitulo04.Bloque05;

import java.util.Iterator;

import Utils.Utils;

//4º.- Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas. Una vez hecho el array, realiza estos pasos:
//    - Crea un método que rellena la matriz con valores creados al azar.
//    - Crea un método que imprima la matriz en pantalla.
//    - Crea un método que compruebe si la matriz es positiva. (Todos sus elementos mayores o iguales a cero)
//    - Crea un método que compruebe si la matriz es diagonal (Todos los elementos que no están en la diagonal principal son nulos).
//    - Crea un método que compruebe si la matriz es triangular superior. (Todos los elementos que están por debajo de la diagonal principal son nulos).
//    - Crea un método que compruebe si la matriz es dispersa. (Todos las filas y todas las columnas contienen al menos un elemento nulo)
//    - Crea un método que construya un array unidimensional con todos los elementos de la matriz.
//    - Crea un método que compruebe si la matriz es simétrica. (Los elementos de la matriz (i, j) y (j, i), si existen, son iguales).
//    - Crea un método que realice la matriz traspuesta de la que recibe.
//    - Crea un método que realice la matiz opuesta de la que recibe.
//    - Crea un método que pida al usuario un número de fila sobre la matriz. Debes crear una matriz igual a la original pero eliminando el número de fila que el usuario ha especificado.

public class Ejercicio04_MatrizConMetodos {

	public static void main(String[] args) {
//		int matriz[][] = CreaMatriz(5, 5);
		int matriz[][] = new int [][] {{1, 1, 0, 1, 1},
									   {1, 1, 0, 1, 1},
									   {1, 1, 0, 1, 1},
									   {1, 1, 0, 1, 1},
									   {1, 1, 0, 1, 1}};
		
		muestraMatriz(matriz);
		esMatrizPositiva(matriz);
		esMatrizDiagonal(matriz);
		esMatrizTriangularSuperior(matriz);
		esMatrizDispersa(matriz);
		int array[] = matrizUnidimensional(matriz);
		System.out.println();
		esMatrizSimetrica(matriz);
	}
	
	
	public static int [][] CreaMatriz(int filas, int columnas) {
		int matriz [] [] = new int[filas] [columnas];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz [i][j] =Utils.obtenerNumeroAzar();
			}
		} 
		return matriz;
	}
	
	public static void muestraMatriz(int matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void esMatrizPositiva(int matriz [][]) {
		boolean esPositiva = true;
		for (int i = 0; i < matriz.length && esPositiva == true; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] >= 0) {
					esPositiva = true;
				}
				else {
					esPositiva = false;
				}
			}
		}
		if (esPositiva == true) System.out.println("La matriz es positiva");
		else System.out.println("La matriz no es positiva");
	}
	
	public static void esMatrizDiagonal(int matriz [][]) {
		boolean esDiagonal = true;
		
		for (int i = 0; i < matriz.length && esDiagonal == true; i++) {
			for (int j = 0; j < matriz.length; j++) {
				boolean salir = false;
				while (i != j && salir == false) {
					if (matriz[i][j] == 0) esDiagonal = true;
					else esDiagonal = false;
					salir = true;
				}
			}
		}
		if (esDiagonal == true) System.out.println("La matriz es Diagonal");
		else System.out.println("La matriz no es diagonal");
	}
	
	public static void esMatrizTriangularSuperior(int matriz [][]) {
		boolean esTriangular = true, salir = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				salir = false;
				while (i != j && salir == false && esTriangular == true) {
					if (j < i) {
						if (matriz[i][j] == 0) salir = true;
						else esTriangular = false;
					}

					salir = true;
				}
			}
		}
		if (esTriangular == true) System.out.println("La matriz es triangular");
		else System.out.println("La matriz no es triagular");
	}

	public static void esMatrizDispersa(int matriz [][]) {
		int contadorLineas = 1,contadorColumnas = 1 ;
		boolean tieneNulo = false;
		
		for (int i = 0; i < matriz.length; i++) {
			if (tieneNulo == true) contadorLineas++;
			tieneNulo = false;
			for (int j = 0; j < matriz[i].length && tieneNulo == false; j++) {
				if (matriz[i][j] == 0) tieneNulo = true;
			}
		}
		
		tieneNulo = false;
		
		for (int i = 0; i < matriz.length; i++) {
			if (tieneNulo == true) contadorColumnas++;
			tieneNulo = false;
			for (int j = 0; j < matriz[i].length && tieneNulo == false; j++) {
				if (matriz[j][i] == 0) tieneNulo = true;
			}
		}
		
		if(contadorLineas == matriz.length  && contadorColumnas == matriz.length)System.out.println("La matriz es dispersa");
		else System.out.println("La matriz no es dispersa");
	}
	
	public static int[] matrizUnidimensional(int matriz [][]) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma = suma + matriz[i].length;
		}
		int array [] = new int [suma], k = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz [i][j];
				System.out.print(array[k]);
				k++;
			}
		}
		
		return array;
	}

	public static void esMatrizSimetrica(int matriz [][]) {
		boolean esSimetrica = true;
		
		for (int i = 0; i < matriz.length && esSimetrica == true; i++) {
			for (int j = 0; j < matriz[i].length && esSimetrica == true; j++) {
				while (j < matriz[i].length/2) {
					if (matriz[i][j] == matriz [j][i]) esSimetrica = true;
					else {
						esSimetrica = false;
						break;
					}
				}
			}
		}
		if (esSimetrica == true) System.out.println("La matriz es simétrica");
		else System.out.println("La matriz no es simétrica");
	}
	
}
