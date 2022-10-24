package OpTest;

public class OpTest4 {
	public static void main(String[] args) {
		double d = 10; // 묵시적 형변환(정수->실수, 넓은 곳)

		System.out.println((int) d);

		int i = (int) 3.14; // 명시적 형변환(실수 ->정수,작은곳)

		System.out.println(i);

	}
}
