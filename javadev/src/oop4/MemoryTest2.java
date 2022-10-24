package oop4;

class Exam {
	int c, d;

	public int add(int a, int b) {
		c = a + b;
		return c;
	}

	public int multi(int a, int b) {
		d = a * b;
		return d;
	}
}

public class MemoryTest2 {
	public static void main(String args[]) {
		int sum, multi;
		int x, y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]); // 1번
		Exam ob1 = new Exam();
		Exam ob2 = new Exam(); // 2번
		
		System.out.println(ob1);
		System.out.println(ob1.hashCode());
		System.out.println(ob2);
		System.out.println(ob2.hashCode());
		sum = ob1.add(x, y);
		multi = ob2.multi(x, y);
		System.out.println("입력한 값의 합은" + sum + "입니다");
		System.out.println("입력한 값의 곱은" + multi + "입니다");
	}
}
