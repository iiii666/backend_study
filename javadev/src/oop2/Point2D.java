package oop2;

public class Point2D {
	
	
	
	public Point2D() {// 생성자
		this(1, 2); // 생성자에서 또다른 생성자를 부를땐 제일먼저
		System.out.println("Point2D() 생성자수행");
	}

	public Point2D(int x, int y) {// 생성자 오버로딩
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y) 생성자수행");

	}
	
	int x;
	int y;
}
