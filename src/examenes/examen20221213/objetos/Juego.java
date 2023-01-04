package examenes.examen20221213.objetos;

import java.util.Arrays;

import utils.Utils;

public class Juego {
	//Propiedades
	
	Ladrillo ladrillos[] = new Ladrillo[10];
	Pelota pelota = new Pelota();
	
	//Métodos
	
	/**
	 * Con este método comenzamos el juego
	 */
	public void startGame() {
		boolean terminado = true;
		inicializeBricks(); //Inicializamos los ladrillos
		String order[] = new String[this.ladrillos.length];
		
		do {
			showBricks(); //Mostramos los ladrillos
			setBallPosition(); //Le damos una posició a la pelota.
			
			BallInside(); // Comprobamos que la pelota haya golpeado, en caso de que haya golpeado  bajamos un punto de vida al ladrillo.
			order = destroyOrder(); //Guardamos el orden en el que son destruidos
			terminado = allDestroyed(); //Comprobamos que todos hayan sido destruidos 
			
		} while (terminado == false);
		showOrder(order);
		System.out.println("Juego terminado");
		
	}
	
	/**
	 * Inicializamos los ladrillos
	 */
	public void inicializeBricks() {
		for (int i = 0; i < this.ladrillos.length; i++) {
			this.ladrillos[i] = new Ladrillo("color", Utils.obtenerNumeroAzar(0, 800), Utils.obtenerNumeroAzar(0, 500), 100, 50, Utils.obtenerNumeroAzar(1, 3));
			
			if(this.ladrillos[i].getPuntosVida() == 1) {
				this.ladrillos[i].setColor(this.ladrillos[i].colors[Utils.obtenerNumeroAzar(0, 2)]);
			}
			else {
				if (this.ladrillos[i].getPuntosVida() == 2) {
					this.ladrillos[i].setColor("Plateado");
				}
				else this.ladrillos[i].setColor("Dorado");
			}
		}
	}
	
	/**
	 * Mostramos el orden en el que han sido destruidos
	 */
	public void showOrder(String order[]) {
		System.out.println("Primer ladrillo destruido: " + order[1]);
		for (int i = 0; i < order.length; i++) {
			System.out.print(order[i]);
		}
		System.out.println();
	}
	
	/**
	 * Miramos el orden en el que han sido destruidos
	 */
	
	public String[] destroyOrder() {
		String order[] = new String[this.ladrillos.length];
		for (int i = 0; i < this.ladrillos.length; i++) {
			if(ladrillos[i] != null && ladrillos[i].getPuntosVida() == 0) {
				for (int j = 0; j < order.length; j++) {
					order[j] = "Posición: " + j + " " + ladrillos[i].toString();
				}
			}
		}
		return order;
	}
	
	/**
	 * Comprobamos que queden ladrillos sin romper
	 */
	public boolean allDestroyed() {
		boolean destruidos = true;
		
		for (int i = 0; i < this.ladrillos.length; i++) {
			if (this.ladrillos[i] != null) { //Comprobamos que no sea nulo
				if(this.ladrillos[i].getPuntosVida() > 0) destruidos = false; //Comprobamos la cantidad de vida que le queda
				else this.ladrillos[i] = null;
			}
		}

		
		return destruidos;
	}
	
	/**
	 * Mostramos los ladrillos
	 */
	public void showBricks() {
		for (int i = 0; i < this.ladrillos.length; i++) {
			if(this.ladrillos[i] == null) {
				System.out.print("DESTRUIDO |");
			}
			else {
				System.out.print(this.ladrillos[i].getColor() + " Vida: " + this.ladrillos[i].getPuntosVida() +" | ");
			}
		}
		System.out.println();
	}
	
	/**
	 * Método para comprobar que un ladrillo ha sido golpeado
	 */
	public void BallInside() {
		for (int i = 0; i < this.ladrillos.length; i++) {
			if (this.ladrillos[i] != null) {
				if(this.pelota.getX() > this.ladrillos[i].getX() && this.pelota.getX() > (this.ladrillos[i].getX() + this.ladrillos[i].getAncho())) { //Comprobamos que está dentro de su ancho
					if(this.pelota.getY() > this.ladrillos[i].getY() && this.pelota.getY() > (this.ladrillos[i].getY() + this.ladrillos[i].getAlto())) { // Comprobamos que está dentro de su alto
						this.ladrillos[i].setPuntosVida(this.ladrillos[i].getPuntosVida() - 1); //Le quitamos un punto de vida el ladrillo
					}
				}
			}
		}
	}
	
	/**
	 * Creamos un método que asigne valores a la pelota
	 */
	public void setBallPosition() {
		this.pelota.setX(Utils.obtenerNumeroAzar(0, 900));
		this.pelota.setY(Utils.obtenerNumeroAzar(0, 600));
	}
	
	/**
	 * 
	 */
	public Juego() {
		super();
	}

	/**
	 * @param ladrillos
	 * @param pelota
	 */
	public Juego(Ladrillo[] ladrillos, Pelota pelota) {
		super();
		this.ladrillos = ladrillos;
		this.pelota = pelota;
	}

	public Ladrillo[] getLadrillos() {
		return ladrillos;
	}

	public void setLadrillos(Ladrillo[] ladrillos) {
		this.ladrillos = ladrillos;
	}

	public Pelota getPelota() {
		return pelota;
	}

	public void setPelota(Pelota pelota) {
		this.pelota = pelota;
	}

	@Override
	public String toString() {
		return "Juego [ladrillos=" + Arrays.toString(ladrillos) + ", pelota=" + pelota + "]";
	}

	
}
