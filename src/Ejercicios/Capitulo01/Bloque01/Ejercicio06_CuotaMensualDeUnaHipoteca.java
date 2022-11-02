package Ejercicios.Capitulo01.Bloque01;

import java.util.Scanner;

/*
 * 6º.- Realiza un ejercicio en C para el cálculo de la cuota mensual de una hipóteca (tema tan importante hoy día ;-)). La formula para la cuota mensual es:

                                           N
                            Im * ( 1 + Im )
Cuota Mensual = Capital * ---------------------
                                      N
                           ( 1 + Im )   -   1


                                   Interés Anual
                                  -------------
                                         12
Donde: Im es el Interes mensual = ----------------
                                        100

Interés Anual = Euribor + Diferencial (Ganancia del banco o caja)
Capital = Cantidad de unidades monetarias de la hipoteca
N = Número de plazos mensuales de la hipoteca.

Se deben pedir al usuario los datos de Euribor (float), Diferencial (float), Capital (float) y Número de plazos mensuales para pagar la hipoteca (int). A partir de esos datos se debe calcular y mostrar al usuario el importe de la cuota mensual.

 */
public class Ejercicio06_CuotaMensualDeUnaHipoteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		
		System.out.println("Introduzca el valor del Euribor: ");
		float euribor = sc.nextFloat();
		
		System.out.println("Introduzca el diferencial: ");
		float diferencial = sc.nextFloat();
		
		System.out.println("Introduzca el capital: ");
		float capital = sc.nextFloat();
		
		System.out.println("Introduce el número de plazos mensuales para pagar la hipoteca: ");
		int N = sc.nextInt();
		
		double iAnual = Math.sqrt(euribor + diferencial);
		double iMensual = Math.sqrt((iAnual/12)/100);
		double cMensual = Math.sqrt(capital*(iMensual*(Math.pow((1+iMensual), N))/(Math.pow((1+iMensual), N)-1)));
		System.out.println("La cuota mensual tendría un valor de: "
				+ "\n" + cMensual
		);
	
		
		
		
		
		
		
	}

}
