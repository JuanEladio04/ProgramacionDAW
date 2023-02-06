package Capitulo07.Bloque02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import utils.Utils;

//4º.- Crea un programa en Java que pida al usuario la introducción de una fecha a través de JOptionPane. El usuario te especificará un dato de tipo String y tú debes convertirlo a un objeto de tipo java.util.Date utilizando SimpleDateFormat. A continuación realiza las siguientes acciones
//- Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la misma fecha que ha introducido el usuario.
//- Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y segundo. Cada campo debe aparecer en una línea de la consola. Debes obtener cada campo desde el objeto java.util.Date y desde el objeto Calendar. Es decir, cada campo debe ser obtenido dos veces en pantalla.
//- Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.

public class Ejercicio04_PideFechaUsuario {

	public static void main(String[] args) throws ParseException {
		String fechaUser = Utils.pideStringJOptionPane("Introduce una fecha(mm/dd/yy): ");
		Date fecha = new Date(fechaUser);
		Calendar calendario = creaCalendario(fecha);
		
		System.out.println("Fecha indroducida: ");
		System.out.println(fechaUser);
		
		System.out.println("Fecha convertida: ");
		System.out.println(fecha);
		
		System.out.println("Fecha con formato: ");
		stringHaFecha(fecha);
		
		System.out.println("Operaciones con fechas: ");
		sumaFecha(calendario);
				
	}
	
	private static void stringHaFecha (Date fecha) {
		
		System.out.println(fecha);

		SimpleDateFormat sdf = new SimpleDateFormat ("EEE, MMM d, yy ");
		System.out.println("Fecha actual: " + sdf.format(fecha));
			
	}
	
	public static Calendar creaCalendario (Date fecha) {
		Calendar fechaCalendar = new GregorianCalendar(fecha.getYear(), fecha.getMonth(), fecha.getDay(), fecha.getHours(), fecha.getMinutes(), fecha.getSeconds());
		System.out.println("Millis: " + fechaCalendar.getTimeInMillis());
		// Es f�cil y muy habitual convertir un Calendar en Date
		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		System.out.println("Fecha a partir de Calendar : " + fechaAPartirDeCalendar);
		
		return fechaCalendar;
	}
	
	public static void sumaFecha(Calendar fecha) {
		fecha.add(Calendar.DAY_OF_MONTH, +3);
		System.out.println("Fecha mas 3 días : " + fecha.getTime());
		
		fecha.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println("Fecha menos 2 días : " + fecha.getTime());
		
		fecha.add(Calendar.WEEK_OF_MONTH, -2);
		System.out.println("Fecha menos 2 semanas : " + fecha.getTime());
		
		fecha.add(Calendar.DAY_OF_MONTH, +300);
		System.out.println("Fecha mas 300 días : " + fecha.getTime());
		
		fecha.add(Calendar.YEAR, +4);
		System.out.println("Fecha más 4 años : " + fecha.getTime());
	}
}
