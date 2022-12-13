package Capitulo05.Vajilla;

import Capitulo05.Vajilla.Objects.Vajilla;

public class Main {

	public static void main(String[] args) {
		Vajilla pila = new Vajilla(); //Creamos la pila de platos
		
		System.out.println(pila.toString()); //Mostamos en pantalla la pila
		
		pila.limpiaPlatos();
		
				
		
	}

}
