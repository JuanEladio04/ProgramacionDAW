package Capitulo07.bloque04;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

public class Calculator {
	private static List<NoValidNumberListener> listeners = new ArrayList<NoValidNumberListener>();

	public static void main(String[] args) {
		NumberListener listener = new NumberListener();
		funtionalMenu();
	}
	
	
	/**
	 * 
	 */
	private static void showMenu() {
		System.out.println("CALCULADORA:" + "\n" +
				"1. Suma " + "\n" +
				"2. Resta"  + "\n" +
				"3. Multiplicación"  + "\n" +
				"4. División"  + "\n" +
				"5. Raiz cuadrada" + "\n" +
				"6. Salir"
				);
	}
	
	
	/**
	 * 
	 */
	private static void funtionalMenu() {
		int option;
		int num1, num2;
		do {
			showMenu();
			option =  Utils.pideNumeroScanner("Escoge una opción.");
			switch (option) {
			case 1: //Suma
				num1 = Utils.pideNumeroScanner("Introduce el primer numero a sumar.");
				num2 = Utils.pideNumeroScanner("Introduce el segundo numero a sumar.");
				System.out.println(suma(num1, num2));
				break;
				
			case 2: //Resta
				num1 = Utils.pideNumeroScanner("Introduce el primer numero a restar.");
				num2 = Utils.pideNumeroScanner("Introduce el segundo numero a restar.");
				System.out.println(resta(num1, num2));
				break;
				
			case 3: //Multiplicacion
				num1 = Utils.pideNumeroScanner("Introduce el primer numero a multiplicar.");
				num2 = Utils.pideNumeroScanner("Introduce el segundo numero a multiplicar.");
				System.out.println(multiplicacion(num1, num2));
				break;
				
			case 4: //División
				num1 = Utils.pideNumeroScanner("Introduce el dividendo.");
				num2 = Utils.pideNumeroScanner("Introduce el divisor.");
				System.out.println(division(num1, num2));
				break;
				
			case 5: //Raiz cuadrada
				num1 = Utils.pideNumeroScanner("Itroduce el número del que desea saber la raiz");
				System.out.println(raizCuadrada(num1));
				break;

			default:
				break;
			}
		} while (option <= 5);
	}
	
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int suma(int num1, int num2) {
		checkResultBiggerThan1000(num1 + num2);
		return (num1 + num2);
	}
	
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int resta(int num1, int num2) {
		checkResultSmallerThan0(num1 - num2);
		return (num1 - num2);
	}
	
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int multiplicacion(int num1, int num2) {
		checkResultBiggerThan1000(num1 * num2);
		return (num1 * num2);
	}
	
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int division(int num1, int num2) {
		checkNumberEqualThan0(num2);
		
		try {
			return (num1 / num2);
		} catch (Exception e) {
			return 0;
		}

	}
	
	
	/**
	 * 
	 * @param num1
	 * @return
	 */
	public static double raizCuadrada(int num1) {
		checkResultSmallerThan0(num1);
		return Math.sqrt(num1);
	}
	
	
	/**
	 * 
	 * @param result
	 */
	public static void checkResultBiggerThan1000(int result) {
		if(result > 1000) {
			NoValidNumberEvent e = new NoValidNumberEvent();
			e.setNumber(result);
			fireResultBiggerTo1000(e);
		}
	}
	
	
	/**
	 * 
	 */
	public static void checkResultSmallerThan0(int result) {
		if(result < 0) {
			NoValidNumberEvent e = new NoValidNumberEvent();
			e.setNumber(result);
			fireNumberSmallerThan0(e);
		}
	}
	
	
	/**
	 * 
	 */
	public static void checkNumberEqualThan0(int num) {
		if(num == 0) {
			fireNumberEqualThan0();
		}
	}
	
	
	/**
	 * 
	 */
	public static void addNumberListener(NoValidNumberListener l) {
		listeners.add(l);
	}
	
	
	/**
	 * 
	 * @param e
	 */
	public static void fireResultBiggerTo1000(NoValidNumberEvent e) {
		for (NoValidNumberListener l : listeners) {
			l.resultBiggerThan1000(e);
		}
	}
	
	
	/**
	 * 
	 * @param e
	 */
	public static void fireResultSmallerThan0(NoValidNumberEvent e) {
		for (NoValidNumberListener l : listeners) {
			l.resultSmallerThan0(e);
		}
	}
	
	
	/**
	 * 
	 * @param e
	 */
	public static void fireNumberSmallerThan0(NoValidNumberEvent e) {
		for (NoValidNumberListener l : listeners) {
			l.resultSmallerThan0(e);
		}
	}
	
	
	/**
	 * 
	 * @param e
	 */
	public static void fireNumberEqualThan0() {
		for (NoValidNumberListener l : listeners) {
			l.numberEqualThan0();
		}
	}

}
