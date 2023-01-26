package Capitulo06.Bloque03;

import java.util.StringTokenizer;

import utils.Utils;

//2º.- Realiza un programa Java parecido al anterior en el que pidas al usuario una frase que contenga la palabra "bombilla". Las excepciones, creadas por ti, deben realizarse en los siguientes casos:
//- La frase introducida no tiene caracteres distintos al espacio en blanco.
//- La cantidad de palabras de la frase introducida es inferior a 3.
//- En la frase no aparece la palabra "bombilla".
//- En la frase aparece una palabra ofensiva de la siguiente relación: "tonto", "tonta", "idiota".
//Cada uno de los supuestos anteriores provocará un tipo diferente de excepción. Tú debes controlar todos los tipos y responder al usuario con un mensaje adecuado.

public class Ejercicio02_FraseConPalabraBombilla {

	public static void main(String[] args) {
		String fraseBombilla;
		
		try {
			fraseBombilla = Utils.pideStringScanner("Introduce una frase con la palabra bombilla:");
			
			System.out.println(NotBombillaException(fraseBombilla));
		} catch (NullPhraseException e) {
			System.out.println("Hay un problema en su frase: " + e.getMessage());
		}catch (SmallPhraseException e) {
			System.out.println("Hay un problema en su frase: " + e.getMessage());
		}catch (NotBombillaException e) {
			System.out.println("Hay un problema en su frase: " + e.getMessage());
		}catch (BadWordsException e) {
			System.out.println("Hay un problema en su frase: " + e.getMessage());
		}
		
	}
	
	private static String NotBombillaException(String frase) throws NotBombillaException, NullPhraseException, SmallPhraseException, BadWordsException{
		StringBuffer sb = new StringBuffer();
		
		if (frase == null) { //Una excepción en caso de que la frase sea nula.
			throw new NullPhraseException("La frase está vacía");
		}
		else { //Otra excepción por si el usuario introduce menos de 3 palabras.			
			if(frase.length() < 3) {
				throw new SmallPhraseException("La frase contiene menos de tres palabras."); 
			}
			else { //Otra en caso de que no introduzca la palabra bombilla.
				if(frase.compareTo("bombilla") == frase.length() || frase.compareTo("Bombilla") == frase.length()){
					throw new NotBombillaException("La frase no contiene la palabra bombilla.");
				}
				else {
					if(frase.contains("tonto") == true || frase.contains("tonta") == true ||  frase.contains("idiota") == true){
						throw new BadWordsException("No insultes que está feo.");
					}
					else {
						sb.append("La frase contiene todos los requisitos.");
					}
				}
			}
		}
		
		return sb.toString();
	}

}