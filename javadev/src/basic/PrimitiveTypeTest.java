package basic;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);

		byte b2 = -128;
		System.out.println(b2);

		char c = '뷁';
		System.out.println(c);

		int i = 2147483647;
		System.out.println(i + 2);

		short s = 32767;
		System.out.println(s);

		long l1 = 2147483648L;
		System.out.println(l1);

		double d = 3.1415926535;
		System.out.println(d);

		float f = 3.1415926535f;
		System.out.println(f);
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.MAX_VALUE);
	}
}
