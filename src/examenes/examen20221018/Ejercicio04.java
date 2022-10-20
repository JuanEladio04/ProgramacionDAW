package examenes.examen20221018;

//d. (1.85 puntos) Crea, al azar, 10 números entre 0 y 100. Muestra cada número generado y cuáles son sus divisores.

public class Ejercicio04 {

	public static void main(String[] args) {
		int numAzar, divisor;;	
		
		
		for (int i = 0; i < 10; i++) { //Generaremos numeros al azar para nuestra secuencia.
			numAzar= (int) Math.round(Math.random() * 100);
			System.out.println ("\n" + "El número al azar es: " + numAzar + "\n");
			divisor = numAzar;
			while (divisor != 0) { // con este bucle nos aeguraremos que el resto de las divisiones sea 0 y de esta manera imprimir los numeros que sean sus divisiroes.
				if ((numAzar % divisor) == 0) {
					System.out.println(divisor + " Es divisores de " + numAzar);
				}
				divisor--; 
			}
		}
		
		
	}

}
