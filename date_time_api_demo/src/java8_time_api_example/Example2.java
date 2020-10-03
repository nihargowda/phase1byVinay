package java8_time_api_example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Example2 {

	public static void main(String[] args) {
	LocalDate curr=LocalDate.now();
	LocalDate dob=LocalDate.parse("05/11/1988",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	long age=ChronoUnit.YEARS.between(dob, curr);
	dob=dob.plusYears(age);
	
	long days=ChronoUnit.DAYS.between(dob, curr);
	System.out.println(age+" years "+days+" days");
	
	}

}
