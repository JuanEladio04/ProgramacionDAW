package Capitulo05.Poker;


import Capitulo05.Poker.Objetos.Baraja;
import Capitulo05.Poker.Objetos.Jugador;
import Capitulo05.Poker.Objetos.Poker;

public class PokerMainClass {

	public static void main(String[] args) {
		
		Baraja naipes = new Baraja();
		Poker players = new Poker();
		
		System.out.println(naipes.toString());
				
		naipes.mezclar();
		
		
		System.out.println(players.toString());
		System.out.println(naipes.toString());
		
	}

}
