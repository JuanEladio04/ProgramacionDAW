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
	
	//Setters
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	
	public void setSurname (String surname) {
		this.surname = surname;
	}
	
	public String getSurname () {
		return this.surname;
	}
	
	
	public void setAddress (String address) {
		this.address = address;
	}
	public String getAddress () {
		return this.address;
	}
	
	
	public void setDNI (String dni) {
		this.dni = dni;
	}
	public String getDNI () {
		return this.dni;
	}
	

	public void setPhoneNumber (long number) {
		this.number = number;
	}
	public String getPhoneNumbre () {
		return  "" + this.number;
	}
	
	
	//ToString
	
	public String ToString() {
		
		return  "Nombre: " + this.name  + "\n" + 
				"Apellidos:" + this.surname + "\n" + 
				"DNI:" + this.dni + "\n" + 
				"Dirección:" + this.address + "\n" + 
				"Número de teléfono:" + this.number + "\n";
	}
	
	
	
	
}
