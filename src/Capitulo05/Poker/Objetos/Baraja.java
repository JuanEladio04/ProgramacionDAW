package Capitulo05.Poker.Objetos;

import java.util.Arrays;
import java.util.Iterator;

import utils.Utils;

public class Baraja {
	

	Carta carta[] = new Carta[52];
	
	/**
	 * 
	 */
	public void rotacionAbajoArriba() {
		Carta aux = this.carta[0];
		
		for (int i = 0; i < this.carta.length - 1; i++) {
			this.carta[i] = this.carta[i + 1];
		}
		this.carta[carta.length - 1] = aux;
	}
	
	/**
	 * 
	 */
	public void rotacionArribaAbajo() {
		Carta aux = this.carta[this.carta.length - 1];
		
		for (int i = this.carta.length - 1; i > 0; i--) {
			this.carta[i] = this.carta[i - 1];
		}
		this.carta[0] = aux;
	}
	
	/**
	 * 
	 */
	public void mezclar() {
		for (int i = 0; i < Utils.obtenerNumeroAzar(500, 1000); i++) {
			int pos1 = Utils.obtenerNumeroAzar(0, this.carta.length - 1);
			int pos2 = Utils.obtenerNumeroAzar(0, this.carta.length - 1);
			Carta aux = this.carta[pos1];
			this.carta[pos1] = this.carta[pos2];
			this.carta[pos2] = aux;
		}
	}
	
	/**
	 * 
	 */
	public void ordenar() {
		boolean ordenado = true;
		Carta aux;
	       do {
	          ordenado = false;
	           for (int i = 0; i < this.carta.length - 1; i++) {
	               if (this.carta[i + 1].getId()  < this.carta[i].getId() ) {
	                   aux = this.carta [i];
	                   this.carta [i] = this.carta [i + 1];
	                   this.carta [i + 1] = aux;
	                   ordenado = true;
	               }
	           }
	       } while (ordenado == true);
	        	
	}
	
	public void repartirMano(Jugador[] player) {
		int contador = 0;
		for (int j = 0; j < player.length; j++) {
			for (int i = 0; i < this.carta.length && contador < 5; i++) {
				if(this.carta != null) {
					player[j].getMano()[contador] = this.carta[i];
					this.carta[i] = null;
					contador++;
				}
			}
		}
	}
	

	/**
	 * 	
	 */
	
	public Baraja() {
		int j = 0;
		
		//PICAS
		for (int i = 0; i < 13; i++, j++) {
			carta[j] = new Carta("Picas" , i + 1, j);
		}
		
		//DIAMANTES
		for (int i = 0; i < 13; i++, j++) {
			carta[j] = new Carta("Diamantes" , i + 1, j);
		}

		//TREBOLES
		for (int i = 0; i < 13; i++, j++) {
			carta[j] = new Carta("Tréboles" , i + 1, j);
		}
		
		//CORAZONES
		for (int i = 0; i < 13; i++, j++) {
			carta[j] = new Carta("Corazones" , i + 1, j);
		}
	}
	
	
	/**
	 * @param carta
	 */
	public Baraja(Carta[] carta) {
		super();
		this.carta = carta;
	}

	/**
	 * @return the carta
	 */
	public Carta[] getCarta() {
		return carta;
	}

	/**
	 * @param carta the carta to set
	 */
	public void setCarta(Carta[] carta) {
		this.carta = carta;
	}

	@Override
	public String toString() {
		return "Baraja [carta=" + Arrays.toString(carta) + "]";
	}
	
	/**
	 * 
	 * @param baraja
	 * @return
	 */		
	
}
