package exception1;

public class ExceptionTest1 {
	public static void main(String[] args)  {//예외처리를 미루는 것
		
		try {
			Class clazz = Class.forName("java.lang.Object"); //jvm 이 에러를 던짐
			

		} catch (ClassNotFoundException e) {
			System.out.println("classnotfound 에러 발생");
		}finally {
			System.out.println("예외 상관없이 실행");
		}
	}
}
