package nested;

public class A {

	public static void main(String[] args) {
		asdf a = new asdf();
		asdf.f b = a.new f();
		b.bcd();
	}
}


class asdf{
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}
	class f{
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}
}