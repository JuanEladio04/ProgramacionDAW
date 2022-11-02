package Ejercicios.Capitulo02.Bloque01;
/*
 * 3º.- Repetir el ejercicio 1º de este bloque de ejercicios, pero pidiendo al usuario cinco variables. Es decir, se pedirán al usuario cinco variables y se mostrará el mayor valor en pantalla.
 */

import javax.swing.JOptionPane;

public class Ejercicio03_ElMayorDe5Numeros {

	public static void main(String[] args) {
		 String ventana;
		 int num1;
		 int num2;
		 int num3;
		 int num4;
		 int num5;		 
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del primer número; ");
		 num1 = Integer.parseInt(ventana);
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del segundo número; ");
		 num2 = Integer.parseInt(ventana);

		 ventana = JOptionPane.showInputDialog("Introduce el valor del tercer número; ");
		 num3 = Integer.parseInt(ventana);
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del cuarto número; ");
		 num4 = Integer.parseInt(ventana);
		 
		 ventana = JOptionPane.showInputDialog("Introduce el valor del quinto número; ");
		 num5 = Integer.parseInt(ventana);
		 
		 
		 if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5))	{
			 System.out.println("El número mayor es: " + num1);
		 }
		 else {
			 if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5))	{
				 System.out.println("El número mayor es: " + num2);
			 }
			 else {
				 if ((num3 > num2) && (num3 > num1) && (num3 > num4) && (num3 > num5))	{
					 System.out.println("El número mayor es: " + num3);
				 }
				 else {
					 if ((num4 > num2) && (num4 > num3) && (num4 > num1) && (num4 > num5))	{
						 System.out.println("El número mayor es: " + num4);
					 }
					 else {
						 if ((num5 > num2) && (num5 > num3) && (num5 > num4) && (num5 > num1))	{
							 System.out.println("El número mayor es: " + num5);
						 }
					 }
				 }
			 }
		 }

		 
		 
	}

}
