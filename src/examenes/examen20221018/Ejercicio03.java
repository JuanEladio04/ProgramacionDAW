package examenes.examen20221018;

//c. (1.85 puntos) Muestra en pantalla 10 números PARES generados al azar, comprendidos entre 20 y 30 o entre 40 y 50.

public class Ejercicio03 {

	public static void main(String[] args) {
		int numAzar, contador = 0;
		
		System.out.println("La secuencia es: "); //crearemos una condicion en la que los numeros entre 30 y 40 no puedan aparecer en la secuencia y escoja otro.
		while (contador < 10) {
			numAzar= (int) Math.round(Math.random() * (50 - 20) + 20);
			if (numAzar < 30 || numAzar > 40) {
				System.out.print(numAzar + " ");
				contador++;
			}
		}
		
	}

}
