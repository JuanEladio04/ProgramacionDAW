package Ejercicios.Capitulo02.Bloque03;

import javax.swing.JOptionPane;

//4º.- Escribe un programa que lea el importe de una compra y la cantidad recibida y calcule el cambio a devolver, teniendo en cuenta que el número de monedas que se devuelven debe ser mínimo. Suponer que el sistema monetario utilizado consta de monedas de 100, 50, 25, 5, y 1 unidad. El precio viene dado en unidades monetarias enteras.
//Ejemplo: Pagamos con 2000 unidades monetarias un articulo que nos cuesta 375 unidades monetarias, la vuelta (1625 u) debería de ser de la siguiente forma:
//- 16 monedas de 100 = 1600
//- 1 moneda de 25 = 25

public class Ejercicio04_CalculadoraDeCambio {

	public static void main(String[] args) {
		int precio, pago;
		String ventana;
		
		ventana= JOptionPane.showInputDialog("Introduce el precio del producto: ");
		precio = Integer.parseInt(ventana);
		ventana= JOptionPane.showInputDialog("Introduce el pago del producto: ");
		pago = Integer.parseInt(ventana);
		
		if (precio == pago)
				System.out.println("No hay cambio");
		else 
			if (precio > pago)
				System.out.println("No hay suficiente dinero");
			else {
				pago = pago - precio;
				System.out.println("Se devolverán " + (pago/100) + " monedas de 100");
				pago = pago % 100;
				System.out.println("Se devolverán " + (pago/50) + " monedas de 50");
				pago = pago % 100;
				System.out.println("Se devolverán " + (pago/25) + " monedas de 25");
				pago = pago % 100;
				System.out.println("Se devolverán " + (pago/5) + " monedas de 5");
				pago = pago % 5;
				System.out.println("Se devolverán " + pago + " monedas de 1");
			}
				
	}

}
