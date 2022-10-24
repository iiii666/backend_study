package exception1;

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			throw new Exception("예외메세지");
		} catch (Exception e) {
			
			
			System.out.println(e.getMessage());
		}
	}
	
	
}
