package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

//1º.- Crea un programa que compruebe si un número es primo o no. Debes pedir al usuario un número y después informar de si se trata de un número primo o compuesto. Tienes prohibido el uso del bucle "for".

public class Ejercicio01_DetectorNumeroPrimoSinBucleFor {

	public static void main(String[] args) {
		int num = 1, i;
		String ventana;
		boolean esPrimo = false;
		
		ventana = JOptionPane.showInputDialog("Introduce un número: ");
		num = Integer.parseInt(ventana);
		i = num - 1;
		
		do {
			if ((num % i) != 0) {
				esPrimo = true;
			}
			else {
				esPrimo = false;
			}
			i--;
		}while (i > 1 && esPrimo == true);

		if (esPrimo == true) {
			System.out.println("El número " + num + " es primo");
		}
		else {
			System.out.println("El número " + num + " es compuesto");
		}
	}

}
