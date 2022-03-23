import java.time.Month;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Employee {
	public static void main(String args[]) {
		LocalDate EmployeeBirthday = LocalDate.of(1990,Month.APRIL,6);
		System.out.println(EmployeeBirthday);
		
		
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		
		
		
		System.out.println(Period.between(EmployeeBirthday, nowDate));
		System.out.println("Employeeage"+ChronoUnit.YEARS.between(EmployeeBirthday, nowDate));
		
		
		
	}

	
	

}