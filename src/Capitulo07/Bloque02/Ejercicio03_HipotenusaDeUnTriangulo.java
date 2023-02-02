package Capitulo07.Bloque02;

//3º.- Dado un triángulo rectángulo cuyos catetos miden 4 cm y 5 cm respectivamente, hallar cuanto mide la hipotenusa.


public class Ejercicio03_HipotenusaDeUnTriangulo {

	public static void main(String[] args) {
		float catX = 4, catY = 5, hipotenusa;
		
		hipotenusa = (float) Math.hypot(catX, catY);
		
		System.out.println("La hipotenusa del triangulo es: " + hipotenusa);
	}

}
