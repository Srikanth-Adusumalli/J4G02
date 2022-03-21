package com.Assignment2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class EmpAge {
	public static void main(String[] args) {

		LocalDate age = LocalDate.of(1990, Month.APRIL, 06);
		System.out.println("You are " + calculateAge(age) + " years old.");
	}

	public static int calculateAge(LocalDate age) {
		LocalDate todayDate = LocalDate.now();

		if ((age != null) && (todayDate != null)) {
			return Period.between(age, todayDate).getYears();
		} else {
			return 0;
		}
	}

}
