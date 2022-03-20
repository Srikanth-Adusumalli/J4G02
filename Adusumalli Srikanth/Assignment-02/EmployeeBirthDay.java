 package com.assignment2;

import java.time.LocalDate;
import java.time.Month;

public class EmployeeBirthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birthDate = 6;
		Month birthMonth = Month.APRIL;
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Today Date:"+ currentDate);
		
		int date = currentDate.getDayOfMonth();
		Month month = currentDate.getMonth();
		
	    if(date == birthDate && month == birthMonth) {
	    	System.out.println("HAPPY BIRTHDAY TO YOU ");
	    } else {
	    	System.out.println("6th APRIL 1990 is the Employee Birthday");
	    	System.out.println("Today is not an Employee Birthday");
	    }

	}

}
