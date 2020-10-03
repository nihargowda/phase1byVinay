package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateDate {

	public static void main(String[] args) {
	
		String s="12/13/2000"; //dd/MM/yyyy
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			Date d=sdf.parse(s);
			System.out.println("date received is "+d);
		} catch (ParseException e) {
			System.out.println(e);
		}

	}

}
