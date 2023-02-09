package examenes.examen20230209;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;

import javax.swing.JOptionPane;

//Convierte una cadena de texto, con el valor “2023-02-09 10.30.27”, a un objeto java.util.Date.
//Obtén una nueva fecha restándole dos semanas y muéstrala en pantalla. En la siguiente página puedes
//observar los caracteres usados por SimpleDateFormat para el reconocimiento de formatos de fecha.
//Crea la misma fecha con un calendar, igual a la segunda que has obtenido en el párrafo anterior, a través
//del método set(….) de Calendar.
//Calcula la diferencia de horas entre las islas Galapagos (en el pacífico) y Lisboa (Lisbon)

public class Ejercicio05_Fechas {
	
	public static void main(String[] args) {
		String fechaCadena = "2023-02-09 10.30.27";
		java.util.Date fecha = transformaFecha(fechaCadena);
		Calendar calendario = creaCalendario(fecha);
		
		System.out.println("Fecha convertida: " + fecha);
		
		diferenciaHoraria();
		
	}
	
	public static java.util.Date transformaFecha(String fechaC) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd" + " " + "HH.mm.ss");
		
		do {
			try {
				return sdf.parse(fechaC);
			} catch (ParseException e) {
				System.out.println("Formato no correcto");
			}
		} while (true);
	}
	
	public static Calendar creaCalendario (java.util.Date fecha) {
		Calendar fechaCalendar = new GregorianCalendar(fecha.getYear(), fecha.getMonth(), fecha.getDay(), fecha.getHours(), fecha.getMinutes(), fecha.getSeconds());
		
		return fechaCalendar;
	}
	
	public static void diferenciaHoraria() {
		Calendar ahoraEnGalapagos = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Galapagos"));
		Calendar ahoraEnLisboa = Calendar.getInstance(TimeZone.getTimeZone("Europe/Lisbon"));
		
		int horaEnGalapagos = ahoraEnGalapagos.get(Calendar.HOUR_OF_DAY);
		int horaEnLisboa = ahoraEnLisboa.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Diferencia horaria entre la Isla de los Galapagos y Lisboa: " + Math.abs(horaEnGalapagos - horaEnLisboa));
		
	}
	
}
