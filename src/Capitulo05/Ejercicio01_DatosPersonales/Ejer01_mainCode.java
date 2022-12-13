package Capitulo05.Ejercicio01_DatosPersonales;

import java.util.Iterator;

import Utils.Utils;

public class Ejer01_mainCode {

	public static void main(String[] args) {
		int option, i = 0;
		Persona persona[] = new Persona[10];
		
		do {
			System.out.println("Introduce una opción:" + "\n" + 
					"1. Introducir datos de la persona." + "\n" + 
					"2. Ver datos personales."  + "\n" +
					"3. Salir."
					);

			option = Utils.pideNumeroScanner(""); //Pedimos la opción al usuario
			
			switch (option) { //Creamos el menú mediante un switch.
			case 1: //Introducir datos personales;
				persona[i].setName(Utils.pideStringScanner("Introduce el nombre."));
				persona[i].setSurname(Utils.pideStringScanner("Introduce los apellidos"));
				persona[i].setDNI(Utils.pideStringScanner("Introduce el DNI."));
				persona[i].setAddress(Utils.pideStringScanner("Introduce la dirección de la persona[i]."));
				persona[i].setPhoneNumber(Utils.pideNumeroScanner("Introduce el número de teléfono"));
								
				System.out.println("Datos de la persona nº" + i + " han sido añadidos.");
				
				i++; //Añadimos un incremento para llevar la cuenta de las personas creadas.
								
				break;
				
			case 2:
				System.out.println("Personas creadas: " + i); //Mostramos la cantidad de personas creadas
//				option = Utils.pideNumeroScanner("Introduce el número de la persona cuyos datos quieres visualizar."); //Pedimos al usuario el número de la persona que quiere visualizar
				
//				for (int j = 0; j < persona.lenght; j++) {
//					System.out.println("Datos de la persona: " + j);
					System.out.println(persona[i].ToString());

//				}
				
				break;
				
			case 3:	
				System.exit(0); //Salimos del programa
				break;
				
			default: //En caso de que el usuario introduzca una una opción inválida
				System.out.println("Introduce una opción válida.");
				break;
			}
		} while (true);
		
		
		
		
	}

}
