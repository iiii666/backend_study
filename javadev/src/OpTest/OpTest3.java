package OpTest;

public class OpTest3 {
	public static void main(String[] args) {
		boolean t1, t2;
		t1 = true; t2 = true;
		System.out.println(t1 && t2);
		System.out.println(t1 || t2);
		System.out.println(!t1);
		System.out.println("-------");
		t1 = true; t2 = false;
		System.out.println(t1 && t2);
		System.out.println(t1 || t2);
		System.out.println(!t1);
		System.out.println("-------");
		t1 = false; t2 = false;
		System.out.println(t1 && t2);
		System.out.println(t1 || t2);
		System.out.println(!t1);
		System.out.println("-------");
		
		byte a = 10; 
		byte b = 5;
		System.out.println(a ^ b);
		
		
		int c = 100;
		int d = 200;
		
		c = c ^ d;
		d = d ^ c;
		c = c ^ d;
		
		
		
	}
}
