package Capitulo07.Bloque02;

//2º.- Aproximar, con una precisión de 0.00001 décimas, el número PI. Para esto debes utilizar el método "Calcular el valor de PI utilizando series infinitas" (Método 2) del enlace https://es.wikihow.com/calcular-Pi

public class Ejercicio02_AproximacionPI {

	public static void main(String[] args) {
		System.out.println("Valor de pi: " + Math.PI); // Mediante el método math.
		System.out.println();
		
		calcularPISeriesInfinitas();
	}

	public static void calcularPISeriesInfinitas() {
		double serie = 3;
		
		for (double i = 2; ; i = i + 4) {
			serie = serie + 4.0/(i * (i + 1) * (i + 2)) - 4.0/((i * 2) * (i + 3) * (i + 4));
			System.out.println("El valor del número pi es: " + serie);			
		}
	}
}
