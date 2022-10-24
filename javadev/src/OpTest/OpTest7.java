package OpTest;

import java.util.Scanner;

public class OpTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int n = sc.nextInt();

		int temp = n % 2;

		if (temp == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		sc.close();
	}
}
