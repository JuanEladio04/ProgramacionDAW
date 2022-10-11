package Capitulo03.Bloque04;

import javax.swing.JOptionPane;

public class Ejercicio05_FactorialDeUnNumero {

	public static void main(String[] args) {
		int num, fact;
		String ventana;
		
		ventana = JOptionPane.showInputDialog("Introduce el número del que desea hacer el factorial");
		num = Integer.parseInt(ventana);
		fact = num;
		System.out.println("El factorial del número " + num + " es: ");
		
		while (num > 1) {
			System.out.print(" x " + num);
			num--;
			fact = fact * num;
		}
		
		System.out.print(" = " + fact);
		
	}

}
