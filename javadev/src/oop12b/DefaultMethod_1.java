package oop12b;


interface AA{
	default void abc() {
		System.out.println("인터페이스의 메소드");
	}
}
class CC implements AA{
	public void abc() {
		AA.super.abc();
		System.out.println("c의 메소드~");
	}
}
public class DefaultMethod_1 {
	
	public static void main(String[] args) {
		
		
		
		CC x = new CC();
		
		x.abc();
		
	}

	
}
