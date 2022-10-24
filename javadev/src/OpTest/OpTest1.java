package OpTest;

import java.util.Scanner;

public class OpTest1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("a : ");
		int a = s.nextInt();
		System.out.print("b : ");
		int b = s.nextInt();

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		
		s.close();
	}
}
