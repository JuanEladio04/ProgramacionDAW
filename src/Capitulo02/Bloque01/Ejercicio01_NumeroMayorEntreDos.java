package Capitulo02.Bloque01;

import javax.swing.JOptionPane;

/*
 * 1º.- Realiza un ejercicio que pida dos variables al usuario, tras lo cual, muestre en pantalla el número mayor de los dos introducidos.
 */

public class Ejercicio01_NumeroMayorEntreDos {

	public static void main(String[] args) {

		String strnum1 = JOptionPane.showInputDialog("Introduzca el primer número: ");
			int num1 = Integer.parseInt(strnum1);
		
		String strnum2 = JOptionPane.showInputDialog("Introduzca el segundo número: ");
			int num2 = Integer.parseInt(strnum2);
		
		if (num1 > num2) {
			System.out.println("El numero mayor es: " + num1);
		}
		else {
			System.out.println("El número mayor es: " + num2);
		}
	}

}
