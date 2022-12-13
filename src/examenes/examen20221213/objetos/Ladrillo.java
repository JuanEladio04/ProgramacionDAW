package examenes.examen20221213.objetos;

import Utils.Utils;

public class Ladrillo {
	//Propiedades
	String color;
	int x;
	int y;
	int ancho;
	int alto;
	int puntosVida;
	
	//Colores
	String colors[] = new String [] {"Rojo", "Verde", "Azul"};
	
	//Métodos

	
	/**
	 * Constructor por defecto
	 */
	public Ladrillo() {
		super();
		Ladrillo ladrillo = new Ladrillo(color, Utils.obtenerNumeroAzar(0, 800), Utils.obtenerNumeroAzar(0, 500), 100, 50, Utils.obtenerNumeroAzar(1, 3));
		
		if(ladrillo.getPuntosVida() == 1) {
			ladrillo.setColor(colors[Utils.obtenerNumeroAzar(0, 2)]);
		}
		else {
			if (ladrillo.getPuntosVida() == 2) {
				ladrillo.setColor("Plateado");
			}
			else ladrillo.setColor("Dorado");
		}
	}
	
	/**
	 * @param color
	 * @param x
	 * @param y
	 * @param ancho
	 * @param alto
	 * @param puntosVida
	 */
	public Ladrillo(String color, int x, int y, int ancho, int alto, int puntosVida) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.puntosVida = puntosVida;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "Ladrillo [color=" + color + ", x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto
				+ ", puntosVida=" + puntosVida + "]";
	}
	
	
	
	
	
}
