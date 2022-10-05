package Capitulo03.Bloque02;

import javax.swing.JOptionPane;

//3º.- Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario. Se imprimirán todos los múltiplos menores de 100, este será el límite.

public class Ejercicio03_MultiplosMenoresDe100 {

	public static void main(String[] args) {
		int num;
		String ventana;
		
		ventana = JOptionPane.showInputDialog("Introduce el número del que desea saber los multiplos.");
		num = Integer.parseInt(ventana);
		
		for (int i = 100 ; i > 0 ; i--) {
			
			if ((num % i) == 0) {
				System.out.println(i + " es múltiplo de " + num);
			}
		}

		
	}
}
