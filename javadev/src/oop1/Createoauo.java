package oop1;
class A{
	int m = 3;
	void print() {
		System.out.println("클래스a의 프린트 메소드 실행");
	}
}
public class Createoauo {

	
	public static void main(String[] args) {
		A a = new A();
		
		a.m = 5;
		System.out.println(a.m);
	}
}
