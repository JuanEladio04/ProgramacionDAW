package Capitulo07.Bloque01;

//1º.- Realizar un programa que imprima una tabla (simplemente unas líneas en la consola) con los límites máximo y mínimo representables para los diferentes tipos primitivos en Java (Float, int, short, long, float, double). En la tabla también deberá aparecer el número de Floats que cada tipo usa para su representación.


public class Ejercicio01_TablaEnConsola {

	public static void main(String[] args) {
		System.out.println("Byte:");
		System.out.println("Mínimo: " + Byte.MIN_VALUE);
		System.out.println("Máximo: " + Byte.MAX_VALUE);
		System.out.println("Nº de Bytes: " + Byte.BYTES);
		
		System.out.println("Integer:");
		System.out.println("Mínimo: " + Integer.MIN_VALUE);
		System.out.println("Máximo: " + Integer.MAX_VALUE);
		System.out.println("Nº de Bytes: " + Integer.BYTES);
		
		System.out.println("Short:");
		System.out.println("Mínimo: " + Short.MIN_VALUE);
		System.out.println("Máximo: " + Short.MAX_VALUE);
		System.out.println("Nº de Bytes: " + Short.BYTES);
		
		System.out.println("Long:");
		System.out.println("Mínimo: " + Long.MIN_VALUE);
		System.out.println("Máximo: " + Long.MAX_VALUE);
		System.out.println("Nº de Bytes: " + Long.BYTES);
		
		System.out.println("Float:");
		System.out.println("Mínimo: " + Float.MIN_VALUE);
		System.out.println("Máximo: " + Float.MAX_VALUE);
		System.out.println("Nº de Bytes: " + Float.BYTES);
		
		System.out.println("Double:");
		System.out.println("Mínimo: " + Double.MIN_VALUE);
		System.out.println("Máximo: " + Double.MAX_VALUE);
		System.out.println("Nº de Bytes: " + Double.BYTES);
	}
	
}
	
	
