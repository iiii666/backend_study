package oop12b;

public class SamsungTV implements TV{//tv super type
	
	
	private Speaker speaker = new HarmanSpeaker();//up casting
	public void powerOn() {
		System.out.println("Samsung TV : TV를 켭니다");
	}
	public void powerOff() {
		System.out.println("Samsung TV : TV를 끕니다");
	}
	public void channelUp() {
		System.out.println("Samsung TV : 채널을 올립니다");
	}
	public void channelDown() {
		System.out.println("Samsung TV : 채널을 내립니다");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("Samsung TV : 소리를 키웁니다");

		}else
			speaker.soundUp();
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("Samsung TV : 소리를 줄입니다");

		}else
			speaker.soundDown();
	}
}
//