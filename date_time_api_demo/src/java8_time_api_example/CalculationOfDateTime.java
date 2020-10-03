package java8_time_api_example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculationOfDateTime {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now(); //dd MM yyyy
		System.out.println("ld = "+ld);
		LocalDate myDate=LocalDate.parse("29.04.2001", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("myDate = "+myDate);
		System.out.println(myDate.isLeapYear());
		
		myDate=myDate.plusDays(20);
		System.out.println("myDate = "+myDate);	

		
		//Time calculations go with LocalTime
		//Both date and time calculations  go with LocalDateTime
		
		System.out.println("dob = "+myDate);
		System.out.println("currDate = "+ld);	
		
		Period p=Period.between(myDate, ld);   //myDate is DOB and ld is current date
		System.out.println("Age = "+p.getYears());
		System.out.println("You are "+p.getYears()+" year/s, "+p.getMonths()+" months and "+p.getDays()+" days old or should i say young");
		
		System.out.println(ChronoUnit.MONTHS.between(myDate, ld));
		//System.out.println(ChronoUnit.);
		
		
	}

}
