package oop15;

public class BirdTest {
	public static void main(String[] args) {
		Eagle c = new Condor();//한단계위로 업캐스팅 그렇지 않은면 attack 못씀
		
		
		c.attack();
		c.cry();
	}
}
