import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class FindingAgeOfEmployee {
	private static final Month APRIL = null;

	public static void main (String[] args) 
	 {
		 LocalDate today = LocalDate.now();
			LocalDate empDob = LocalDate.of(1990, APRIL, 6); 
		 
		 int age = Period.between(empDob, today).getYears();
		 System.out.println("Age of employee is :"+age);
	 }
	}


