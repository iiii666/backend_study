package method;

public class MethodTest2 {

	public static void main(String[] args) {
		print(1);
		print(2, 3,2143,214,21,421,4,124,21,4,23);
	}

	private static void print(int... i) {

		for(int j = 0; j< i.length; j++) {
			System.out.println(i[j] + "\t");
		}
	}
}
