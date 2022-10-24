package generic;

public class SingleGeneric {
public static void main(String[] args) {
	MyClass<String> mc1 = new MyClass<String>();
	
	mc1.setT("안녕");
	
	System.out.println(mc1.getT());
	
	
	MyClass<Integer> mc2 = new MyClass<Integer>();
	mc2.setT(100);
	System.out.println(mc2.getT());
}
}


class MyClass<T>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

