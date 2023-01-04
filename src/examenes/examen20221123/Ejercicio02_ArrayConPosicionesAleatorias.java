package examenes.examen20221123;

import utils.Utils;

//(2,5 puntos) Crea una clase con un método “main” que cree un array de 5 posiciones con números
//generados al azar entre 0 y 100. Muestra el array. Crea un nuevo array de 5 posiciones en el que
//copies los números del primer array en posiciones aleatorias del segundo array. No puedes repetir
//números del primer array en el segundo array.

public class Ejercicio02_ArrayConPosicionesAleatorias {

	public static void main(String[] args) {
		int array[] = Utils.creaArrayNumerosAzarSinRepeticiones(5, 0, 100); //Creamos un array con numeros aleatorios que no se repitan
		int arrayAleatorio[] = arrayPosicionesAleatorias(array); //Creamos el nuevo array con los numeros del anterior pero en posiiones aleatorias
		
		System.out.println("Secuencia generada: "); //Mostramos la primera secuencia
		Utils.mostrarArray(array);

		System.out.println("Secuencia aleatoria: "); //Mostramos los resultados
		Utils.mostrarArray(arrayAleatorio);
		
	}
	
	public static int[] arrayPosicionesAleatorias(int array[]) {
		int arrayAleatorio[] = new int [array.length]; //Creamos un array de la misma extension que el principal
		int secuencia[] = Utils.creaArrayNumerosAzarSinRepeticiones(array.length, 0, array.length - 1); //Generamos un array que genere números del 0 a la longitus del array anterior. Esto nos permitirá crear una secuencia que no se repita.
		
		for (int i = 0; i < array.length; i++) { //Damos valor a los distintos números del nuevo array.
			arrayAleatorio[i] = array[secuencia[i]];
		}
		return arrayAleatorio;
	}

}
