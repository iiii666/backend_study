package oop12;

public class TvUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		tv.channelTable();//삼성티비면 인터페이스에 디폴트 메소드 실행, 엘지면 클래스에 구현한 메소드 실행
	}
}
