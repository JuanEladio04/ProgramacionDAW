package examenes.examen20221213.objetos;

public class Pelota {
	//Propiedades
	int x;
	int y;
	
	//Métodos
	
	/**
	 * Constructor por defecto
	 */
	public Pelota() {
		super();
	}
	/**
	 * @param x
	 * @param y
	 */
	public Pelota(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	@Override
	public String toString() {
		return "Pelota [x=" + x + ", y=" + y + "]";
	}
	
	
}
