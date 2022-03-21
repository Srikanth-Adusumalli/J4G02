//Q-6: Employee Birthday
package Assignment3;

import java.time.LocalDate;
import java.time.Month;

public class empbdy {
	public static void main(String args[]) {

		int birthDate = 6;
		Month birthMonth = Month.APRIL;

		LocalDate currentDate = LocalDate.now();
		System.out.println("Todays Date: " + currentDate);

		int date = currentDate.getDayOfMonth();
		Month month = currentDate.getMonth();

		if (date == birthDate && month == birthMonth) {
			System.out.println("HAPPY BIRTHDAY TO YOU !!");
		} else {
			System.out.println("6th APRIL 1990 is the Employee Birthday.");
			System.out.println("TODAY is Not an Employee Birthday.");
		}
	}
}
