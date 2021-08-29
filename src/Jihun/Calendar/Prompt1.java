package Jihun.Calendar;


import java.util.Scanner;

public class Prompt1 {
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
			if (month < 1 || month > 12) {
				System.out.println("1과 12사이의 수를 입력하세요. Bye~");
				break;
			}
			Calendar1 cal = new Calendar1();
			cal.printCalendar(year, month);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
