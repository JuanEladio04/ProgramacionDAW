package Capitulo04.Bloque07;

import utils.Utils;

//3.- Realiza un método llamado "addInteger", que reciba:
//- Un array de números enteros.
//- Un valor entero.
//Dentro del método debes:
//- Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
//- Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
//- Agregar el nuevo elemento al final del nuevo array.
//- El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.

public class Ejercicio03_AñadirEnteroAArray {

	public static void main(String[] args) {
		int secuence [] = Utils.creaArrayNumerosAzar(20, 0, 100);
		int add = Utils.pideNumeroJOptionPane("Introduce el número que desea añadir al array: "); //Pedimos al usuario el número a reemplazar.
		
		//Mostramos la secuencia generada.
		System.out.println("Secuencia generada: ");
		Utils.mostrarArray(secuence);

		//Mediante el metodo creamos un nuevo array identico al anterior solo que con el entero añadido al final.
		int intergerAdded[] = addInterger(secuence, add);
		
		System.out.println("Array con entero añadido: ");
		Utils.mostrarArray(intergerAdded); //Mostramos la nueva secuencia.
		
	}

	public static int [] addInterger(int array[], int add) {
		int intergerAdded[] = new int [array.length + 1]; //Creaos una nueva secuencia de una unidad más de longitud que la original.
		
		//Añadimos los valores de la original recorriendo el array.
		for (int i = 0; i < intergerAdded.length - 1; i++) {
			intergerAdded[i] = array[i];
		}
		
		//Por ultimo añadimos el valor extra.
		intergerAdded[intergerAdded.length - 1] = add;
		
		return intergerAdded;
	}
}
