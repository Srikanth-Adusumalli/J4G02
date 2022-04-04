package p2;

import java.time.LocalDate;
import java.time.Period;

public class FindOutAge {
	public static void main(String args[])  
	{  
	LocalDate dob = LocalDate.of(1988, 12, 13);  
	LocalDate curDate = LocalDate.now();  
	Period period = Period.between(dob, curDate);  
	System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
	}  
	}  


