package Capitulo04.Bloque06;

import java.util.Iterator;

import Utils.Utils;

//2.- Realiza un programa que dibuje en la pantalla una onda aleatoria de asteriscos. Para resolver este problema utilizarás matrices de tipo char. En un tipo char guardas un carácter. Por ejemplo, la línea "char variable = 'p';" crea una variable de tipo char y le asigna la letra 'p' minúscula. Crea una matriz de 10 filas y 30 posiciones por fila, de tipo char, a continuación genera en cada fila un número aleatorio de asteriscos, cuando acabes en cada fila de introducir asteriscos, rellena el resto de la fila con espacios en blanco. Finalmente muestra la matriz en consola. Ejemplo:
//*********
//****************
//*******
//**********************
//****
//**************************
//**
//****
//*******
//**

public class Ejercicio02_OndaDeAsteriscos {

	public static void main(String[] args) {
		char[][] onda = new char[10][30] ;
		
		for (int i = 0; i < onda.length; i++) {
//			Generamos un número al azar para ver la cantidad de asteriscos que tendremos
			int j = Utils.obtenerNumeroAzar(onda[i].length, 1);
			for (; j >= 0; j--) {
				onda[i][j] = '*'; //Generamos los asterscos y mostramos la fila
				System.out.print(onda[i][j]);
				
			}
			System.out.println();
		}
		
	}


}
