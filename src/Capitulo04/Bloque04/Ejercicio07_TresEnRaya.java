package Capitulo04.Bloque04;

import java.util.Iterator;

import javax.swing.JOptionPane;

import utils.Utils;
import utils.UtilsMatrices;

//7.- Programa el juego de las tres en raya.

public class Ejercicio07_TresEnRaya {

	public static void main(String[] args) {
		int tablero [][] = UtilsMatrices.CreaMatriz(3, 3, 0);
		int x, y, turno = 1, resultado = 0;
		boolean marcada;
		
		System.out.println("3 en Raya: ");
		UtilsMatrices.muestraMatriz(tablero);
		
		do {
//			Turno de la X
			do {
				marcada = false;
				System.out.println("Turno de X: ");
				x = Utils.pideNumeroJOptionPane("Introduce la x: ") - 1;
				y = Utils.pideNumeroJOptionPane("introduce la y: ") - 1;
				if (tablero[x][y] != 0) {
					System.out.println("Esa casilla ya está marcada.");
					marcada = true;
				}
				else tablero[x][y] = 3;
			}while(marcada == true);
			
			UtilsMatrices.muestraMatriz(tablero);
			
			//Comprobar resultados
			
			resultado = ganador(tablero);
			if (resultado == 1) {
				System.out.println("El ganador es el jugador 1");
				break;
			}
			else {
				if (resultado == 2) {
					System.out.println("El ganador es el jugador 2");
					break;
				}
			}
			
//			Turno del O
			do {
				marcada = false;
				System.out.println("Turno del O: ");
				x = Utils.pideNumeroJOptionPane("Introduce la x: ") - 1;
				y = Utils.pideNumeroJOptionPane("introduce la y: ") - 1;
				if (tablero[x][y] != 0) {
					System.out.println("Esa casilla ya está marcada.");
					marcada = true;
				}
				else tablero[x][y] = 5;
			}while(marcada == true);
			
			UtilsMatrices.muestraMatriz(tablero);
			
			//Comprobar resutados
			
			resultado = ganador(tablero);
			if (resultado == 1) {
				System.out.println("El ganador es el jugador 1");
				break;
			}
			else {
				if (resultado == 2) {
					System.out.println("El ganador es el jugador 2");
					break;
				}
			}
			
			turno++;
		}while (turno < 9);
		
		
	}
	
	public static int ganador(int tablero[][]) {
		int resultado = 0;
		
		 if(tablero[0][0] == 3 && tablero[0][1] == 3 && tablero[0][2] == 3 ||
			tablero[1][0] == 3 && tablero[1][1] == 3 && tablero[1][2] == 3 ||
			tablero[2][0] == 3 && tablero[2][1] == 3 && tablero[2][2] == 3 ||
			tablero[0][0] == 3 && tablero[1][0] == 3 && tablero[2][0] == 3 ||
			tablero[0][1] == 3 && tablero[1][1] == 3 && tablero[2][1] == 3 ||
			tablero[0][2] == 3 && tablero[1][2] == 3 && tablero[2][2] == 3 ||
			tablero[0][0] == 3 && tablero[1][1] == 3 && tablero[2][2] == 3 ||
			tablero[2][0] == 3 && tablero[1][1] == 3 && tablero[0][2] == 3) {
			resultado = 1;
		 }
		 else {
			 if(tablero[0][0] == 3 && tablero[0][1] == 3 && tablero[0][2] == 3 ||
						tablero[1][0] == 5 && tablero[1][1] == 5 && tablero[1][2] == 5 ||
						tablero[2][0] == 5 && tablero[2][1] == 5 && tablero[2][2] == 5 ||
						tablero[0][0] == 5 && tablero[1][0] == 5 && tablero[2][0] == 5 ||
						tablero[0][1] == 5 && tablero[1][1] == 5 && tablero[2][1] == 5 ||
						tablero[0][2] == 5 && tablero[1][2] == 5 && tablero[2][2] == 5 ||
						tablero[0][0] == 5 && tablero[1][1] == 5 && tablero[2][2] == 5 ||
						tablero[2][0] == 5 && tablero[1][1] == 5 && tablero[0][2] == 5) {
						resultado = 2;
			 }
		 }
		return resultado;
	}

}
