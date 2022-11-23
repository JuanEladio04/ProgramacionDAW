package examenes.examen20221123;

//(2,5 puntos) Serie de Rafanacci. Explicación: el ejercicio recuerda a la serie de Fibonacci, en la
//que cada número era la suma de los dos anteriores, quedando 1 -> 1 -> 2 -> 3 -> 5 -> 8 -> 13....;
//en la serie de Rafanacci cada número será la multiplicación de los dos anteriores, más la mitad
//del número inmediatamente anterior, quedando 1 -> (0*1)+0,5 = 0,5 -> (1*0,5) + 0,25 = 0,75 ->
//(0,5*0,75) + 0,365 = 0,74 ............... Crea una clase Java con un método “main” que introduzca
//en un array los 10 primeros términos de la serie de Rafanacci

public class Ejercicio03_SerieRafanacci {

	public static void main(String[] args) {
		float serieRafanacci[] = construyeSerie(); //Generamos el array

		//Mostramos resultados
		muestraSerie(serieRafanacci);
	}
	
	public static float[] construyeSerie() {
		float array[] = new float [10];
		
		array[0] = 1; //Damos valor a la primera cifra del array.
		
		//Creamos un bucle para generar el array
		for (int i = 1; i < array.length; i++) {
			if (i == 1) { //En caso de ser el segundo número de array realizamos la siguiente operación
				array[i] = (0 * array[i - 1]) + (array[i - 1] / 2);
			}
			else { //Realizamos la siuiente operación con el resto de los números
				array[i] = (array[i - 1] * array[i - 2]) + (array[i - 1] / 2);
			}
		}
		
		return array;
	}
	
	public static void muestraSerie(float array[]) { //Creamos un método para mostrar el nuevo array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " " + "->" + " ");
		}
		System.out.println();
	}

}
