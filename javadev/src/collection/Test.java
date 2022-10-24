package collection;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<C> hashSet3 = new HashSet<>();
		
		
		C c1 = new C(3);
		C c2 = new C(3);
		
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode()+ " " + c2.hashCode());
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());
	}
}
class C{
	int data;
	public C(int data) {
		this.data = data;
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return data;
	}
}

