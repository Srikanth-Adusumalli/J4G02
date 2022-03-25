package assignment2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime currentDate=LocalDateTime.now();
		System.out.println(currentDate);
		LocalDateTime date=currentDate.plusDays(2);
		System.out.println("After 2 days "+date);
		DayOfWeek day=DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
		if(day==DayOfWeek.SUNDAY)
		{
			System.out.println("sunday");
		}
		else
		{
			System.out.println("No Sunday");
		}

	}

}
