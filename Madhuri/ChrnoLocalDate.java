package employeeage;
import java.time.LocalDate;
import java.time.Period;
import java.time.Period.*;
import java.time.temporal.ChronoUnit;
public class ChrnoLocalDate {
	public static void main(String args[]) {
		LocalDate birthDate=LocalDate.of(1990,4,6 );
		LocalDate  l=LocalDate.now();
		long years=ChronoUnit.YEARS.between(birthDate,l);
		Period P=Period.between(birthDate, l);
		System.out.println( " years: "+P.getYears()+ " Months: "+P.getMonths()+ " Days: "+P.getDays());
	}
}