package Capitulo02.Bloque03;

import javax.swing.JOptionPane;

/*
 * 2º.- Realiza una calculadora avanzada, pero con la particularidad de que las operaciones deben ser raices, potencias y el módulo de la división.
 */

public class Ejercicio02_Calculadora {

	public static void main(String[] args) {
		
		String ventana;
		int opcion, num1, num2;
		
		System.out.println(
				"CALCULADORA" + 
				"\nElija una de las opciones" + 
				"\n1.- Raices" + 
				"\n2.- Potencias" + 
				"\n3.- Módulo de división"
				);
		
		ventana = JOptionPane.showInputDialog("Elija una de las opciones");
		opcion = Integer.parseInt(ventana);
		
		switch (opcion) {
		case 1: {
			double numd;
			ventana = JOptionPane.showInputDialog("Número del que desea hacer la raiz");
			num1 = Integer.parseInt(ventana);
			ventana = JOptionPane.showInputDialog("Introduce el índice de la raiz");
			numd = Double.parseDouble(ventana);

			System.out.println(
					"La raíz del número " + num1 +  " es: " + 
					"\n" + ((Math.pow(num1, 1/numd)))
					);
			break;
		}
		case 2: {
			ventana = JOptionPane.showInputDialog("Introduce el número del que desea hacer la potencia: ");
			num1 = Integer.parseInt(ventana);
			ventana = JOptionPane.showInputDialog("Introduce la potencia: ");
			num2 = Integer.parseInt(ventana);
			
			System.out.println(
					"El resultado del número " + num1 + " elevado a " + num2 + " es: " + 
					"\n" + (Math.pow(num1, num2))
					);
			break;
		}		
		case 3: {
			ventana = JOptionPane.showInputDialog("Introduce el dividendo");
			num1 = Integer.parseInt(ventana);
			ventana = JOptionPane.showInputDialog("Introduce el divisor");
			num2 = Integer.parseInt(ventana);
			
			System.out.println(
					"El cociente de la división entre " + num1 + " y " + num1 + " es: " + 
					"\n" +  num1 / num2 + " y el resto es " + num1 % num2 
					);	
		}
		default:
			System.out.println("Debe introducir una opción válida");
			break;
		}
		
		
		
	}

}
