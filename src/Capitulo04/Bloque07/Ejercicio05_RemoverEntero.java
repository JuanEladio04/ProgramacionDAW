package Capitulo04.Bloque07;

import utils.Utils;

//5.- Realiza un método llamado "removeInteger", que reciba:
//- Un array de números enteros.
//- Un valor entero.
//Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro, debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente guía:
//- Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero (segundo parámetro) dentro del array (primer parámetro).
//- Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro menos la cantidad de veces que el valor entero del segundo parámetro aparezca en dicho array.
//- Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array creado por ti en el método. Lógicamente no debes copiar en el array los valores del primer array que coincidan con el valor introducido como segundo parámetro.
//- Devuelve el nuevo array.
//El método debe devolver "int[]". El método main debe recoger el nuevo array creado e imprimirlo en consola.

public class Ejercicio05_RemoverEntero {

	public static void main(String[] args) {
		//Creamos y mostramos secuencia.
		int secuence[] = Utils.creaArrayNumerosAzar(20, 0, 10);
		Utils.mostrarArray(secuence);
		
		 //Pedimos el valor al usuario.
		int remover = Utils.pideNumeroJOptionPane("Introduce el valor que desea remover de la secuencia: ");
		
		//Creamos e imprimimos el array sin el valor seleccionado.
		int intRemoved[] = removeInterger(secuence, remover);
		Utils.mostrarArray(intRemoved);
	}
	
	public static int[] removeInterger(int array[], int remover) {
		int counter = Ejercicio04_ContarValorEnArray.countOccurrences(array, remover);
		int intRemoved[] = new int[array.length - counter];
		
		for (int i = 0, j = 0; i < intRemoved.length || j < array.length;) {
			if (remover != array[j]) {
				intRemoved[i] = array[j];
				i++;
				j++;
			}
			else j++;
		}
		
		return intRemoved;
	}

}
