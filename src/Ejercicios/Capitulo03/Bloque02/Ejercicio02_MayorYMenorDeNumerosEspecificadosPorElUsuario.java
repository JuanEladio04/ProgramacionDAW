package Ejercicios.Capitulo03.Bloque02;

//2º.- Mayor y menor de una cantidad de números dada por el usuario. El usuario introducirá una cantidad de números, tras lo cual se le deben pedir tantos como este haya indicado. Al final se debe imprimir el mayor y el menor de todos los introducidos.

import javax.swing.JOptionPane;

public class Ejercicio02_MayorYMenorDeNumerosEspecificadosPorElUsuario {

	public static void main(String[] args) {
		int num,numBucle, numMenor = 0, numMayor = 0;
		String ventana;
		
		ventana = JOptionPane.showInputDialog("Introduce el límite de números.");
		numBucle = Integer.parseInt(ventana);
				
		for (int i = 0; i < numBucle; i++ ) {
			ventana = JOptionPane.showInputDialog("Introduce un número");
			num = Integer.parseInt(ventana);
			
			if (i == 0) {
				numMayor = num;
				numMenor = num;
			}
			else {
				if (num > numMayor) {
					numMayor = num;
				}
				if (num < numMenor) {
					numMenor = num;
				}
			}
		}
		
		System.out.println("El número mayor es " + numMayor + " y el número menor es " + numMenor);
		 
	}
}
