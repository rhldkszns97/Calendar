package Jihun.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Prompt {
	public void runPrompt() {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("연도를 입력하세요");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			if (year == -1) {
				System.out.println("Bye");
				break;
			}
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
			int date = 1;
			if (month < 1 || month > 12) {
				System.out.println("1과 12사이의 수를 입력하세요. Bye~");
				break;
			}
			Calendar data1 = Calendar.getInstance();
			data1.set(year, month - 1, date);
			int weekday = data1.get(Calendar.DAY_OF_WEEK) - 1;
			Jihun.Calendar.Calendar cal = new Jihun.Calendar.Calendar();
			cal.printCalendar(year, month, weekday);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
