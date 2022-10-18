package examenes.examen20221018;

import javax.swing.JOptionPane;

//b. (1.85 puntos) Crea una clase con un método “main” que cree 10 variables enteras. Los valores deben ser números enteros al azar comprendidos entre dos límites, que deben ser preguntados al usuario. El límite inferior debe ser negativo y el superior debe ser positivo. Si el usuario introduce los valores de forma incorrecta debemos volver a pedirle que los introduzca.

public class Ejercicio02 {

	public static void main(String[] args) {
		int limiteSup, limiteInf, numAzar;
		String ventana;
		
		
		ventana = JOptionPane.showInputDialog("Introduzca el límite inferior (debe ser un número negativo): ");
		limiteInf = Integer.parseInt(ventana);
		
		while(limiteInf > 0) { //mediante este bucle nos aeguramos que el ususario introduzca los datos de forma válida.
			ventana = JOptionPane.showInputDialog("El valor introducido debe ser negativo: ");
			limiteInf = Integer.parseInt(ventana);
		}
		
		ventana = JOptionPane.showInputDialog("Introduzca el límite superior (debe ser un número positivo): ");
		limiteSup = Integer.parseInt(ventana);
		
		while(limiteSup < 0) { //repetimos el proceso pero a la inversa.
			ventana = JOptionPane.showInputDialog("El valor introducido debe ser positivo: ");
			limiteSup = Integer.parseInt(ventana);
		}	
		
		System.out.println("La secuencia de números es: "); //una vez establecdos los límites podremos crear la secuencia sin problemas.
		for (int i = 0; i < 10; i++) {
			numAzar = (int) Math.round(Math.random()* (limiteSup - limiteInf) + limiteInf);
			System.out.print(numAzar + " ");
			}
	}

}
