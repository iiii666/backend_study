package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Integer> li = new Vector<>();
		
		
		li.add(3);
		li.add(4);
		li.add(5);
		
		System.out.println(li);
		
		li.add(1,6);
		System.out.println(li);
		
		List<Integer> li2 = new Vector<>();
		
		li2.add(1);
		li2.add(2);
		
		
		li2.addAll(li);
		System.out.println(li2);
		
		List<Integer> li3 = new Vector<>();
		
		li3.add(1);
		li3.add(2);
		li3.addAll(1,li3);
		System.out.println(li3);
		
		li3.set(1, 3);
		System.out.println(li3);
		
		li3.set(3,6);
		System.out.println(li3);
		
		li3.remove(1);
		System.out.println(li3);
		li3.remove(Integer.valueOf(2));
		System.out.println(li3);
		
		li3.clear();
		System.out.println(li3);
		
		System.out.println(li3.isEmpty());
		
		System.out.println(li3.size());
		
		li3.add(1);
		li3.add(2);
		li3.add(3);
		
		
		System.out.println(li3);
		System.out.println(li3.size());
		
		
		
		
		System.out.println(li3.get(0));
		
		
		Integer[] integer2 = li3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
	}
}
