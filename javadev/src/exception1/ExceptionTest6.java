package exception1;

import javax.management.RuntimeErrorException;

public class ExceptionTest6 {
	public static void main(String[] args) {
		try {
			method();
		} catch (RuntimeErrorException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("종료");

		}
	}

	private static void method() throws RuntimeErrorException{
		throw new RuntimeErrorException( null, "강제 예외 발생!");
	}
}
