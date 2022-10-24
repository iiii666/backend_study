package oop1;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D();//인스턴스화 메모리상에 실체를 생성(참조변수가 없으면 소멸됨->가비지 컬렉션 실행시)
		pt.setX(100);
		pt.setY(200);
		pt.setZ(400);
		pt.print();
	}
}

