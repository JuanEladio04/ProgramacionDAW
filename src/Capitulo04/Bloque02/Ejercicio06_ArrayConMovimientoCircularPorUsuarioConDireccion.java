package Capitulo04.Bloque02;

import javax.swing.JOptionPane;

//5º.- Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de posiciones que deseamos desplazar.
public class Ejercicio06_ArrayConMovimientoCircularPorUsuarioConDireccion {

	public static void main(String[] args) {
		int secuencia [] = new int [5];
		int copia, mover, dirección;
		String ventana;

		System.out.println("Secuencia de números antes: "); //Generamos la secuencia de números.
		for (int i = 0; i < secuencia.length; i++) { 
			secuencia [i] = (int) Math.round(Math.random()* 100);
			System.out.print(secuencia [i] + " ");
		}
		
		ventana = JOptionPane.showInputDialog("Introduce el numero de posiciones a desplazar");
		mover = Integer.parseInt(ventana);
		
		ventana = JOptionPane.showInputDialog("Desplazar a la derecha (1) o a la izquierda (2):");
		dirección = Integer.parseInt(ventana);
		
		
		System.out.println("");
		System.out.println("Secuencia de números despues de ser rotada: "); 
		
		if (dirección == 1) {
			for (int j = 0; j != mover; j++) {
				copia = secuencia [4];
				for (int i = secuencia.length - 1; i >= 0; i--) {
					if (i != 0) {
						secuencia[i] = secuencia[i - 1];
					} else {
						secuencia[0] = copia;
					}
				}
			}
		}
		else  {
			for (int j = 0; j != mover; j++) {
				copia = secuencia [0];
				for (int i = 0; i < secuencia.length; i++) {
					if (i != 4) {
						secuencia[i] = secuencia[i + 1];
					} else {
						secuencia[4] = copia;
					}
				}
			}
		}

		for (int i = 0; i < secuencia.length; i++) {
			System.out.print(secuencia[i] + " ");
		}
		
		
	}
}


