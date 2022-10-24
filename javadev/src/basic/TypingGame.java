package basic;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] keyword = { "oop", "primitive type", "for", "while", "Scanner", "class", "object", "instance",
				"information hiding", "polymorphysm", "abstract", "Arrays" };

		int[] item = new int[5];
		for (int i = 0; i < 5; i++) {
			item[i] = (int)(Math.random() * keyword.length);
		}
		System.out.println("Game Start!!~!~!~!~!");
		long startTime = System.currentTimeMillis();
		
		for(int i =0;i<item.length;i++) {
			System.out.print(keyword[item[i]] + "==> ");
			String input = sc.nextLine();
			if(!input.equals(keyword[item[i]])) {
				System.out.println("타이핑 잘못됐어요");
				i--;
			}
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println(time/1000 + "초");
		
	}
}
