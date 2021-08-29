package Jihun.Calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	

	public void printCalendar(int year, int month) {
		System.out.printf("      <<%4d%3d>> \n", year, month);
		System.out.println(" 일  월  화 수  목  금 토");
		System.out.println("----------------------");
		for(int i=1; i<=getMaxDaysOfMonth(month); i++) {
			System.out.printf("%3d",i);
			if (i%7 == 0) {
				System.out.println();
			}
			if (i == getMaxDaysOfMonth(month)) {
				System.out.println();
				System.out.println();
			}
		}
	}
}