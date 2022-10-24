package oop6;

public class HumanTest2 {
	public static void main(String[] args) {
		
		
		Worker w = new Worker();
		
		Student s = new Student();
		
		Human h = new Worker();//업캐스팅 : 자동형변환
		h.eat();
		
		Worker h2 = (Worker)h;//다운캐스팅 = 업캐스팅된 인스턴스를 sub타입으로 재 형변환하는 것
		
		h2.goWork();
		
		Human h3 = new Human();
		if(h3 instanceof Worker) {//false
			Worker h4 = (Worker)h3;// ClassCastException 에러 발생, 형변환 하기전에 확인해봐야함 업캐스팅은 되는데 다운은 생각
		}
		else {
			System.out.println("다운캐스팅 불가");
		}
	}
}