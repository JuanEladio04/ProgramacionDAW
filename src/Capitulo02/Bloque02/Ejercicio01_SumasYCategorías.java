package Capitulo02.Bloque02;

import javax.swing.JOptionPane;

/*
 * 1º.- Realiza un ejercicio que acumule cinco números introducidos por el usuario, es decir, que sume las cantidades introducidas, pero realizando cuatro categorías: números negativos, números bajos (entre 0 y 25, ambos inclusive), números medios (entre 26 y 250, ambos inclusie) y números grandes (mayores de 250). Al finalizar el programa, se debe mostrar el total de las sumas de los números introducidos en cada una de las categorías.
 */

public class Ejercicio01_SumasYCategorías {

	public static void main(String[] args) {
		
		String panel;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		int sumaNegativos = 0;
		int sumaPequenios = 0;
		int sumaMedios = 0;
		int sumaGrandes = 0;
		
		int num;
		int suma; 
		
		panel = JOptionPane.showInputDialog("Introduzca el primer número: ");
		num1 = Integer.parseInt(panel);
		num = num1;
		
		if (num < 0) {
			suma = sumaNegativos + num;
			sumaPequenios = suma;
		}
		else {
			if (num < 25) {
				suma = sumaPequenios + num;
				sumaPequenios = suma;
			}
			else {
				if (num < 250) {
					suma = sumaMedios + num;
					sumaMedios = suma;
				}
				else {
					if (num > 250) {
						suma = sumaGrandes + num;
						sumaGrandes = suma;
					}
				}
			}
		}
		
		panel = JOptionPane.showInputDialog("Introduzca el segundo número: ");
		num2 = Integer.parseInt(panel);
		num = num2;
		
		if (num < 0) {
			suma = sumaNegativos + num;
			sumaPequenios = suma;
		}
		else {
			if (num < 25) {
				suma = sumaPequenios + num;
				sumaPequenios = suma;
			}
			else {
				if (num < 250) {
					suma = sumaMedios + num;
					sumaMedios = suma;
				}
				else {
					if (num > 250) {
						suma = sumaGrandes + num;
						sumaGrandes = suma;
					}
				}
			}
		}
		

		panel = JOptionPane.showInputDialog("Introduzca el tercer número: ");
		num3 = Integer.parseInt(panel);
		num = num3;
		
		if (num < 0) {
			suma = sumaNegativos + num;
			sumaPequenios = suma;
		}
		else {
			if (num < 25) {
				suma = sumaPequenios + num;
				sumaPequenios = suma;
			}
			else {
				if (num < 250) {
					suma = sumaMedios + num;
					sumaMedios = suma;
				}
				else {
					if (num > 250) {
						suma = sumaGrandes + num;
						sumaGrandes = suma;
					}
				}
			}
		}
		
		
		panel = JOptionPane.showInputDialog("Introduzca el cuarto número: ");
		num4 = Integer.parseInt(panel);
		num = num4;
		
		if (num < 0) {
			suma = sumaNegativos + num;
			sumaPequenios = suma;
		}
		else {
			if (num < 25) {
				suma = sumaPequenios + num;
				sumaPequenios = suma;
			}
			else {
				if (num < 250) {
					suma = sumaMedios + num;
					sumaMedios = suma;
				}
				else {
					if (num > 250) {
						suma = sumaGrandes + num;
						sumaGrandes = suma;
					}
				}
			}
		}
		
		
		panel = JOptionPane.showInputDialog("Introduzca el quinto número: ");
		num5 = Integer.parseInt(panel);
		num = num5;
		
		if (num < 0) {
			suma = sumaNegativos + num;
			sumaPequenios = suma;
		}
		else {
			if (num < 25) {
				suma = sumaPequenios + num;
				sumaPequenios = suma;
			}
			else {
				if (num < 250) {
					suma = sumaMedios + num;
					sumaMedios = suma;
				}
				else {
					if (num > 250) {
						suma = sumaGrandes + num;
						sumaGrandes = suma;
					}
				}
			}
		}
		
		
		System.out.println(
				"La suma de los Negativos es: " + sumaNegativos +
				"\n La suma de los Pequenios es: " + sumaPequenios +
				"\n La suma de los Medios es: " + sumaMedios +
				"\n La suma de los Grandes es: " + sumaGrandes
				);
		


		
	}

}
