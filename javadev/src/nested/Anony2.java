package nested;

public class Anony2 {
	public static void main(String[] args) {
		C c  = new C();
		AA a = new AA() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		
		c.cde(a);
		c.cde(new AA() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		});
		
	}
}


interface AA{
	public void abc();
}


class C{
	void cde(AA a) {
		a.abc();
	}
}