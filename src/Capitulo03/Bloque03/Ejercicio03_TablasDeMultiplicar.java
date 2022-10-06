package Capitulo03.Bloque03;

import javax.swing.JOptionPane;

//3º.- Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.

public class Ejercicio03_TablasDeMultiplicar {

	public static void main(String[] args) {
		int num = 1, mu;
		String ventana;
		
		for (int i = 0 ;num != 0; i++) {
			ventana =JOptionPane.showInputDialog("Introduce un número");
			num = Integer.parseInt(ventana);
			if(num != 0) {
				for (int j = 0; j <= 10; j++) {
					System.out.println("El número " + num + " multiplicado por " + j + " es: " + (num * j));
				}
			}
		}

		
	}
}
