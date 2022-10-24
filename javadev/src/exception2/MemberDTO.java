package exception2;

import java.io.Serializable;

import org.apache.commons.codec.digest.DigestUtils;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MemberDTO implements Serializable{

	private String userid;
	private String userpw;
	
	public void setUserpw(String userpw) {
		this.userpw =  DigestUtils.sha512Hex(userpw) ;
	}

	@Override
	public String toString() {
		return "잘못된 로그인 시도 MemberDTO [userid=" + userid +  "]";
	}
	
	
}
