package Capitulo03.Bloque01;

//1º.- Realiza un programa que pida al usuario cuatro números enteros, y calcule la suma solo de aquellos números introducidos por el usuario, que sean mayores de 10. Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el programa debe calcular la suma solo de 15 más 25, ya que 5 y 6 son menores de 10.

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio01_SumaNumerosMayoresDe10 {

	public static void main(String[] args) {
	
		int num1, num2;
		String ventana;
		num2 = 0;		
		
		for (int i = 1; i <= 4 ; i++) {
			ventana = JOptionPane.showInputDialog("Introduce un número");
			num1 =  Integer.parseInt(ventana);
			if (num1 > 10) {
				num2 = num1 + num2;
			}
		}
		JOptionPane.showMessageDialog(null, "El resultado de la suma es " + num2);
		
		
	}
}
