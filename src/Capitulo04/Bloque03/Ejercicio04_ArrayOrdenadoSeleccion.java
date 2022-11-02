package Capitulo04.Bloque03;

import java.util.Iterator;

//4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación llamado "Selección", con el objetivo de ordenar el array completamente. Puedes consultar el siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_selection_es.html

public class Ejercicio04_ArrayOrdenadoSeleccion {

	public static void main(String[] args) {
		int vector [] = Utils.creaArrayNumerosAzar(150, 1000, 0), save, menor = 0;
		boolean ordenado = false;
		
		System.out.println("La secuencia de numeros es: ");
		Utils.mostrarArray(vector);
		
		System.out.println("La secuencia ordenada en orden de Selección es: ");
		
		do {
			for (int i = 0; i < vector.length; i++) {
				for( int j = i; j < vector.length; j++) {
					if (vector[j] < vector [i]) {
						save = vector [j];
						vector [j] = vector [i];
						vector [i] = save;
					}
				}
			}
		} while(ordenado == true);
		
		Utils.mostrarArray(vector);
	}

}
