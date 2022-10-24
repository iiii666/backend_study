package oop9;

public class Abs {
 
	 public static void main(String[] args) {
		Animal ani = new Dog();
		Animal ani2 = new Cat();
		
		ani.cry();
		ani2.cry();
	}
}
abstract class Animal{
	abstract void cry() ;
}
class Dog extends Animal{

	@Override
	void cry() {
		System.out.println("멍멍");
		
	}
	
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}
