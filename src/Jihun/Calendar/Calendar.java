package Jihun.Calendar;

import java.util.Scanner;

public class Calendar {

	private static int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLipYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysOfMonth(int year, int month, int weekday) {
		if (isLipYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("      <<%4d%3d>> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		int count = 7 - weekday;
		int delim = count;
		if (count < 7) {
			delim = count;
		}
		else {
			delim = 0;
		}
		for (int i = 1; i <= weekday; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		for (int i = count + 1; i <= getMaxDaysOfMonth(year, month, weekday); i++) {
			System.out.printf("%3d", i);
			
			if (i % 7 == delim) {
				System.out.println();
			}
			if (i == getMaxDaysOfMonth(year, month, weekday)) {
				System.out.println();
				System.out.println();
			}
		}
	}
}