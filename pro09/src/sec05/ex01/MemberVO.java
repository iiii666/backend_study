package sec05.ex01;

import java.io.Serializable;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO implements Serializable{//객체직렬화
	private String id; 
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}
}
