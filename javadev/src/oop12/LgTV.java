package oop12;

public class LgTV implements TV{//tv super type
	
	
	private Speaker speaker = new OrangeSpeaker();
	public void powerOn() {
		System.out.println("LgTV : TV를 켭니다");
	}
	public void powerOff() {
		System.out.println("LgTV : TV를 끕니다");
	}
	public void channelUp() {
		System.out.println("LgTV : 채널을 올립니다");
	}
	public void channelDown() {
		System.out.println("LgTV : 채널을 내립니다");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("LgTV : 소리를 키웁니다");
		}else
			speaker.soundUp();
		
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("LgTV : 소리를 줄입니다");
		}else
			speaker.soundDown();
	}
	
	public void channelTable() {
		System.out.println("채널 테이블을 출력");
	}
}
//
