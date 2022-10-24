package control;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();// new instance메소드에 숨겨져있음

		Scanner sc = new Scanner(System.in);

		System.out.println("년 > ");
		int year = sc.nextInt();
		System.out.println("월 > ");
		int month = sc.nextInt();
		
		c.set(year, month - 1, 1);

		int week = c.get(Calendar.DAY_OF_WEEK);
		int endDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("일 월 화 수 목 금 토");

		for (int d = 1; d < week; d++) {
			System.out.print("   ");
		}
		for (int d = 1, w = week; d <= endDay; d++, week++) {
			if (d < 10) {
				System.out.print(" " + d + " ");
			} else {
				System.out.print(d + " ");
			}
			if (week % 7 == 0) {
				System.out.println();
			}

		}
	}
}
