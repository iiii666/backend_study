package nested;



class MyException implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("MyException.close 실행!!!!!");
	}
	
}
public class ExceptionTest2 {
	public static void main(String[] args) {
		try(MyException me = new MyException()){
			System.out.println(1/0);
			System.out.println("try  블럭 수행");
			
		}catch(Exception e){
			System.out.println("예외발생");
		}
		System.out.println("종료");
	}
}
