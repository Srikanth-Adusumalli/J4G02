package assignment2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter date of birth in YYYY-MM-DD format:");
		Scanner scanner= new Scanner(System.in);
		String input=scanner.nextLine();
		scanner.close();
		
		LocalDate dob = LocalDate.parse(input);
		
		System.out.println("You are" + " " + calculateAge(dob)+ " " +" years old");

	}
	
	public static int calculateAge(LocalDate dob) {
		LocalDate curDate=LocalDate.now();
		if((dob!=null)&&(curDate!=null)) {
			return Period.between(dob, curDate).getYears();
		}
		return 0;
	}
}
