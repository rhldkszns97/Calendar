package Jihun.Calendar;

public class Calendar1 {

	private static int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else {
			return MAX_DAYS[month];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("      <<%4d%3d>> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		int weekday = getWeekDay(year, month, 1);
		int count = 7 - weekday;
		int delim;
		if (count < 7) {
			delim = count;
		} else {
			delim = 0;
		}
		for (int i = 1; i <= weekday; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		for (int i = count + 1; i <= getMaxDaysOfMonth(year, month); i++) {
			System.out.printf("%3d", i);

			if (i % 7 == delim) {
				System.out.println();
			}
			if (i == getMaxDaysOfMonth(year, month)) {
				System.out.println();
				System.out.println();
			}
		}
	}

	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		int standardWeekday = 4;
		int count = 0;

		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}

		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count += delta;
		}

		count += day - 1;

		int weekday = (standardWeekday + count) % 7;
		return weekday;

	}

	public static void main(String[] args) {
		Calendar1 cal = new Calendar1();
		cal.getWeekDay(1971, 1, 2);
//		cal.getWeekDay(1972, 1, 2);
//		cal.getWeekDay(1973, 3, 2);
//		cal.getWeekDay(1974, 5, 1);
//		cal.getWeekDay(1975, 5, 1);
	}
}