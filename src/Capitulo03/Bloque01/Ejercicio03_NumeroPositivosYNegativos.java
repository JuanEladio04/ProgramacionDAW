package Capitulo03.Bloque01;

//3º.- Realiza un ejercicio que pida números al usuario, tantos como indique el usuario. al final debe aparecer cuantos números positivos y negativos se han introducido.

import java.util.Scanner;

public class Ejercicio03_NumeroPositivosYNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, positivos = 0, negativos = 0;
		
		for (int i = 1 ; i != 0 ; i++ ) {
			System.out.println("Introduce un número(0 para terminar)");
			num = sc.nextInt();
			
			if (num > 0 && num != 0) 
				positivos++;
			else
				if (num < 0 && num != 0)
					negativos++;
				else 	//else con la funcion de finalizar el bucle una vez introducido 0
					i = -1;
		}
		
		System.out.println("Tenemos un total de " + positivos + " número positivos y " + negativos + " números negativos.");

				
	}
}
