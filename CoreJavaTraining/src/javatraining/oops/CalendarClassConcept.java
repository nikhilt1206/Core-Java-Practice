package javatraining.oops;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassConcept {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf .format(cal.getTime()));
		//Here we have used the calendar class instance to get the date and time.
		
		//Unique features provided by Calendar class (are not there in Date class)
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));//1 means PM and 0 means AM
		System.out.println(cal.get(Calendar.MINUTE));





	}

}
