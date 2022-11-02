package Ejercicios.Capitulo02.Bloque03;

import javax.swing.JOptionPane;

//3º.- Realiza un programa que resuelva lo siguientes puntos:
//    a.- Que muestre un menú en pantalla con opciones para:
//                1. Cálculo de la hipotenusa de un triángulo.
//                2. Cálculo de la superficie de una circunferencia.
//                3. Cálculo del perímetro de una circunferencia.
//                4. Cálculo del área de un rectángulo.
//                5. Cálculo del área de un triángulo.
//                0. Salir de la aplicación.
//    b.- En la opción "1" debe pedir dos datos, correspondientes a las longitudes de los dos catetos de un triángulo. Se debe imprimir la longitud de la hipotenusa. Recuerda que Hipotenusa al cuadrado = cateto1 al cuadrado + cateto2 al cuadrado.
//    c.- En la opción "2" debe pedir la longitud del radio de una circunferencia e imprimir la superficie de la misma. Recuerda que el área es igual a PI por el radio al cuadrado. Recuerda también que PI es igual a 3,1416.
//    d.- En la opción "3" debe pedir la longitud del radio de una circunferencia e imprimir la longitud del perímetro de la misma. Recuerda que la longitud de la circunferencia = 2 por PI por el radio.
//    e.- En la opción "4" debe pedir las longitudes de la base y la altura de un rectángulo, e imprimir el área de dicho rectángulo. Recuerda que el área del rectángulo es igual a la base por la altura.
//    f.- En la opción "5" debe pedir la base y la altura de un tríangulo e imprimir el área del mismo. Recuerda que el área del triángulo es la mitad del área del rectángulo de igual base y altura.
//    g.- Si la opción no fuese "0", "1", "2", "3", "4" o "5", el programa deberá dar el mensaje de "opción incorrecta".

public class Ejercicio03_CalculadoraAvanzada {

	public static void main(String[] args) {
		
		String ventana;
		int opcion, num1, num2;
		
		System.out.println(
				"CALCULADORA AVANZADA" + 
				"\nElija una de las opciones" + 
				"\n1.- Hipotenusa de un triángulo" + 
				"\n2.- Superficie de una circunferencia" + 
				"\n3.- Perímetro de una circunferencia" +
				"\n4.- Área de un rectángulo" +
				"\n5.- Área de un triangulo" +
				"\n0.- Salir de la calculadora"  
				);
		
		ventana = JOptionPane.showInputDialog("Elija una de las opciones");
		opcion = Integer.parseInt(ventana);
		
			switch (opcion) {
//			Cerrar el programa
			case 0 : {
				return;
			}
//			Cálculo hipotenusa del triángulo.
			case 1: {
				ventana = JOptionPane.showInputDialog("Introduce el valor del primer cateto");
				num1 = Integer.parseInt(ventana);
				ventana = JOptionPane.showInputDialog("Introduce el valor del segundo cateto");
				num2 = Integer.parseInt(ventana);
				System.out.println("El valor de la hipotenusa de este triangulo es: " + (Math.pow(num1, 2) + Math.pow(num2, 2)) );
				break;
			}
//			Cálculo de la superficie de una circunferencia
			case 2:{
				ventana=JOptionPane.showInputDialog("Introduce el radio de la circunferencia");
				num1 = Integer.parseInt(ventana);
				System.out.println("La superficie del circulo sería de: " + Math.PI*(Math.pow(num1, 2)));
				break;
			}
//			Cálculo del perímetro de una circunferencia
			case 3: {
				ventana=JOptionPane.showInputDialog("Introduce el radio de la circunferencia");
				num1 = Integer.parseInt(ventana);
				System.out.println("La superficie del circulo sería de: " + 2*Math.PI*num1);
				break;
			}
//			Área de un rectángulo
			case 4: {
				ventana=JOptionPane.showInputDialog("Introduce el valor de la base del rectángulo");
				num1 = Integer.parseInt(ventana);
				ventana=JOptionPane.showInputDialog("Introduce el valor de la altura del rectángulo");
				num2 = Integer.parseInt(ventana);
			System.out.println("El área del rectagulo tiene un valor de: " + num1*num2);
			break;
			}
//			Área de un triángulo
			case 5: {
				ventana=JOptionPane.showInputDialog("Introduce el valor de la base del triángulo");
				num1 = Integer.parseInt(ventana);
				ventana=JOptionPane.showInputDialog("Introduce el valor de la altura del triángulo");
				num2 = Integer.parseInt(ventana);
			System.out.println("El área del triangulo tiene un valor de: " + (num1*num2)/(float)2);
			}
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		
	}

}
