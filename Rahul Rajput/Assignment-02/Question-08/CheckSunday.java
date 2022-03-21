package com.Assignment2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CheckSunday {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate date1 = date.plusDays(2);
		System.out.println("Current Date - " + date);
		System.out.println("after 2 days - " + date1);
		if (date1.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println("2 days later it's sunday");
		} else {
			System.out.println("2 days later is not sunday");
		}

	}

}
