package oop5;

public class SingleTest {
	public static void main(String[] args) {
		
		
		Single s1 = Single.getInstance();//new Single();
		Single s2 = Single.getInstance();//new Single();//s1 과 s2 별개 
		//s1 과 s2 는 하나의 공유 인스턴스 
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
