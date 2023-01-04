package Capitulo05.Vajilla.Objects;

import java.util.Arrays;

import utils.Utils;

public class Vajilla {
	//Elementos
	Plato platos[] = new Plato[Utils.obtenerNumeroAzar(1, 5)];
	Plato limpios[] = new Plato[platos.length];
	Plato rotos[] = new Plato[platos.length];

	/**
	 * @param platos
	 */
	public Vajilla(Plato[] platos) {
		super();
		this.platos = platos;
	}

	/**
	 * Constructor 
	 */
	public Vajilla() {
		for (int i = 0; i < platos.length; i++) {
			this.platos[i] = new Plato(i, Utils.obtenerNumeroAzar(10, 100), Utils.obtenerNumeroAzar(1, 3), Utils.obtenerNumeroAzar(0, 1)); 
		}
		
	}
	
	/**
	 * Limpiar todos los platos
	 */
	public void limpiaPlatos() {
		boolean roto = false;
		boolean limpios = false;
		do {
			muestraSucios();
			muestraLimpios();
			for (int i = this.platos.length - 1; i >= 0 && roto == false; i--) {
				if (this.platos[i].getSuciedad() >= 0) { //Si el plato está sucio procedemos a limpiarlo
					this.platos[i].setSuciedad(this.platos[i].getSuciedad() - Utils.obtenerNumeroAzar(20, 40));
					limpios = false;
					i--;
				}
				else {
					this.limpios[i] = this.platos[i];
					limpios = true;
				}
			}
		} while (limpios == false);
		System.out.println("Resultado final: ");
		muestraSucios();
		muestraLimpios();
	}
	
	/**
	 * Mostrar los platos sucios
	 */
	public void muestraSucios() {
		for (int i = 0; i < this.platos.length; i++) {
			if(this.platos[i].getSuciedad() >= 0) {
				System.out.print("Sucios: " + this.platos[i].toString());
			}
		}
		System.out.println();
	}

	/**
	 * Mostrar los platos limpios
	 * @return
	 */
	public void muestraLimpios() {
		for (int i = 0; i < limpios.length; i++) {
			if (this.limpios[i] != null) {
				System.out.print("Limpios: " + this.limpios[i].toString());
			}
		}
		System.out.println();
	}

	public Plato[] getPlatos() {
		return platos;
	}

	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}

	public Plato[] getLimpios() {
		return limpios;
	}

	public void setLimpios(Plato[] limpios) {
		this.limpios = limpios;
	}

	public Plato[] getRotos() {
		return rotos;
	}

	public void setRotos(Plato[] rotos) {
		this.rotos = rotos;
	}

	@Override
	public String toString() {
		return "Vajilla [platos=" + Arrays.toString(platos) + "]";
	}
	
	
	
}
