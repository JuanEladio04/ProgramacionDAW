package examenes.examen20230209;

import java.util.Iterator;
import java.util.Scanner;

import utils.Utils;

//Comienza el programa pidiendo al usuario tres valores enteros. Los tres valores deben estar
//comprendidos entre 0 y 255, obligatoriamente y debes pedir tantas veces los valores al usuario como sea
//preciso. Te aconsejo que crees un método que haga esto y lo ejecutes tres veces. El primer valor indica
//una cantidad de “rojo”, el segundo una cantidad de “verde” y el tercero una cantidad de “azul”. Convierte
//los tres números a hexadecimal y muéstralos seguidos en la consola.

public class Ejercicio04_ColoresHexadecimales {

	public static void main(String[] args) {
		
		int rojo, azul, verde;
		
		System.out.println("Valor de rojo: ");
		rojo = pideValoresEnteros();
		
		System.out.println("Valor de azul: ");
		azul = pideValoresEnteros();
		
		System.out.println("Valor de verde: ");
		verde = pideValoresEnteros();
		
		coloresAHexadecimal(rojo, azul, verde);
	}
	
	public static void coloresAHexadecimal(int rojo, int azul, int verde) {
		System.out.println(Integer.toHexString(rojo) + " " + Integer.toHexString(azul) + " " + Integer.toHexString(verde));
	}
	
	public static int pideValoresEnteros() {
	    Scanner sc = new Scanner (System.in);
		boolean esValorCorrecto = true;
		int valorNumerico = 0;
		String valor;
		
		do {
			valor = Utils.pideStringScanner("Introduce el valor del color: ");
			try {
				valorNumerico = Integer.parseInt(valor);
			}
			catch (NumberFormatException ex) {
				System.out.println("El valor introducido no es un número. Error: " +  ex.getMessage());
				esValorCorrecto = false;
			}
			
			if (valorNumerico > 255 || valorNumerico < 0) {
				esValorCorrecto = false;
				System.out.println("El valor introducido no está dentro del rango.");
			}
			else {
				esValorCorrecto = true;
			}
			
		} while (!esValorCorrecto);
		
		return valorNumerico;
	}

}
