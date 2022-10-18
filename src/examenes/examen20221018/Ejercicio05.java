package examenes.examen20221018;

import javax.swing.JOptionPane;

//e. (1.85 puntos) Debes pedir al usuario un número de una única cifra. Después, debes generar 100 números al azar entre 0 y 100. Cuando uno de los números al azar termine en la cifra que el usuario indicó, debes mostrar un mensaje en pantalla.

public class Ejercicio05 {

	public static void main(String[] args) {
		int num, numAzar;
		String ventana;
		
		ventana = JOptionPane.showInputDialog("Introduz un número de una sola cifra: ");
		num = Integer.parseInt(ventana);
		
		while (num > 10) { //Como antes nos aseguramos que el ususario introduzca los datos adecuados para el ejercicio.
			ventana = JOptionPane.showInputDialog("El número debe ser de una sola cifra: ");
			num = Integer.parseInt(ventana);
		}
		
		for (int i = 0; i < 100; i++) { //Mediante este bucle generaremos una secuencia de numeros al azar.
			numAzar= (int) Math.round(Math.random() * 100);
			System.out.print(numAzar+ " ");
			while (numAzar > 10) { //Con este otro bucle conseguiremos que los numeros de dos cifras se simplifequen a un número de una cifra.
				numAzar = numAzar % 10;
			}
			if (num == numAzar) { //una vez obtenida la ultima cifra de cada número nos aseguraremos de que coincida con el número introducido.
				System.out.print("(" + "Termina en " + num + ") ");

			}
		}

	}

}
