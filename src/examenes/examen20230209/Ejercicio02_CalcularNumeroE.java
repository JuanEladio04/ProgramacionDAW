package examenes.examen20230209;

import java.util.Iterator;

import utils.Utils;

//Calcular el número E (Número de Euler 2,7182818284590452353602874713527…) de la siguiente forma:

public class Ejercicio02_CalcularNumeroE {

	public static void main(String[] args) {
		
		System.out.println("Calculo del número E: ");
		
		calculoE(6);
		
	}
	
	public static void calculoE(int repeticiones) {
		double E = 2;
		
		for (double i = 2; i < repeticiones; i++) {
			E = E + (1 / calculoFactorial(i));
		}
		System.out.println(E);
	}
	
	public static double calculoFactorial(double numero) {
		double factorial = numero;
		
		for (double i = numero - 1; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
