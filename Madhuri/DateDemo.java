package DateDemo;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
public class DateDemo {
	public static void main(String[] args) {
		LocalDateTime  todayDate=LocalDateTime.now();
		System.out.println("Today date="+todayDate);
		LocalDateTime aftertwodate=todayDate.now();
		LocalDateTime aftertwoDate=todayDate.plusDays(2);
		System.out.println("aftertwodate="+aftertwoDate);
		DayOfWeek date;
		DayOfWeek day=DayOfWeek.of(aftertwoDate.get(ChronoField.DAY_OF_WEEK));
		if(day==DayOfWeek.SUNDAY)
		{
			System.out.println("sunday");
		}
		else
		{
			System.out.println("no sunday");
			
		}
	}

}
