package Ejercicios.Capitulo04.Bloque02;

//4º.- Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el desplazamiento sea circular, si un número sale por la derecha volverá a entrar por la izquierda. Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.

public class Ejercicio04_ArrayConMovimientoCircular {

	public static void main(String[] args) {
		int secuencia [] = new int [5];
		int copia;

		System.out.println("Secuencia de números antes: "); //Generamos la secuencia de números.
		for (int i = 0; i < secuencia.length; i++) { 
			secuencia [i] = (int) Math.round(Math.random()* 100);
			System.out.print(secuencia [i] + " ");
		}
		
		copia = secuencia [4];
		
		System.out.println("");
		System.out.println("Secuencia de números despues de ser rotada: "); 
		for (int i = secuencia.length - 1; i >= 0; i--) {
			if (i != 0) {
				secuencia[i] = secuencia[i - 1];
			} else {
				secuencia[0] = copia;
			}

		}
		for (int i = 0; i < secuencia.length; i++) {
			System.out.print(secuencia[i] + " ");
		}
		
		
	}
}


