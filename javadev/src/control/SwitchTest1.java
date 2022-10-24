package control;

public class SwitchTest1 {
	public static void main(String[] args) {
		int n= 52;
		
		int score = n/10;
		switch (score) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
		
		default:
			System.out.println("F");
			break;
		}
		System.out.println("종료");
	}
}
