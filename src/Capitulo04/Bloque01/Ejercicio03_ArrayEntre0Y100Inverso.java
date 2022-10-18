package Capitulo04.Bloque01;

//2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y uno superior que debe especificar el usuario. Debes mostrar el array en pantalla para comprobar el funcionamiento

import javax.swing.JOptionPane;

public class Ejercicio03_ArrayEntre0Y100Inverso {

	public static void main(String[] args) {
		int limiteSup = 0, limiteInf = 100;
		String ventana;
		
		int secuencia[] = new int [150];
		
		for (int i = 0; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random()* (limiteSup - limiteInf) + limiteInf);
			}
		
		System.out.println("\n" + "ANTES");
		
		for (int i = 1; i < secuencia.length; i++) {
		System.out.print(secuencia[i] + " ");
		}
		
		System.out.println("\n" + "DESPUES");
		
		for (int i = (secuencia.length - 1); i > 0; i--) { //Restamos uno que haga la secuencia correctamente.
		System.out.print(secuencia[i] + " ");
		}
	}

}

