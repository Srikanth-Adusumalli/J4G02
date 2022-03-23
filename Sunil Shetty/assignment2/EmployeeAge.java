package com.learnjobs.assignment;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class EmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(1990, Month.APRIL, 06);
		LocalDate now = LocalDate.now(); 
		Period diff = Period.between(date, now); 
		System.out.println(diff.getYears() + "years " + diff.getMonths() + "months " + diff.getDays() + " days");
	}

}
