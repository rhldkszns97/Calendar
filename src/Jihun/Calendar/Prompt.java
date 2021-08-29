package Jihun.Calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요");
		System.out.print(PROMPT);
		int repeat = scanner.nextInt();
		int month[] = new int[repeat];
		System.out.println("월을 입력하세요");
		for (int i = 0; i < month.length; i++) {
			System.out.print(PROMPT);
			month[i] = scanner.nextInt();
		}
		for (int i = 0; i < month.length; i++) {
			if (month[i] < 1 || month[i] > 12) {
				System.out.println("1과 12사이의 수를 입력하세요");
				continue;
			}
			System.out.printf("%d월달은 %d일까지 있습니다.\n", month[i], cal.getMaxDaysOfMonth(month[i]));
		}
		cal.printSampleCalendar();
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
