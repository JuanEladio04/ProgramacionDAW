package Capitulo05.Batalla;

import Capitulo05.Batalla.Objetos.CampoBatalla;

public class Main {

	public static void main(String[] args) {
		//Creamos el campo de batalla con todos sus participantes
		CampoBatalla battleField = new CampoBatalla();
		battleField.shuffle(); //Mezclamos a los diferentes participantes de la lucha
		
		System.out.println(battleField.toString()); //Mostramos en pantalla a los participantes
		
		battleField.comienzaBatalla();
		
		System.out.println(battleField.toString()); //Mostramos en pantalla a los participantes

		
	}

}
