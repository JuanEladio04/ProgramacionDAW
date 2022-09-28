package Capitulo02.Bloque01;

/*
 * 4º.- Repetir el ejercicio 3º de este bloque de ejercicios, pero mostrando el menor valor de los cinco introducidos por el usuario.
 */

import javax.swing.JOptionPane;

public class Ejercicio04_Ejercicio03Invertido {

	public static void main(String[] args) {
		 String ventana;
		 int num1;
		 int num2;
		 int num3;
		 int num4;
		 int num5;		 
		 int numMenor;
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del primer número; ");
		 num1 = Integer.parseInt(ventana);
		 numMenor = num1;
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del segundo número; ");
		 num2 = Integer.parseInt(ventana);
		 if (numMenor < num2) {	}
		 else {
			 numMenor = num2;
		 }
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del tercer número; ");
		 num3 = Integer.parseInt(ventana);
		 if (numMenor < num3) {	}
		 else {
			 numMenor = num3;
		 }
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del cuarto número; ");
		 num4 = Integer.parseInt(ventana);
		 if (numMenor < num4) {	}
		 else {
			 numMenor = num4;
		 }
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del quinto número; ");
		 num5 = Integer.parseInt(ventana);
		 if (numMenor < num5) {	}
		 else {
			 numMenor = num5;
		 }
		 
		 System.out.println("El numero menor es: " + numMenor);
		
	}

}
