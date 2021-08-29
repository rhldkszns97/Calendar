package Jihun.Calendar;

import java.util.Scanner;

public class Calendar2 {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar28() {
		System.out.println(" 일 월  화 수  목  금 토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public void printSampleCalendar30() {
		System.out.println(" 일 월  화 수  목  금 토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30");
	}

	public void printSampleCalendar31() {
		System.out.println(" 일 월  화 수  목  금 토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
	}

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		Calendar2 cal = new Calendar2();
		String Prompt = "Cal> ";
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("월을 입력하세요");
			System.out.print(Prompt);
			int month = scanner.nextInt();
			if (month == -1) {
				System.out.println("Bye~");
				break;
			} else if (cal.getMaxDaysOfMonth(month) == 28) {
				cal.printSampleCalendar28();
			} else if (cal.getMaxDaysOfMonth(month) == 30) {
				cal.printSampleCalendar30();
			} else {
				cal.printSampleCalendar31();
			}
		}
		scanner.close();
	}
}
