package com.learnjobs.assignment;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateCurrentAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now().plusDays(2);

		System.out.println("Adding two days to current date: " + date);
		if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			System.out.println("the day is sunday");
		} else {
			System.out.println("the day is not sunday");
		}

	}

}
