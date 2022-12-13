package Capitulo05.Batalla.Objetos;

public class Humano {

	//Atributos
	private String nombre;
	private int vida;
	private boolean vivo;
	private int disparosRecibidos;
	
	/**
	 * Comprobamos que participantes están vivos
	 */
	public void isAlive() {
		if (this.vida <= 0) {
			this.vivo = false;
		}
	}
	
	/**
	 * 
	 */
	public Humano() {
		super();
	}
	/**
	 * @param nombre
	 * @param vida
	 * @param vivo
	 * @param disparosRecibidos
	 */
	public Humano(String nombre, int vida, boolean vivo, int disparosRecibidos) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.vivo = vivo;
		this.disparosRecibidos = disparosRecibidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public 
	int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public boolean isVivo() {
		return vivo;
	}
	
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}
	
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}
	
	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", vida=" + vida + ", vivo=" + vivo + ", disparosRecibidos="
				+ disparosRecibidos + "]";
	}
	
	
}
