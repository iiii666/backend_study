package exception2;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("706 사이트 입니다!!~!~!~!~!");
		System.out.println("[로그인]");

		MemberDTO member = new MemberDTO();
		System.out.println("아이디 :  ");
		member.setUserid(sc.nextLine());
		System.out.println("비밀번호 :  ");
		member.setUserpw(sc.nextLine());
		
		try {
			if(member.getUserid().equals("next") &&
			   member.getUserpw().equals("d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db")) {
				System.out.println(member.getUserid() + "님이 로그인 되었습니다");
			}else {

				throw new LoginFailureException("아이디 혹은 비밀번호가 틀립니다.",member);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
		
	}
}
