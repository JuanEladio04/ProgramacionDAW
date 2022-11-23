package examenes.examen20221123;

//(2,5 puntos) Debes crear una clase Java, con un método “main” que cree un array de elementos
//de tipo ‘char’. El array puede ser el siguiente: [‘H’, ‘o’, ‘l’, ‘a’, ‘ ’, ‘M’, ‘u’, ‘n’, ‘d’, ‘o’].
//A continuación debes crear y usar un método como este
//“public static String minúsculas (char frase[])”.
//El método recibirá un array de elementos de tipo char y construirá y devolverá un String en el
//que estarán todas las letras convertidas en minúsculas. Puedes apoyarte en la imagen de la
//tabla Ascii que se adjunta en este documento.

public class Ejercicio04_StringEnMinusculas {

	public static void main(String[] args) { //Generamos la matriz la cual tendrá letras mayúsculas y minúsculas
		char frase[] = new char[] { 'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o'};		
		String fraseString = toString(frase); //Creamos la variable String
		
		//Mostramos los resultados
		System.out.println(fraseString);
			
	}
	
	public static String toString(char frase[]) {
		String fraseString = "";
		
		//Creamos un bucle que compruebe cada caracter
		for (int i = 0; i < frase.length; i++) {
			if ((frase[i] & frase[i]) <  96 && (frase[i] & frase[i]) > 64) { //Comprobamos mediante operadores a nivel de bits que los caracteres están dentro del rango de las mayusculas.
				frase[i] = (char) ((frase[i] & frase[i]) + 32); // En caso de que estén dentro del rango les restamos 32 provocando que se vuelvan minúsculas
			}
			fraseString = fraseString + frase[i] + " "; //Convertimos en String
		}
		
		return fraseString;
	}

}
