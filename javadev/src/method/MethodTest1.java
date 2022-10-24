package method;

public class MethodTest1 {
	public static void main(String[] args) {

		hello("ㅎㅇㅎㅇ");//오버로딩 <<넘겨지는 파라매타 타입에 따라서 메소드를 달리 실행하는 것>>
		System.out.println(add(2, 5));
		System.out.println(dice());
		dice2();
		System.out.println("종료");
	}

	public static void dice2() {//java 에서만 사용해서 이식성이 떨어짐
		System.out.println((int) (Math.random() * 6) + 1);
		
	}

	private static int dice() {//이러면 어디서든 return 값받아서 원하는 출력 메소드 사용하면댐
		return (int) (Math.random() * 6) + 1;
	}

	private static int add(int i, int j) {
		return i + j;
	}

	private static void hello(String string) {
		System.out.println("안녕안녕" + string);
	}
}
