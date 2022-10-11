package Capitulo03.Bloque03;

import java.util.Scanner;

//1º.- Realiza un ejercicio que pida números al usuario. El programa debe detenerse cuando el usuario introduzca el número 0 (cero), que no debe tenerse en cuenta para ninguna operación aritmética, simplemente para salir de la aplicación. Cuando el programa haya terminado, se debe sacar en pantalla el valor de la suma  y de la media de todos los números.

public class Ejercicio01_SumayMediaDeTodoslosNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		float num = 1, numSuma = 0, i; //declaramos la variante i ahora para utilizarla para realizar la media
		 
		for (i = -1 ;num != 0; i++) {	//el valor de i será de -1 para que al introducir el número 0 se realize la media correctamente.
			System.out.println("Introduce un número(0 para terminar)");
			num = sc.nextFloat();
			
			numSuma = num + numSuma;
		}
		
		System.out.println("El total de los números es de " + numSuma + " y el total de la media es de " + (numSuma / i));
	}

}
