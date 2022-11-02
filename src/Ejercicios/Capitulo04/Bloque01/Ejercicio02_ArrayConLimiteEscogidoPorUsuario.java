package Ejercicios.Capitulo04.Bloque01;

//2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite inferior y uno superior que debe especificar el usuario. Debes mostrar el array en pantalla para comprobar el funcionamiento

import javax.swing.JOptionPane;

public class Ejercicio02_ArrayConLimiteEscogidoPorUsuario {

	public static void main(String[] args) {
		int limiteSup, limiteInf;
		String ventana;
		
		int secuencia[] = new int [150];
		
		ventana = JOptionPane.showInputDialog("Introduzca el límite inferior: ");
		limiteInf = Integer.parseInt(ventana);
		
		ventana = JOptionPane.showInputDialog("Introduzca el límite superior: ");
		limiteSup = Integer.parseInt(ventana);
		
		for (int i = 0; i < secuencia.length; i++) {
			secuencia [i] = (int) Math.round(Math.random()* (limiteSup - limiteInf) + limiteInf);
			}
		for (int i = 1; i < secuencia.length; i++) {
		System.out.print(secuencia[i] + " ");
		}
	}

}

