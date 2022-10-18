package examenes.examen20221018;

//a. (1.85 puntos) Crea una clase con un método “main” que cree 10 variables enteras. Deben ser números enteros al azar comprendidos entre 0 y 100. Muestra Todos los números en pantalla. Calcula la suma de los múltiplos de 5 y la media de los números impares.

public class Ejercicio01 {

	public static void main(String[] args) {
		int numAzar, media = 0 , contadorMedia = 0, multiplos = 0;	
		
		System.out.println("La secuencia es: ");
		
		for (int i = 0; i < 10; i++) { //creamos un bucle que genere los números al azar
			numAzar= (int) Math.round(Math.random() * 100);
			System.out.print(numAzar+ " ");
			
			if ((numAzar % 5) == 0) { //mediante estas dos condicionales separamos los multiplos y los números impares del resto de la secuencia.
				multiplos = multiplos + numAzar;
			}
			if	((numAzar % 2) != 0) {
				media = media + numAzar;
				contadorMedia++;
			}
		}
		media = media / contadorMedia; //por ultimo calculamos la media e imprimimos.
		
		System.out.println("");
		System.out.println("La suma de los multiplos e 5 es: " + multiplos);
		System.out.println("La media de los números impares es de: " + media);
	}

}
