package javatraining.oops;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateClassConcept {

	public static void main(String[] args) {

		//To get the current date/time/seconds etc - Date class instance we are using here to get the date and time
		Date d = new Date(); //d : it will be in object format 
		
		System.out.println(d.toString());//Standard format 
		System.out.println(d.getTime());
		
		//Customized format 
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf1.format(d));
		
		//Month - M
		//Day - d
		//Year - y
		
		//Modern Java 8+ - java.time package (classes provided : LocalDate, LocalTime, LocalDateTime)
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println();
		
		//Replacement for SimpleDateFormat 
		LocalDate td = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(td.format(f));
		
	}

}
