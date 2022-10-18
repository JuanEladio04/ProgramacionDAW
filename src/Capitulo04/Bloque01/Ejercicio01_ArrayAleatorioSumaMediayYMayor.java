package Capitulo04.Bloque01;

//1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos los números que aparecen en el array.


public class Ejercicio01_ArrayAleatorioSumaMediayYMayor {

	public static void main(String[] args) {
		int suma = 0, media = 0, mayor = 0;
		int secuencia[] = new int [150];
		
		for (int i = 1; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random() * 100);
			
			suma = suma + secuencia [i];
			media = suma / i;
			if (secuencia [i] > mayor) {
				mayor = secuencia [i];
			}
		}
	
		for (int i = 1; i < secuencia.length; i++) {
			System.out.print(secuencia [i] + " ");
		}	
		System.out.println("");
		System.out.println("La suma de todos es: " + suma + "\n" +
							"La media de todos es: " + media + "\n" +
							"El mayor de todos es: " + mayor + "\n"
				);

	}
	
}
