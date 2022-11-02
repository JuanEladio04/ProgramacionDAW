package Ejercicios.Capitulo02.Bloque01;

import javax.swing.JOptionPane;

/*
 * 2º.- Repetir el ejercicio anterior para mostrar el número menor de los dos introducidos .
 */
public class Ejercicio02_Ejercicio01Inverso {

	public static void main(String[] args) {

		String contenidoVentana; 
		int num1;
		int num2;
		
		contenidoVentana = JOptionPane.showInputDialog("Introduce el primer número: ");		
		num1 = Integer.parseInt(contenidoVentana);
		
		contenidoVentana = JOptionPane.showInputDialog("Introduce el segundo número: ");	
		num2=Integer.parseInt(contenidoVentana);
		
		
		if (num1 == num2) {
			System.out.println("Deben ser dos números diferentes");
		}
		else {
			if (num1 < num2) {
				System.out.println("El número menor es: " + num1);
			}
			else {
				System.out.println("El número menor es: " + num2);
			}
		}
		
			
	}
}
