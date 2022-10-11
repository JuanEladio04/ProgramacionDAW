package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

//4º.- Crea un programa que pida al usuario un número e imprima ese número en binario. Tienes prohibido el uso del bucle "for".4º.- Crea un programa que pida al usuario un número e imprima ese número en binario. Tienes prohibido el uso del bucle "for".

public class Ejercicio04_NumerosEnBinario {

	public static void main(String[] args) {
		int num, mascara = 128;
		String ventana;
		
		ventana = JOptionPane.showInputDialog("Introduce el número que desea convertir en binario");
		num = Integer.parseInt(ventana);
		
		System.out.println("El número en binario es: ");
		
		while (mascara > 0) {
			if ((num & mascara) == 0) {
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
			mascara = mascara / 2;
		}
		
	}

}
