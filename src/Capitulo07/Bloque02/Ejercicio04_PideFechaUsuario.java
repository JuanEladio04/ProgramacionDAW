package Capitulo07.Bloque02;

import java.text.SimpleDateFormat;
import java.util.Date;

import utils.Utils;

//4º.- Crea un programa en Java que pida al usuario la introducción de una fecha a través de JOptionPane. El usuario te especificará un dato de tipo String y tú debes convertirlo a un objeto de tipo java.util.Date utilizando SimpleDateFormat. A continuación realiza las siguientes acciones
//- Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la misma fecha que ha introducido el usuario.
//- Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y segundo. Cada campo debe aparecer en una línea de la consola. Debes obtener cada campo desde el objeto java.util.Date y desde el objeto Calendar. Es decir, cada campo debe ser obtenido dos veces en pantalla.
//- Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.

public class Ejercicio04_PideFechaUsuario {

	public static void main(String[] args) {
		String fechaUser = Utils.pideStringJOptionPane("Introduce una fecha(mm/dd/yy): ");
		Date fecha = new Date(fechaUser);
		
		System.out.println(fechaUser);
		System.out.println(fecha);
		
		
	}
	
	public static Date stringToDate(String fechaUser) {
		
		
	    return fecha;
	}

}
