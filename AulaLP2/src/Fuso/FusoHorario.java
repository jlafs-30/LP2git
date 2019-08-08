package Fuso;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.print.attribute.DateTimeSyntax;

public class FusoHorario {
	
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		TimeZone tz = calendario.getTimeZone();
	//	System.out.println(tz);
		
		String[] fusos = TimeZone.getAvailableIDs();
		for (String fuso: fusos) {
	//		System.out.println(fuso);
		} 
		
		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.print(tzSP.getDisplayName());
		System.out.print(" - ");
		System.out.println(tzSP.getID());
		
					
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		System.out.println(" ");
		
		TimeZone tzParis = TimeZone.getTimeZone("Europe/Paris");
		System.out.print(tzParis.getDisplayName());
		System.out.print(" - ");
		System.out.println(tzParis.getID());
		
		Calendar Paris = Calendar.getInstance(tzParis);	
		Paris.add(Calendar.HOUR_OF_DAY, tzParis.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
		System.out.println(sdf.format(Paris.getTime()));
		System.out.println(" ");
		System.out.print("Diferença dos horarios de ");
		System.out.print(tzParis.getOffset((System.currentTimeMillis())) / 1000 / 60/ 60);
		System.out.print(" horas ");
		System.out.print(tzParis.getOffset((System.currentTimeMillis())) / 1000 / 60);
		System.out.print(" minutos ");
		System.out.print(tzParis.getOffset((System.currentTimeMillis())) / 1000 );
		System.out.print(" segundos ");
		System.out.print(tzParis.getOffset((System.currentTimeMillis())));
		System.out.print(" milisegundos");
		
		
	}
	
	
}
