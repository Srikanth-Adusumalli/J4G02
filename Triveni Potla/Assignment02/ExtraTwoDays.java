package p2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExtraTwoDays {public static void main(String args[]){  
    
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
  Date date = new Date();
    
  Calendar cal = Calendar.getInstance();  
  
    
  System.out.println(sdf.format(cal.getTime())+" is the date before adding days");  
    
  cal.add(Calendar.DAY_OF_MONTH, -2);  
  String dateAfter = sdf.format(cal.getTime()); 
	    System.out.println("The date is a Weekend");
  System.out.println(dateAfter+" is the date after adding 2 days.");  
}  
}  
    
	


