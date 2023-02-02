package Capitulo07.Bloque02;

//1º.- Averiguar, con una precisión inferior a 0.001, en qué punto (x, y) se cortan las gráficas de las siguientes funciones:
//y = sqrt(x)
//y = - ln(x)

public class Ejercicio01_PuntoDeCorte {

	public static void main(String[] args) {
	    double x0 = 0.1;
	    double x1 = 10;
	    double epsilon = 0.001;
	    double fx0, fx1;
	    double xm;
	    
	    do {
	      xm = (x0 + x1) / 2;
	      fx0 = Math.sqrt(x0) + Math.log(-x0);
	      fx1 = Math.sqrt(x1) + Math.log(-x1);
	      if (fx0 * fx1 < 0) {
	        x1 = xm;
	      } else {
	        x0 = xm;
	      }
	    } while (Math.abs(fx1 - fx0) > epsilon);
	    
	    System.out.println("La intersección se encuentra en x = " + xm);
	}

}
