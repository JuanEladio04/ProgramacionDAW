package Capitulo04.Bloque08;

import Utils.Utils;
import Utils.UtilsMatrices;

public class EjercicioOptativo_Bolos {

	public static void main(String[] args) {
		boolean juegoTerminado = false;
		int option, scorePlayer1= 0, juegos = 0, counter = 0;
		int bolos[][] = new int [][] {{1, 0, 1, 0, 1, 0, 1},
									  {0, 1, 0, 1, 0, 1, 0},
									  {0, 0, 1, 0, 1, 0, 0},
									  {0, 0, 0, 1, 0, 0, 0}};
		
		do {
			System.out.println("Puntuación actual: " + scorePlayer1);
			System.out.println("Juegos jugados: " + juegos);
			UtilsMatrices.muestraMatriz(bolos);
			System.out.println("Opciones: " + "\n" + 
								"1. Lanzar la bola." + "\n" +
								"2. Salir del juego." + "\n");
			option = Utils.pideNumeroScanner("Introduce una opción: ");
			
			//Creamos las distintas opciones del menú
			switch (option) {
			case 1:
				counter = contarBolos(bolos);
				bolos = throwBall(bolos);
				scorePlayer1= scorePlayer1+ scoreCounter(juegos, counter, bolos);
				break;
			
			case 2: //Opción para salir del juego
				System.out.println("Juego terminado");
				System.exit(0);
				break;

			default:
				break;
			}
			
			if ((contarBolos(bolos)) == 0) {
				juegoTerminado = true;
				UtilsMatrices.muestraMatriz(bolos);
			}
			juegos++; //Contador de los juegos.
		}while (juegoTerminado == false);
		
	}
	
	
	public static int[][] throwBall(int matriz[][]) {
		int probability = 30; //Declaramos la probabilidad del primer juego.
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 1) { //Hacemos que si el número generado al azar está dentro de la probabilidad de derribe el bolo.
					if (Utils.obtenerNumeroAzar() < probability) {
						matriz[i][j] = 0;
					}
				}
			}
			
		}
		return matriz;
	}
	
	
	public static int scoreCounter(int juegos, int counter, int matriz[][]) {
		int score = 0, bolos = contarBolos(matriz);
		
		counter = counter - bolos;
		
		//Establecemos las puntuaciones de cada juego
		if (juegos == 0) score = counter * 15;
		else {
			if (juegos == 1) score = counter * 5;
			else {
				if(juegos == 2) score = counter * 2;
				else {
					if (juegos == 3) score = counter;
				}
			}
		}
		
		return score;
	}
	
	
	public static int contarBolos(int matriz[][]) { //Con esta funcion contaremos los bolos que hay actualmente en la pista
		int counter = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 1) counter++;
			}
		}
		return counter;
	}

}
