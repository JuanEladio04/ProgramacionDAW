package Capitulo07.Bloque02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//5º.- Obtén la hora actual en Roma (Italia), también la hora actual en Washintong (EEUU) y calcula la diferencia horaria entre las dos ciudades.

public class Ejercicio05_FechaEnDiferentesPartresDelMundo {

	public static void main(String[] args) {		
	    ZoneId romeTimeZone = ZoneId.of("Europe/Rome");
	    ZonedDateTime romeDateTime = ZonedDateTime.now(romeTimeZone);
	    System.out.println("La hora actual en Roma es " + romeDateTime);

	    ZoneId washingtonTimeZone = ZoneId.of("America/New_York");
	    ZonedDateTime washingtonDateTime = ZonedDateTime.now(washingtonTimeZone);
	    System.out.println("La hora actual en Washington es " + washingtonDateTime);

	    long hoursDiff = romeDateTime.getOffset().getTotalSeconds() / 3600 - washingtonDateTime.getOffset().getTotalSeconds() / 3600;
	    System.out.println("La diferencia horaria entre Roma y Washington es de " + hoursDiff + " horas");	
		
	}

}
