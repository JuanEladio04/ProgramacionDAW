package Ejercicios.Capitulo04.Bloque02;

//2º.- Realiza un ejercicio que inicialice  arrays de 150 elementos enteros al azar entre 0 y 100. Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice impar del tercer array debes copiar los elementos de índice impar del primer array; en los elementos de índice par del tercer array debes copiar los elementos de índice par del segundo array.

public class Ejercicio02_ArraysQueSeCopian {

	public static void main(String[] args) {
		int secuencia1 [] = new int [150];
		int secuencia2 [] = new int [150];
		int secuencia3 [] = new int [150];

		
		for (int i = 0; i < secuencia1.length; i++) { //generaremos dos arrays arrays.
			secuencia1 [i] = (int) Math.round(Math.random()* 100);
			secuencia2 [i] = (int) Math.round(Math.random()* 100);
		}
		
//		Imprimimos en pantalla los dos array que hemos generado
		System.out.println("Primera secuencia de números: ");
		for (int i = 0; i < secuencia1.length; i++) {
			System.out.print(secuencia1 [i] + " ");
		}
		System.out.println("");
		
		System.out.println("Segunda secuencia de números");
		for (int i = 0; i < secuencia2.length; i++) {
			System.out.print(secuencia2 [i] + " ");
		}
		System.out.println("");
		
		System.out.println("Tercera secuencia. Esta está generada a partir de las demás: ");
		for (int i = 0; i < secuencia3.length; i++) {
			if ((i % 2) != 0 ) {					//Mediante este if comprobamos el indice del array y dependiendo de si es par o impar imprimira un número de un array u otro.
				secuencia3 [i] = secuencia1 [i];
			}
			else {
				secuencia3 [i] = secuencia2 [i];
			}
			System.out.print(secuencia3 [i] + " ");
		}
		
	}
}
