package Jihun.Calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	

	public void printSampleCalendar() {
		System.out.println(" 일 월  화 수  목  금 토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		Calendar cal = new Calendar();
		String Prompt = "Cal> ";
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요");
		System.out.print(Prompt);
		int repeat = scanner.nextInt();
		int month[] = new int[repeat];
		System.out.println("월을 입력하세요");
		for(int i=0; i<month.length; i++) {
			System.out.print(Prompt);
			month[i] = scanner.nextInt();
		}
		for(int i=0; i<month.length; i++) {
			if(month[i] < 1 || month[i] > 12) {
				System.out.println("1과 12사이의 수를 입력하세요");
				continue;
			}
			System.out.printf("%d월달은 %d일까지 있습니다.\n",month[i], cal.getMaxDaysOfMonth(month[i]));
		}
		cal.printSampleCalendar();
		scanner.close();
	}
}
