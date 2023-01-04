package Capitulo04.Bloque05;

import java.util.Iterator;

import utils.Utils;

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
		int fila, columna;
		int matriz[][] = CreaMatriz(5, 5);
//		int matriz[][] = new int [][] {{0, 1, 1, 1, 1},
//									   {1, 0, 1, 1, 1},
//									   {1, 1, 0, 1, 1},
//									   {1, 1, 1, 0, 1},
//									   {0, 1, 1, 1, 1}};
		
		muestraMatriz(matriz);
		esMatrizPositiva(matriz);
		esMatrizDiagonal(matriz);
		esMatrizTriangularSuperior(matriz);
		esMatrizDispersa(matriz);
		System.out.println("Matriz unidimensional: ");
		int array[] = matrizUnidimensional(matriz);
		System.out.println();
		esMatrizSimetrica(matriz);
		System.out.println("Matriz traspuesta");
		int mTraspuesta [][]= creaMatrizTraspuesta(matriz);
		muestraMatriz(mTraspuesta);
		System.out.println("Matriz Opuesta");
		int mOpuesta[][] = creaMatrizOpuesta(matriz);
		muestraMatriz(mOpuesta);
		System.out.println("Matriz eliminando número: ");
		fila = Utils.pideNumeroJOptionPane("Introduzca la fila del número a eliminar: ");
		columna = Utils.pideNumeroJOptionPane("Introduzca la columna del número a eliminar: ");
		int mEliminandoNumero[][] = matrizEliminandoNúmero(matriz, fila, columna);
		muestraMatriz(mEliminandoNumero);
		
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
		boolean hayCeros = false;
		//Buscamos los ceros en las filas
		for (int i = 0; i < matriz.length; i++) {
			hayCeros = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) hayCeros = true;
			}
			//En caso de no encontrar lo notificamos
			if (!hayCeros) {
				System.out.println("La matriz no es dispersa");
				break;
			}
		}
		 //Buscamos ceros en las columnas
		for (int i = 0; i < matriz[0].length; i++) {
			hayCeros = false;
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] == 0) hayCeros = true;
			}
			//En caso de no encontrar ceros lo notificamos
			if (!hayCeros) {
				System.out.println("La matriz no es dispersa");
				break;
			}
		}
		//Por ultimo en caso de que sea correcto devolvemos el resultado
		if (hayCeros == true) System.out.println("La matriz es dispersa");
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
				System.out.print(array[k] + " ");
				k++;
			}
		}
		
		return array;
	}

	public static void esMatrizSimetrica(int matriz [][]) {
		boolean esSimetrica = true;
		//Con este bucle comprobaremos que sea simétrica
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length && i != j; j++) {
				//Verificamos que ambos valores sean iguales
				if (matriz[i][j] != matriz[j][i]) esSimetrica = false;
			}
			//En caso de no ser simétrica saldremos del bucle
			if (!esSimetrica) {
				System.out.println("La matriz no es simétrica");
				break;
			}
		}

		if (esSimetrica == true) {
			System.out.println("La matriz es simétrica");
		}
	}	
	
	public static int[][] creaMatrizTraspuesta(int matriz[][]) {
		//Creamos una matriz con los datos de las filas y las columnas opuestos a los de nuestra matriz normal
		int nTraspuesta [][] = new int [matriz[0].length][matriz.length];
 		
		//Creamos un buble para asignar valores
		for (int i = 0; i < nTraspuesta.length; i++) {
			for (int j = 0; j < nTraspuesta[i].length; j++) {
				//Vamos asignando los valores de las filas a las columnas y viceversa
				nTraspuesta[i][j] = matriz[j][i];
			}
		}
		
		return nTraspuesta;
	}
	
	public static int[][] creaMatrizOpuesta(int matriz [][]) {
		//Declaramos una matriz identica en estructura a la anterior
		int mOpuesta [][] = new int [matriz.length][matriz[0].length];
		
		//Recorremos la nueva matriz mediante un bucle
		for (int i = 0; i < mOpuesta.length; i++) {
			for (int j = 0; j < mOpuesta[i].length; j++) {
				//Por ultimo asignamos los valores
				mOpuesta [i][j] = matriz [i] [(matriz[i].length - j) - 1];
			}
			
		}
		
		return mOpuesta;
		
		}
	
	private static int[][] matrizEliminandoNúmero(int matriz[][], int fila, int columna) {
		//Declaramos una matriz identica en estructura a la anterior
		int mEliminando[][] = new int[matriz.length][matriz[0].length];
		
		//Recorremos la matriz colnando los valores
		for (int i = 0; i < mEliminando.length; i++) {
			for (int j = 0; j < mEliminando[i].length; j++) {
				mEliminando[i][j] = matriz[i][j] ;
			}
		}
		//Eliminamos el valor seleccionado por el usuario sustituyendolo por uno nulo
		mEliminando[fila][columna] = 0;
		return mEliminando;
	}
		
}
