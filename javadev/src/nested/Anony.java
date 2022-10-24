package nested;

public class Anony {

	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.abc();
	}
}

class AAA{
	
	
	CC c = new CC() {
		public void bcd() {
			System.out.println("asdf");
		}
	};
	
	void abc() {
		c.bcd();
	}
	
}
interface CC{
	public abstract void bcd();
}