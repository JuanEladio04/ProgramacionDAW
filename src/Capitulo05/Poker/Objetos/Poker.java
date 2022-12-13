package Capitulo05.Poker.Objetos;

import java.util.Arrays;

import Utils.Utils;

public class Poker {
	
	private Jugador jugadores[] = new Jugador [5];

	/**
	 * 
	 */
	public Poker() {
		super();
		for (int i = 0; i < jugadores.length; i++) {
			this.jugadores[i] = new Jugador();
			jugadores[i].setNombre(Utils.pideStringScanner("Introduce nombre del jugador " + (i + 1)));
		}
	}
	
	/**
	 * @param jugadores
	 */
	public Poker(Jugador[] jugadores) {
		super();
		this.jugadores = jugadores;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	@Override
	public String toString() {
		return "Poker [jugadores=" + Arrays.toString(jugadores) + "]" + "\n";
	}

}
