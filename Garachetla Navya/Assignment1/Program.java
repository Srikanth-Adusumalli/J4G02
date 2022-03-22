
import java.time.DayOfWeek;


public class Program {

	public static void main(String[] args) {
	  LocalDate date1 = LocalDate.now();
	  LocalDate date2 = date1.plusDays(2);
	  System.out.println("date1");
	  System.out.println("date2");
	  if (date2.getDayOfWeek().equals(DayOfWeek.SUNDAY))
	  {
		  System.out.println("It's is not sunday");
	  }
	  else {
		  System.out.println("It's not sunday");
	  }
		  
	  

	}

}
