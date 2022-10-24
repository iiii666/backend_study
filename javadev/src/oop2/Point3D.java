package oop2;

public class Point3D extends Point2D{
	int z;

	
	public Point3D(int x, int y ,int z) {
		super(x,y);
		this.z = z;
		System.out.println("point3d(x,y,z) 생성자 수행");
	}
	
	public Point3D() {//상속클래스 만들면 파라미터 없는생성자 생성해야함
		this(0,0,0);
		System.out.println("point3d() 생성자수행");
	}
	

}
