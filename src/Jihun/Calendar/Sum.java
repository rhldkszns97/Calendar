package Jihun.Calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력해 주세요");
		Scanner scanner = new Scanner(System.in);
		int a,b;
		String s1,s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d+%d의 합은 %d입니다", a,b,a+b);
		scanner.close();
	}
}
