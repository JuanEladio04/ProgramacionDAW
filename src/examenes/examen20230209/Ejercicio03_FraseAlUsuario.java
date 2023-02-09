package examenes.examen20230209;

import java.util.Iterator;

import utils.Utils;

//Pide una frase al usuario. Toma la frase y divídela en palabras, teniendo en cuenta que la
//separación entre palabras puede ser de varios espacios en blanco. Recorre todas las palabras obtenidas
//y muestra en consola sólo aquellas que tengan al menos una mayúscula, DOS minúsculas, un dígito y un
//carácter no alfanumérico.
//Te recomiendo que, hasta que el programa funcione, en lugar de pedir al usuario que introduzca un String,
//establezcas este directamente, mediante programación. Te ahorrará tiempo.

public class Ejercicio03_FraseAlUsuario {

	public static void main(String[] args) {
		String frase = Utils.pideStringJOptionPane("Introduce una frase.");
		
		DivideFrase(frase);
		
	}
	
	public static void DivideFrase(String frase) {
		String palabra[] = frase.split("[ ]{1}");
		for (int i = 0; i < palabra.length; i++) {
			
			if (!palabra[i].isBlank()) {
				if (compruebaPalabra(palabra[i]) == true) {
					System.out.println(palabra[i]);
				}
			}	
		}
	}
	
	public static boolean compruebaPalabra(String palabra) {
		int contador = 0;
		boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSimbol = false;
		for (int i = 0; i < palabra.length(); i++) {
			if (Character.isUpperCase(palabra.charAt(i))) {
				hasUppercase = true;
			}
			else {
				if (Character.isLowerCase(palabra.charAt(i))) {
					contador++;
					if (contador >= 2) {
						hasLowercase = true;
						}
				}
				else {
					if (Character.isDigit(palabra.charAt(i))) {
						hasDigit = true;
					}
					else {
						if (!Character.isLetterOrDigit(palabra.charAt(i))) {
							hasSimbol = true;
						}
					}
				}
			}
		}
		
		if (hasSimbol == true && hasDigit == true && hasLowercase == true && hasUppercase == true) {
			return true;
		}
		else return false;
		
	}

}
