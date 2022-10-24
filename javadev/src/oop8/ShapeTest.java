package oop8;

public class ShapeTest {
	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Triangle());
		printArea(new Rectangle());
	}

	private static void printArea(Shape s) {//업캐스팅
		s.area();
		if( s instanceof Circle) {
			Circle c = (Circle) s;
			System.out.println("반지름이" + c.r + "원넓이는" + c.res);
		}else if(s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("밑변" + t.w + "높이" + t.h + "넓이는"+ t.res);
		}else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("가로" + r.w + "높이" + r.h + "넓이는"+  r.res);
		}
		
		
	}
}
