package Capitulo02.Bloque01;

/*
 * 5º.- Pedir al usuario cinco números, e imprimir posteriormente el mayor valor introducido y el menor valor introducido.
 */

import javax.swing.JOptionPane;

public class Ejercicio05_MenorYMayorValorIntroducidoDe5Numeros {

	public static void main(String[] args) {
		 String ventana;
		 int num1;
		 int num2;
		 int num3;
		 int num4;
		 int num5;		 
		 int numMenor;
		 int numMayor;
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del primer número; ");
		 num1 = Integer.parseInt(ventana);
		 numMenor = num1;
		 numMayor = num1;
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del segundo número; ");
		 num2 = Integer.parseInt(ventana);
		 if (numMenor < num2) {	}
		 else {
			 numMenor = num2;
		 }
		 if (numMayor > num2) {	}
		 else {
			 numMayor = num2;
		 }
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del tercer número; ");
		 num3 = Integer.parseInt(ventana);
		 if (numMenor < num3) {	}
		 else {
			 numMenor = num3;
		 }
		 if (numMayor > num3) {	}
		 else {
			 numMayor = num3;
		 }
		 
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del cuarto número; ");
		 num4 = Integer.parseInt(ventana);
		 if (numMenor < num4) {	}
		 else {
			 numMenor = num4;
		 }
		 if (numMayor > num4) {	}
		 else {
			 numMayor = num4;
		 }
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del quinto número; ");
		 num5 = Integer.parseInt(ventana);
		 if (numMenor < num5) {	}
		 else {
			 numMenor = num5;
		 }
		 if (numMayor > num5) {	}
		 else {
			 numMayor = num5;
		 }
		 
		 System.out.println("El numero menor es: " + numMenor + "\nEl numero mayor es: " + numMayor);
		
	}

}
