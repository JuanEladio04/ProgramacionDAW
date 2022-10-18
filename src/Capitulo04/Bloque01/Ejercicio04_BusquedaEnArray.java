package Capitulo04.Bloque01;

import java.util.Scanner;

//4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras, debes indicar al usuario la posición del array en que se encuentra. En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.

public class Ejercicio04_BusquedaEnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limiteSup = 0, limiteInf = 100, buscar;
		boolean encontrado = false;
		
		int secuencia[] = new int [150];
		
		for (int i = 0; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random()* (limiteSup - limiteInf) + limiteInf);
			}
		
		System.out.println("\n" + "Secuencia generada: ");
		
		for (int i = 1; i < secuencia.length; i++) {
		System.out.print(secuencia[i] + " ");
		}
		
		System.out.println("\n" + "Introduce el valor que desea buscar: ");
		buscar = sc.nextInt();
		
		for (int i = 0 ; i < secuencia.length ; i++) {
			if (buscar == secuencia [i]) {
				System.out.println("El valor se ha encontrado en la posición: " + i);
				encontrado = true;
			}
			else {
				encontrado = false;
			}
		}
		if (encontrado == false) {
			System.out.println("El valor no se encuentra dentro de esta secuencia");
		}
		
	}
}

