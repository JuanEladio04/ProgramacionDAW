package Capitulo04.Bloque04;

import Utils.Utils;

//4.- Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo. Los números dentro de la matriz no pueden repetirse.

public class Ejercicio04_MatrizConNumMinYmax {

	public static void main(String[] args) {
		int matriz [][] = new int [6] [10], mayor = 0, menor = 100;
		boolean seRepite = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				seRepite = false;
				matriz[i][j] = Utils.obtenerNumeroAzar();
				for (int k = 0; k < matriz.length; k++){
					for (int l = 0;l > matriz[k].length; l++){
						if (matriz[i][j] == matriz[k][l]) {
							seRepite = true;
						}
					}
				}
				if (seRepite == false) {
					System.out.print(matriz [i] [j] + "\t");
				}
				if (matriz [i][j] > mayor) {
					mayor = matriz [i][j];
				}
				if (matriz [i][j] < menor) {
					menor = matriz [i][j];
				}
			}
			System.out.println();
		}
			System.out.println("El menor de la matriz es: " + menor);
			System.out.println("El mayor de la matriz es: " + mayor);
	}
}