package oop6;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		
		Worker w = new Worker();
		
		Student s = new Student();
		
		h.eat();
		
		w.eat();
		
		w.goWork();
		
		s.eat();
		
		s.goSchool();
	}
}
