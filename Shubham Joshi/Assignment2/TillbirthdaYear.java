package module2;

import java.time.*;
import java.util.*;  
public class TillbirthdaYear  
{     
public static void main(String args[])  
{  
  
LocalDate dob = LocalDate.of(1990, 4, 12);  

LocalDate curDate = LocalDate.now();  

Period period = Period.between(dob, curDate);  
  
System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
}  
}  