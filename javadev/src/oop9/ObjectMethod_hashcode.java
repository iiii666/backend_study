package oop9;

import java.util.HashMap;

public class ObjectMethod_hashcode {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");
		
		System.out.println(hm1);
		
		
		HashMap<A, String> hm2 = new HashMap<>();
		
		hm2.put(new A("첫 번째"), "데이터 1");
		hm2.put(new A("첫 번째"), "데이터 2");
		hm2.put(new A("두 번째"), "데이터 3");
		System.out.println(hm2);
		
		HashMap<R, String> hm3 = new HashMap<>();
		
		hm3.put(new R("첫 번째"), "데이터1");
		hm3.put(new R("첫 번째"), "데이터2");
		hm3.put(new R("두 번째"), "데이터3");
		System.out.println(hm3);
	}
	
	
	
}
class A{
	String name;
	A(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name){
			return true;
		}else 
			return false;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
class R{
	String name;
	R(String name){
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((R)obj).name) {
			return true;
			
		}else
			return false;
		
		
	}
	
	
	@Override
	public int hashCode() {
		
		return name.hashCode();
	}
	@Override
	public String toString() {
		
		return name;
	}
}