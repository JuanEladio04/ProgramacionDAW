package Capitulo05.Vajilla.Objects;

public class Plato {
	//Características
	int id;
	int suciedad;
	int dureza;
	float rotura;
	
	/**
	 * Constructor por defecto
	 */
	public Plato() {
		super();
	}
	
	/**
	 * @param id
	 * @param suciedad
	 * @param dureza
	 * @param rotura
	 */
	public Plato(int id, int suciedad, int dureza, float rotura) {
		super();
		this.id = id;
		this.suciedad = suciedad;
		this.dureza = dureza;
		this.rotura = rotura;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSuciedad() {
		return suciedad;
	}
	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}
	public int getDureza() {
		return dureza;
	}
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}
	public float getRotura() {
		return rotura;
	}
	public void setRotura(float rotura) {
		this.rotura = rotura;
	}
	
	@Override
	public String toString() {
		return "Plato: id=" + id + ", suciedad=" + suciedad + ", dureza=" + dureza + ", rotura=" + rotura + "|";
	}
	
	


}
