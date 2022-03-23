import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class AddToCurrentDate {
	
	public static void main(String args[]) {
		
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today date = "+ todayDate );
		
		
		
		LocalDate aftertwoDate = todayDate.plusDays(2);
		System.out.println("aftertwodate= "+ aftertwoDate);
		
		
		DayOfWeek day = DayOfWeek.of(aftertwoDate.get(ChronoField.DAY_OF_WEEK));
		if(day==DayOfWeek.SUNDAY) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("It is not a sunday");
		}
		
		
	}

}