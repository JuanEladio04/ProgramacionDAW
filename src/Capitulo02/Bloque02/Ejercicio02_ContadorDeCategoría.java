package Capitulo02.Bloque02;

import java.util.Scanner;

/*
 * 2º.- Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias: no existe la categoría de números negativos, por tanto si el usuario introduce un negativo, el programa debe terminar; la otra diferencia es que, al acabar, el programa no debe mostrar la suma de los números, sino cuantos han entrado en cada categoría. A esto se llema contadores, a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.
 */

public class Ejercicio02_ContadorDeCategoría {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		int num;
		
		int nPequenios = 0;
		int nMedios = 0;
		int nGrandes = 0;
		
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		num = num1;
		
		if (num < 0) {
			return;
		}
		else {
			if (num < 25) {
				nPequenios = nPequenios + 1;
			}
			else {
				if (num < 250) {
					nMedios = nMedios + 1;
				}
				else {
					if (num > 250) {
						nGrandes = nGrandes + 1;
					}
				}
			}
		}
		
		
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		num = num2;
		
		if (num < 0) {
			return;
		}
		else {
			if (num < 25) {
				nPequenios = nPequenios + 1;
			}
			else {
				if (num < 250) {
					nMedios = nMedios + 1;
				}
				else {
					if (num > 250) {
						nGrandes = nGrandes + 1;
					}
				}
			}
		}

		
		System.out.println("Introduce el tercer número: ");
		num3 = sc.nextInt();
		num = num3;
		
		if (num < 0) {
			return;
		}
		else {
			if (num < 25) {
				nPequenios = nPequenios + 1;
			}
			else {
				if (num < 250) {
					nMedios = nMedios + 1;
				}
				else {
					if (num > 250) {
						nGrandes = nGrandes + 1;
					}
				}
			}
		}
		
		
		System.out.println("Introduce el cuerto número: ");
		num4 = sc.nextInt();
		num = num4;
		
		if (num < 0) {
			return;
		}
		else {
			if (num < 25) {
				nPequenios = nPequenios + 1;
			}
			else {
				if (num < 250) {
					nMedios = nMedios + 1;
				}
				else {
					if (num > 250) {
						nGrandes = nGrandes + 1;
					}
				}
			}
		}

		
		System.out.println("Introduce el quito número: ");
		num5 = sc.nextInt();
		
		if (num < 0) {
			return;
		}
		else {
			if (num < 25) {
				nPequenios = nPequenios + 1;
			}
			else {
				if (num < 250) {
					nMedios = nMedios + 1;
				}
				else {
					if (num > 250) {
						nGrandes = nGrandes + 1;
					}
				}
			}
		}

		
		System.out.println(
				"En total hay:" + 
				"\n"+ nPequenios + " números pequeños" + 
				"\n" + nMedios + " números medios" + 
				"\n" + nGrandes + " números grandes"
				);
		
		
	}

}
