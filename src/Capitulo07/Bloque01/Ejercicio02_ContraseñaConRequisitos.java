package Capitulo07.Bloque01;

import utils.Utils;

//2º.- Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
//- Al menos una mayúscula.
//- Al menos una minúscula.
//- Al menos un dígito
//- Al menos un carácter no alfanumérico.
//El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.

public class Ejercicio02_ContraseñaConRequisitos {

	public static void main(String[] args) {
		String contraseña = introduceContraseña();
		
		System.out.println("Su contraseña es: " + contraseña);
	}
	
	public static String introduceContraseña() {
		boolean esValida;
		String password; 
		do {
			password = Utils.pideStringScanner("Introduzca la nueva contraseña: ");
			esValida = compruebaContraseña(password);
		} while (!esValida);
		
		return password;
	}
	
	private static boolean compruebaContraseña(String password) {
		boolean isValid = false, tieneMayuscula = false, tieneMinuscula = false, tieneDigito = false, tieneSimbolo = false;
		
		for (int i = 0; i < password.length(); i++) {
			char passChar = password.charAt(i);
			
			if(Character.isUpperCase(passChar)) {
				tieneMayuscula = true;
			}
			else if (Character.isLowerCase(passChar)){
				tieneMinuscula = true;
			}
			else if (Character.isDigit(passChar)){
				tieneDigito = true;
			}
			else if(!Character.isLetterOrDigit(passChar)) {
				tieneSimbolo = true;
			}
		}
		
		if (tieneMayuscula && tieneMinuscula && tieneDigito && tieneSimbolo) {
			System.out.println("La contraseña es válida");
			isValid = true;
		}
		else {
			System.out.println("Contraseña no válida, intentelo de nuevo");
			isValid = false;
		}
		
		return isValid;
	}

}
