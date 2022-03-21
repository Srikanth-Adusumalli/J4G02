//Q-8: Add 2days in Current date.
package Assignment3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class currentdate {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	public static void main(String[] args) {

		Date currentDate = new Date();
		System.out.println("CurrentDate:");
		System.out.println(dateFormat.format(currentDate));

		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);

		c.add(Calendar.YEAR, 0);
		c.add(Calendar.MONTH, 0);
		c.add(Calendar.DATE, 2);
		Date currentDatePlusOne = c.getTime();

		System.out.println("CurrentDate-PlusOne:");
		System.out.println(dateFormat.format(currentDatePlusOne));

	}
}