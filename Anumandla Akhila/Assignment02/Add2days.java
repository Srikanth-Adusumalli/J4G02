

		import java.time.DayOfWeek;
		import java.time.LocalDate;
		public class Add2days {
			public static void main(String[] args) {
				LocalDate date1 = LocalDate.now();
				LocalDate date2 = date1.plusDays(2);

				System.out.println(date1);
				System.out.println(date2);

				if (date2.getDayOfWeek().equals(DayOfWeek.THURSDAY))
				{
				System.out.println("It's is a THURSDAY");
				}
				else {
					System.out.println("It's is not a THURSDAY");
				}
			}

		

	}


