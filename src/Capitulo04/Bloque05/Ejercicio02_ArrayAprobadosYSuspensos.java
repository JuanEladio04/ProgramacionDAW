package Capitulo04.Bloque05;

import Utils.Utils;

//2º.- Crea un array de 20 números enteros generados al azar entre 0 y 10. Analiza el array y calcula el porcentaje (con decimales) de notas aprobadas ( >= 5 ) y de notas suspensas.

public class Ejercicio02_ArrayAprobadosYSuspensos {

	public static void main(String[] args) {
		
		int array [] = Utils.creaArrayNumerosAzar(20, 0, 10);
		float aprobadas, suspensas;
		
		System.out.println("La secuencia es: ");
		Utils.mostrarArray(array);
		
//		Calculamos la cantidad de personas aprobadas y suspensas
		aprobadas = getApproved(array);
		suspensas = array.length - aprobadas;
		
		System.out.println("Han aprobado el " + (aprobadas / array.length) + " -> " 
		+ (int)((aprobadas / array.length) * 100) + "% " +  "y han suspendido el " +
		(suspensas / array.length)+ " -> " + (int)((suspensas / array.length) * 100) + "% ");

	}

	
	public static int getApproved(int array[]) {
		int aprobados = 0;
		 for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5) {
				aprobados++;
			}
		}
			return aprobados;
	}
}
