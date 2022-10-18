package Apuntes;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
		int num1, num2;
		String ventana;
		
//		System.out.println("Introduce el numero: ");
//		num1 = sc.nextInt();

		ventana = JOptionPane.showInputDialog("Introduce un numero: ");
		num1 = Integer.parseInt(ventana);
		ventana = JOptionPane.showInputDialog("Introduce un numero: ");
		num2 = Integer.parseInt(ventana);
		
		
//		System.out.println("Introduce el numero: ");
//		num2 = sc.nextInt();
		
		System.out.println("La suma de los numeros es: " + (num1 + num2));
		
		
		

	}

}
