package exception2;

public class UserExcetionEx {

}


class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}
class OverException extends Exception{
	public OverException() {
		super();
		
	}
	public OverException(String message) {
		super(message);
	}
}

class A2{
	void checkScore(int score) throws MinusException, OverException{
		if(score < 0) {
			throw new MinusException("예외");
		}
		else if (score> 100) {
			throw new OverException(" 예외");
			
		}else {
			System.out.println("w정상값");
		}
	}
}