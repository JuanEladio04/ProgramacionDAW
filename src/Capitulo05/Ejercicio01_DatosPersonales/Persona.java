package Capitulo05.Ejercicio01_DatosPersonales;

public class Persona {
	
	/**
	 * Propiedades de la clase persona
	 */
	
	private String name;
	private String surname;
	private String dni;
	private String address;
	private long number;
	
	/**
	 * Método constructor por defecto
	 */
	
	public Persona () {	
	}
	
	/**
	 * Método constructor
	 * 
	 * @param name
	 * @param surname
	 * @param dni
	 * @param address
	 * @param phoneNumber
	 */
	
	public Persona (String name, String surname, String dni, String address, long phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.address = address;
		this.number = phoneNumber;
	}
	
	
	private String PersonaToString() {
		
		return "Nombre: " + name ;
	}
	
}
