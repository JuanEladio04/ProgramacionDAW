package Ejercicios.Capitulo03.Bloque02;

//1º.- Media de una cantidad de números introducidos por el usuario. El usuario especificará una cantidad de números, tras lo cual se le deben pedir tantos como este haya indicado. Al final se debe imprimir la media.

import javax.swing.JOptionPane;

public class Ejercicio01_MediaNumerosEspecificados {

	public static void main(String[] args) {
		int num, numSuma, numTotal = 0;
		String ventana;
		
		ventana = JOptionPane.showInputDialog("Introduce la cantidad de números de la que desea hacer la media");
		num = Integer.parseInt(ventana);
				
		for (int i = 0; i < num; i++ ) {
			ventana = JOptionPane.showInputDialog("Introduce un número");
			numSuma = Integer.parseInt(ventana);
			
			numTotal = numSuma + numTotal;
			
		}
		System.out.println("La media de estos números es de " + (numTotal / num));
		 
	}

}
