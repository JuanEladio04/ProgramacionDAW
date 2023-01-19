package Capitulo06.Bloque02.objects;

public class Producto {
	//Propiedades del objeto.
	
	int codigoBarras, nEstante, cantidadStock;

	/**
	 * Constructor por defecto.
	 */
	public Producto() {
		super();
	}

	/**
	 * Constructor Avanzado
	 * @param codigoBarras
	 * @param nEstante
	 * @param cantidadStock
	 */
	public Producto(int codigoBarras, int nEstante, int cantidadStock) {
		super();
		this.codigoBarras = codigoBarras;
		this.nEstante = nEstante;
		this.cantidadStock = cantidadStock;
	}

	/**
	 * @return the codigoBarras
	 */
	public int getCodigoBarras() {
		return codigoBarras;
	}

	/**
	 * @param codigoBarras the codigoBarras to set
	 */
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	/**
	 * @return the nEstante
	 */
	public int getnEstante() {
		return nEstante;
	}

	/**
	 * @param nEstante the nEstante to set
	 */
	public void setnEstante(int nEstante) {
		this.nEstante = nEstante;
	}

	/**
	 * @return the cantidadStock
	 */
	public int getCantidadStock() {
		return cantidadStock;
	}

	/**
	 * @param cantidadStock the cantidadStock to set
	 */
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	@Override
	public String toString() {
		return "nEstante=" + nEstante + ", cantidadStock=" + cantidadStock;
	}
	
	

}
