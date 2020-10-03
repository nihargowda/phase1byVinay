package examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateDemo {

	public static void main(String[] args) {
	
		Date d=new Date();
		System.out.println(d);
		
		/*
		 * dd - date - d - 3    dd-03
		 * MM - month - M - 2 10  - MM - 02 10  MMM - Oct  MMMM -  October
		 * yyyy - year   yy - last 2 digits of year   yyyy - full year
		 * hh - 12 hour
		 * HH - 24 hour
		 * mm - minutes
		 * ss - secs
		 * EEE - day name in short - for eg for Saturday it would print Sat - EEEE - Saturday
		 * a - am/pm
		 * z/Z - time zone and GMT
		 *    
		 */
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy  hh:mm:ss a  Z z   EEE EEEE");
		System.out.println(sdf.format(d));
	}

}
