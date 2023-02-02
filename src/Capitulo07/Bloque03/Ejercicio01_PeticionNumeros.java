package Capitulo07.Bloque03;

import utils.Utils;

//1º.- Implementa un programa que contenga una clase llamada "PeticionNumeros", con un método "pideNumeroPar()". Desde un método "main()" llama al método anterior. Dentro del método "pideNumeroPar()" debes crear todo lo necesario para disparar una Exception, creada por ti, cuando el número introducido no sea un número par.

public class Ejercicio01_PeticionNumeros {
	
	public static void main(String[] args) {
		int num;
		try {
			num = Utils.pideNumeroScanner();
			System.out.println(numeroParExcepcion(num));
		} catch (NotPairNumberException e) {
			System.out.println("El valor no es válido: " + e.getMessage());
		}
	}
	
	private static String numeroParExcepcion(int num) throws NotPairNumberException{
		StringBuffer sb = new StringBuffer();
		
		if ((num % 2) != 0) {
			throw new NotPairNumberException ("El número introducido no es par.");
		}
		else {
			sb.append("El número introducido es par");
		 }	
		
		return sb.toString();
	}

}

