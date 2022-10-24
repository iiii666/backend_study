package exception2;

import java.io.FileWriter;
import java.io.IOException;

public class LoginFailureException extends RuntimeException {//로그인 실패시 처리를 위한 클래스
	
	public LoginFailureException() {
	}
	
	public LoginFailureException(String message, MemberDTO member) {
		super(message);
		try {
			fileOutput(member);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void fileOutput(MemberDTO member) throws IOException{
		FileWriter f = new FileWriter("login_fail.txt", true);
		
		f.write(member.toString() + "\r\n");
		f.close();
		
	}
}


