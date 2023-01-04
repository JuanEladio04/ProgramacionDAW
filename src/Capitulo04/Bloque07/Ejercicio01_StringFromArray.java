package Capitulo04.Bloque07;

import utils.Utils;

//1.- Un método llamado "stringFromArray", que reciba un array de números enteros y devuelva una cadena de caracteres. El método debe recorrer el array, de la misma forma en la que harías para mostrarlo en consola, pero en lugar de imprimir en consola debes construir un objeto String. Finalmente debes devolver el String e imprimirlo en el método "main".

public class Ejercicio01_StringFromArray {

	public static void main(String[] args) {
		int array[] = Utils.creaArrayNumerosAzar(20, 0, 100); //Generamos una cadena de caracteres al azar.
		String cadena = StringFromArray(array); //Convertimos esa cadena en una cadena de caracteres y la imprimimos.
		System.out.println(cadena);
	}
	
	public static String StringFromArray(int array[]) {
		String cadenaCaracteres = "";
 		for (int i = 0; i < array.length; i++) {
			cadenaCaracteres = cadenaCaracteres + array[i] + " "; //De esta manera convertimos la cadena de números enteros en caracteres.
		}
		return cadenaCaracteres;
	}

}
