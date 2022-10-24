package control;

import java.util.Scanner;

public class DoWhileTest1 {

	public static void main(String[] args) {
		
		
		int h1, h2, h3;
		int c1, c2, c3;
		
		int s, b;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		c1 = (int)(Math.random()*10);
		
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c3 ==c1 || c3 ==c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		do {
			s = b = 0;
			System.out.print("0~9 사이에 중복 되지 않은 3개 입력 ex. 1 2 3 >");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1 == c1) {
				s ++;
			}else if(h1 == c2 || h1 == c3) {
				b++;
			}
			if(h2 == c2) {
				s ++;
			}else if(h2 == c1 || h2 == c3) {
				b++;
			}
			if(h3 == c3) {
				s ++;
			}else if(h3 == c1 || h3 == c2) {
				b++;
			}
			System.out.println("[" + s + "s" + b + "b]");
			count ++;
		}while(s < 3);
		System.out.println(count + "번만에 맞춤");
		
	}
}
