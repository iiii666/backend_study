package OpTest;

import java.util.Scanner;

public class OpTest8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("가위는 1 바위는 2 보는 3 을 입력하세요 >");

		int you = sc.nextInt();

		int num = (int) (Math.random() * 3) + 1;

		if (num == 1) {
			System.out.println("컴퓨터는 가위");
			if (you == 1) {
				System.out.println("you : 가위");
				System.out.println("비겼습니다");
			} else if (you == 2) {
				System.out.println("you : 바위");
				System.out.println("당신의 승리입니다!");
			} else if (you == 3) {
				System.out.println("you : 보");
				System.out.println("당신의 패배입니다!");
			}
		} else if (num == 2) {
			System.out.println("컴퓨터는 바위");
			if (you == 1) {
				System.out.println("you : 가위");
				System.out.println("당신의 패배입니다!");
			} else if (you == 2) {
				System.out.println("you : 바위");
				System.out.println("비김");
			} else if (you == 3) {
				System.out.println("you : 보");
				System.out.println("당신의 승리입니다!");
			}
		} else if (num == 3) {
			System.out.println("컴퓨터는 보");
			if (you == 1) {
				System.out.println("you : 가위");
				System.out.println("당신의 승리입니다!");
			} else if (you == 2) {
				System.out.println("you : 바위");
				System.out.println("당신의 패배입니다!");
			} else if (you == 3) {
				System.out.println("you : 보");
				System.out.println("비김");
			}
		}
	}
}
