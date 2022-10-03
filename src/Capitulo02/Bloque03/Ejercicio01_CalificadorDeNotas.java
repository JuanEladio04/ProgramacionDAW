package Capitulo02.Bloque03;

import javax.swing.JOptionPane;

/*
 * 1º.- Realiza un ejercicio que califique la nota obtenida por un alumno/a en un examen. El ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla su traducción a nota de texto: muy deficiente, insuficiente, suficiente, bien, notable y sobresaliente. Debes realizar el ejercicio a través de una sentencia switch, no de if anidados.
 */

public class Ejercicio01_CalificadorDeNotas {

	public static void main(String[] args) {
		
		String ventana;
		int nota;
		
		ventana = JOptionPane.showInputDialog("Introduce la nota del alumno");
		nota = Integer.parseInt(ventana);
		
		switch (nota){
			case 0: case 1: case 2: case 3: {
				System.out.println("La calificación es: Muy deficiente");
				break;
			}
			case 4: {
				System.out.println("La calificación es: Deficiente");
				break;
			}
			
			case 5: {
				System.out.println("La calificación es: Suficiente");
				break;
			}
			case 6 : {
				System.out.println("La califición es: Bien");
				break;
			}
			case 7: case 8:{
				System.out.println("La calificación es: Notable");
				break;
			}
			case 9: case 10: {
				System.out.println("La calificación es: Sobresaliente");
				break;
			}
			default: {
				System.out.println("Se debe introducir un número válido");
				break;
			}
		}
		

	}

}
