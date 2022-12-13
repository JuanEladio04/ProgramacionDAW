package Capitulo05.Poker.Objetos;

import java.util.Arrays;

public class Jugador {
	private String nombre;
	private Carta mano[] = new Carta[5];
	
	public void inspeccionarMano() {
		for (int i = 0; i < mano.length; i++) {
			int contadorCartasIguales = 1;
			for (int j = 0; j < mano.length; j++) {
				if (this.mano[i].getValor() == this.mano[i].getValor()) {
					contadorCartasIguales++;
				}
				System.out.println(contadorCartasIguales);
			}
		}
	}
	
	/**
	 * 
	 */
	public Jugador() {
		super();
	}
	/**
	 * @param nombre
	 * @param mano
	 */
	public Jugador(String nombre, Carta[] mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta[] getMano() {
		return mano;
	}

	public void setMano(Carta[] mano) {
		this.mano = mano;
		
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + " Mano: " + Arrays.toString(mano);
	}
	
	
	
}
