package Jihun.Calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("월을 입력하세요");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("1과 12사이의 수를 입력하세요. Bye~");
				break;
			}
			cal.printCalendar(2021, month);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
