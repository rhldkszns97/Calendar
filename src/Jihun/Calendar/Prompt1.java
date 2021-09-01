package Jihun.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Prompt1 {

	static Scanner s = new Scanner(System.in);
	
	static HashMap<String, ArrayList<String>> map = new HashMap<>();
	
	
	static ArrayList<String> mapList = new ArrayList<>();
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

	public String date1;

	public static HashMap<String, ArrayList<String>> cmdRegister() throws ParseException {
		System.out.println("날짜를 입력하세요.");
		String str_date1 = s.next();
		String date1 = sdf.format(sdf.parse(str_date1));
		System.out.println("일정을 입력하세요.");
		s.nextLine();
		String schedule = s.nextLine();
		if (map.containsKey(date1) == false) {
			ArrayList<String> emptyList = new ArrayList<>();
			map.put(date1, emptyList);
		}
		mapList = map.get(date1);
		mapList.add(schedule);
		map.put(date1, mapList);
		System.out.println("일정이 등록되었습니다.");
		return map;
	}
	

	public void cmdSearch() throws ParseException {
		System.out.println("날짜를 입력하세요.");
		String str_date2 = s.next();
		String date2 = sdf.format(sdf.parse(str_date2));
		mapList = map.get(date2);
		int a = mapList.size();
		System.out.println(a + "개의 일정이 있습니다");
		for (int i = 0; i < a; i++) {
			System.out.println((i + 1) + ". " + mapList.get(i));
		}
	}

	public void printMenu() {
		System.out.println("+-------------------+");
		System.out.println("1.일정 등록");
		System.out.println("2.일정 검색");
		System.out.println("3.달력 보기");
		System.out.print("h.도움말 ");
		System.out.println("q.종료");
		System.out.println("+-------------------+");
	}

	public void cmdCalendar() throws ParseException {
		System.out.println("연도를 입력하세요");
		System.out.print("YEAR> ");
		int year = s.nextInt();
		if (year == -1) {
			System.out.println("Bye");
		}
		System.out.println("월을 입력하세요");
		System.out.print("MONTH> ");
		int month = s.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("1과 12사이의 수를 입력하세요. Bye~");
		}
		Calendar1 cal = new Calendar1();
		cal.printCalendar(year, month);

	}

	public void cmd() throws ParseException {
		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print("> ");
			String list = s.next();
			switch (list) {
			case "1": {
				cmdRegister();
				continue;
			}
			case "2": {
				cmdSearch();
				continue;
			}
			case "3": {
				cmdCalendar();
				continue;
			}
			case "h": {
				printMenu();
				continue;
			}
			case "q": {
				System.out.println("goodBye~");
				return;
			}
			}
		}
	}

	public void runPrompt() throws ParseException {
		// 숫자를 입력받아 입력받은 달의 최대 일수를 구하는 프로그램
		printMenu();
		cmd();
	}

//		while (true) {
//			
//		}

//				System.out.println("[일정 등록] 날짜를 입력하세요.");
//				System.out.print("> ");
//				num1 = s.next();
//				String[] num1_splited = num1.split("-");
//				int num1_year = Integer.parseInt(num1_splited[0]);
//				int num1_month = Integer.parseInt(num1_splited[1]);
//				int num1_date = Integer.parseInt(num1_splited[2]);
//				System.out.printf("당신이 입력한 숫자는 %d %d %d이다 \n", num1_year, num1_month, num1_date);
//				System.out.println("일정을 입력하세요");
//				System.out.print("> ");
//				s.nextLine();
//				schedule = s.nextLine();
//				map.put(num1, new ArrayList<String>());
//				map.get(num1).add(schedule);
//				System.out.println("일정이 등록되었습니다");
//				System.out.println(map.get(num1));
//			}
//			if (list.equals("2")) {
//				System.out.println("[일정 검색] 날짜를 입력하세요.");
//				System.out.print("> ");
//				String num2 = s.next();
////				System.out.println(map.get.size()+"개의 일정이 있습니다.");
//				ArrayList<String> sList = map.get(num2);
////				for(int i=0; i < schedulList.size(); i++) {
////				}
//			}
//		}

//			System.out.println("연도를 입력하세요");
//			System.out.print("YEAR> ");
//			int year = s.nextInt();
//			if (year == -1) {
//				System.out.println("Bye");
//				break;
//			}
//			System.out.println("월을 입력하세요");
//			System.out.print("MONTH> ");
//			int month = s.nextInt();
//			if (month < 1 || month > 12) {
//				System.out.println("1과 12사이의 수를 입력하세요. Bye~");
//				break;
//			}
//			Calendar1 cal = new Calendar1();
//			cal.printCalendar(year, month);
//		}
//		s.close();

	public static void main(String[] args) throws ParseException {
		// 셀 실행
		Prompt1 p = new Prompt1();
		p.runPrompt();
	}
}
