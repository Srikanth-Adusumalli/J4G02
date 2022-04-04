package p2;

import java.util.Calendar;
import java.util.Date;

public class DateBirthday {
	
	String name;
	int idNumber;
	String gender;
	Date birthday= new Date();

	public DateBirthday(String name, int idNumber, String gender, int year, int month, int day) {
		

	    this.name  = name;
	    this.idNumber = idNumber;
	    this.gender = gender;
	}
	private void initBirthday(int year, int month, int day) {
	    if (year > 0 && month > 0 && day > 0) {
	        Calendar cal = Calendar.getInstance();
	        cal.set(year, month-1 , day, 0, 0, 0);
	            birthday = cal.getTime(); // this returns a Date
	            System.out.println(birthday);
	    } else {
	    }
	}
	public static void main(String args[]) {
		System.out.println("main Method");
		DateBirthday birthday = new DateBirthday("triveni",53,"Female",02,06,20);
		birthday.initBirthday(02,06,20);
		
	}
}
