package Ejercicios.Capitulo03.Bloque03;

//4º.- Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero). Al finalizar se debe imprimir en pantalla cuantos son positivos y cuantos negativos. No debes tener en cuenta el 0 (cero).

import javax.swing.JOptionPane;

public class Ejercicio04_ContadorPositivosYNegativos {

	public static void main(String[] args) {
		int num = 1, Positivos = 0, Negativos = 0;
		String ventana;
		
		for (int i = 0 ;num != 0; i++) {
			ventana = JOptionPane.showInputDialog("Introduce un número (0 para terminar)");
			num = Integer.parseInt(ventana);
			
			if(num > 0 && num != 0) {
				Positivos = Positivos + 1;
			}
			else {
				if (num < 0 && num != 0) {
					Negativos = Negativos +1;
				}
			}
					
		}
		System.out.println("Hay un total de " + Positivos + " números positivos y " + Negativos + " números negativos.");

	}

}
