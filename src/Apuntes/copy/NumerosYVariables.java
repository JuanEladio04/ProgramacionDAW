package Apuntes.copy;

public class NumerosYVariables {

	public static void main(String[] args) {
		int numEntero = 14;
		System.out.println(numEntero);
		boolean F = false;
//		boolean = true/false byte= 2^8 short= 2^16 int=2^32 long=2^64 (no decimales)
		
		
		/* DECIMALES 
		 * float=2^32 Double= 2^64
		 */
		
		double bruh = 7.7;
		System.out.println(bruh);
//		Casting
		long numGrande = 78;
		int boh = (int) numGrande;
		
		float flotante = 23.4f;
		int brodel = (int) flotante; 
		
		System.out.println(brodel);
		
		System.out.println(brodel + bruh + numEntero);
		
		String palabra = "nombre de la variable"; //Solo para valores no numericos. Los números escritos aqui seran considerados parte del texto.
//		En caso de suma de ina variable de numeros (int, float, bouble...) con una cadena de caracteres (string) dara un fallo ya que los string tienen la finalidad de concatenar
//		para concatenar variebles numericas es necesario convertirlas en string.
		int Cnumero = 32;
			
	}

}
