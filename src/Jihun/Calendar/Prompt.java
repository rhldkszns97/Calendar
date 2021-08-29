package Jihun.Calendar;

import java.util.Scanner;

public class Prompt {
	public int parseDay(String a) {
		if(a.equals("su")) return 0;
		else if(a.equals("mo")) return 1;
		else if(a.equals("tu")) return 2;
		else if(a.equals("we")) return 3;
		else if(a.equals("th")) return 4;
		else if(a.equals("fr")) return 5;
		else if(a.equals("sa")) return 6;
		else return 0;
	}
	

	public void runPrompt() {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("연도를 입력하세요");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
			System.out.println("첫번째 요일을 입력하세요");
			System.out.print("WEEKDAY> ");
			String str_weekday = scanner.next();
			int weekday = parseDay(str_weekday);
			
			if (month < 1 || month > 12) {
				System.out.println("1과 12사이의 수를 입력하세요. Bye~");
				break;
			}
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
