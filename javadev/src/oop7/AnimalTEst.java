package oop7;

public class AnimalTEst {
	public static void main(String[] args) {
//		Animal a = new Bird();//  버드인스턴스 생성, 업캐스팅
//		System.out.println(a.toStiring());
//		
//		
//		Bird b = (Bird) a;
//		System.out.println(b.toStiring());
//		
//		
//		Eagle e = (Eagle)b;
//		System.out.println(e);
		
		
//		Bird e = new Eagle();
//		System.out.println(e.toStiring());
//		
//		Animal a = new Eagle();
//		System.out.println(a);
//		
//		Bird b2 = (Bird)a ;
//		System.out.println(b2.toStiring());
//		Eagle i = (Eagle) b2;
//		System.out.println(i.toStiring());
//		
//		
//		if( e instanceof BladEagle) {
//			BladEagle be =(BladEagle) e;
//
//			System.out.println(be);
//
//		}else {
//			System.out.println("다운캐스팅 불가");
//		}
		
		
//		
		
		Bird b = new Bird();
		Animal a = b;//업캐스팅이라 자동형변환됌
		System.out.println(a.toStiring());
		
		Cat c = (Cat)a ;
		System.out.println(c);
		
		
	}
}
