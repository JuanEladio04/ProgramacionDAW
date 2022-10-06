package Capitulo03.Bloque03;

import java.util.Scanner;

//2º.- Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero). Al finalizar el ejercicio se debe imprimir en pantalla el valor mayor y el menor introducido. El valor 0 (cero) no debe tenerse en cuenta.

public class Ejercicio02_MayorYMenorNumeroIntroducido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = 1, numMayor = 0, numMenor = 1;
		 
		for (int i = 0 ;num != 0; i++) {
			System.out.println("Introducza un número(0 para terminar)");
			num = sc.nextInt();
			
			if (i == 0) {
				numMayor = num;
				numMenor = numMayor;
			}
			else {
				if (num > numMayor && num != 0) {
					numMayor = num;
				}
				if (num < numMenor && num != 0) {
					numMenor = num;
				}
			}
		}
		
		System.out.println("El número mayor es " + numMayor + " y el número menor es " +numMenor);


	}

}
