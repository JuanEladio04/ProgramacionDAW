package Capitulo05.Batalla.Objetos;

import java.util.Arrays;

import utils.Utils;

public class CampoBatalla {
	
	//Atributos
	private Humano agentes[] = new Humano[20];
	private Malvado aliens[] = new Malvado[20];
	
	/**
	 * 
	 */
	public void comienzaBatalla() {
		boolean resultado = true, terminado = false;
		
		atacan();
		
		if(contadorBajasM() == 20) System.out.println("Los ganadores son los humanos");
		else System.out.println("Los ganadores son los malvados");
	}
	
	/**
	 *Creamos los diferentes ataques de ambos bandos
	 */
	public void atacan() {
		boolean terminado = false;
		int contadorH = 0, contadorM = 0, turno = 0;
		do {
			if((turno % 2) == 0) { //En caso de que el turno sea par el turno será de los humanos
				for (int i = 0; i < this.agentes.length; i++) {
					if(this.agentes[i].isVivo() == true) { //Buscamos un humano vivo
						for (int j = 0; j < this.aliens.length; j++) { //Buscamos un humano vivo
							if(this.aliens[j].isVivo() == true) { //Realizamos el ataque
								this.aliens[j].setVida(this.aliens[j].getVida() - Utils.obtenerNumeroAzar(5, 25));
								this.aliens[j].setDisparosRecibidos(this.aliens[j].getDisparosRecibidos() + 1);
								j = this.aliens.length - 1;
							}
						}
						i = this.agentes.length - 1;
					}
				}
			}
						
			else { //En caso de ser impar el turno será de los aliens
				for (int i = 0; i < this.aliens.length; i++) {
					if(this.aliens[i].isVivo() == true) { //Buscamos un alien vivo
						for (int j = 0; j < this.agentes.length; j++) { //Buscamos un humano vivo
							if(this.agentes[j].isVivo() == true) { //Realizamos el ataque
								this.agentes[j].setVida(this.agentes[j].getVida() - Utils.obtenerNumeroAzar(5, 25));
								this.agentes[j].setDisparosRecibidos(this.agentes[j].getDisparosRecibidos() + 1);
								j = this.agentes.length - 1;
							}
						}
						i = this.aliens.length - 1;
					}
				}
			}
			
			//Comprobamos los que están vivos
			isAliveH();
			isAliveM();
			//Contamos las bajas de los diferentes bandos
			contadorH = contadorBajasH();
			contadorM = contadorBajasM();
			
			//Comprobamos que el bucle haya terminado
			if(contadorH == this.agentes.length || contadorM == this.aliens.length) terminado = true;
			
			turno++;
			
			//Mostramos la situación
			
			System.out.println("Turno nº " + turno + "\n" + toString() + "\n");
		} while (terminado == false);
	}
	
	/**
	 * Contamos las bajas humanas 
	 * @return
	 */
	public int contadorBajasH() {
		int contador = 0;
		for (int i = 0; i < this.agentes.length; i++) {
			if (this.agentes[i].isVivo() == false) contador++;
		}
		return contador;
	}
	
	/**
	 * Contamos las bajas humanas 
	 * @return
	 */
	public int contadorBajasM() {
		int contador = 0;
		for (int i = 0; i < this.aliens.length; i++) {
			if (this.aliens[i].isVivo() == false) contador++;
		}
		return contador;
	}
	
	
	/**
	 * Contamos las bajas humanas
	 */
	public void isAliveH() {
		for (int i = 0; i < agentes.length; i++) {
			if(this.agentes[i].getVida() <= 0) this.agentes[i].setVivo(false);
		}
	}
	
	/**
	 * Contamos las bajas malvadas
	 */
	public void isAliveM() {
		for (int i = 0; i < aliens.length; i++) {
			if(this.aliens[i].getVida() <= 0) this.aliens[i].setVivo(false);
		}
	}
	
	
	/**
	 * 
	 */
	public void shuffle() { 
		//Mezclamos los humanos
		for (int i = 0; i < Utils.obtenerNumeroAzar(500, 1000); i++) {
			int pos1 = Utils.obtenerNumeroAzar(0, this.agentes.length - 1);
			int pos2 = Utils.obtenerNumeroAzar(0, this.agentes.length - 1);
			Humano aux = this.agentes[pos1];
			this.agentes[pos1] = this.agentes[pos2];
			this.agentes[pos2] = aux;
		}
		//Mezclamos los Malvados
		for (int i = 0; i < Utils.obtenerNumeroAzar(500, 1000); i++) {
			int pos1 = Utils.obtenerNumeroAzar(0, this.aliens.length - 1);
			int pos2 = Utils.obtenerNumeroAzar(0, this.aliens.length - 1);
			Malvado aux = this.aliens[pos1];
			this.aliens[pos1] = this.aliens[pos2];
			this.aliens[pos2] = aux;
		}
	}
	
	/**
	 * 
	 */
	public void inizializaHumano() {
		for (int i = 0; i < this.agentes.length; i++) {
			this.agentes[i] = new Humano("Agente00" + (i + 1), Utils.obtenerNumeroAzar(50, 100), true, 0);
		}
		this.agentes[this.agentes.length - 1].setVida(Utils.obtenerNumeroAzar(100, 200));
	}
	
	/**
	 * 
	 */
	public void inicializaMalvado() {
		for (int i = 0; i < this.aliens.length; i++) {
			this.aliens[i] = new Malvado("Alien nº" + (i + 1), Utils.obtenerNumeroAzar(50, 100), true, 0);
		}
		this.aliens[this.aliens.length - 1].setVida(Utils.obtenerNumeroAzar(100, 200));
	}
	
	/**
	 * 
	 */
	public CampoBatalla() {
		super();
		inizializaHumano();
		inicializaMalvado();
	}
	/**
	 * @param agentes
	 * @param aliens
	 */
	public CampoBatalla(Humano[] agentes, Malvado[] aliens) {
		super();
		this.agentes = agentes;
		this.aliens = aliens;
	}
	public Humano[] getAgentes() {
		return agentes;
	}
	public void setAgentes(Humano[] agentes) {
		this.agentes = agentes;
	}
	public Malvado[] getAliens() {
		return aliens;
	}
	public void setAliens(Malvado[] aliens) {
		this.aliens = aliens;
	}
	@Override
	public String toString() {
		return "CampoBatalla: " + "\n" + "agentes=" + Arrays.toString(agentes) + "\n \n" + "aliens=" + Arrays.toString(aliens);
	}
	
	
	
	
}
