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
	}
	
	public static String introduceContraseña() {
		String password = Utils.pideStringScanner("Introduzca la nueva contraseña");
		
		
		
		return password;
	}
	
	private static void compruebaContraseña(String passsword) {
		
	}

}
