package examenes.examen20221213;

import Utils.Utils;
import examenes.examen20221213.objetos.Juego;

public class Main {

	public static void main(String[] args) {
		Juego game = new Juego();
		int option;
		
		do { //Creamos un menú para que el usuario pueda volver a jugar			
			System.out.println("Escoge una opción: " + "\n 1. Comenzar juego" + "\n 2. Salir");
			option = Utils.pideNumeroScanner("Introduce una opción: ");
			
			switch (option) {
			case 1:
				game.startGame();
				break;
				
			case 2:
				System.exit(0);
				
			default:
				break;
			}
		} while (true);
		
	}

}
