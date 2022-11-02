package Ejercicios.Capitulo03.Bloque04;

//3º.- Crea un ejercicio que imprima en pantalla todas las tablas de multiplicar desde el 1 hasta el 15. Debes utilizar únicamente bucles de tipo "do...while".

public class Ejercicio03_TablasDeMultiplicarSinFor {

	public static void main(String[] args) {
		
		int num = 1, multiplica = 1;
		
		do {
			do{
				System.out.println("El número " + num + " multiplicado por el numero " + multiplica + " equivale a: " + (num * multiplica) );
				multiplica++;
			} while (multiplica <=10);	
			System.out.println("");
			num++;
			multiplica = 1;
		} while (num <= 15);
		
	}

}
