package exception1;


class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

class MyRTException extends RuntimeException{
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
}
class A1{
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외메세지 : myexception");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : myrtexception");
	
	void abc_1(int num) {
		try {
			if(num>70) {
				System.out.println("정상작동");
			}else {
				throw me1;
			}
		} catch (MyException e) {
			System.out.println("예외처리 1");

		
		}
	}
	
	void bcd_1() {
		abc_1(65);
	}
	
	
	void abc_2(int num) throws MyException{

			if(num>70) {
				System.out.println("정상작동");
			}else {
				throw me1;
			}
	}
	
	
	void bcd_2() {
		
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외처리2");

		}
		
	}
	
}

public class Createuserexcepton {
	
	 public static void main(String[] args) {
		A1 a = new A1();
		
		a.bcd_1();
		a.bcd_2();
		}
}
