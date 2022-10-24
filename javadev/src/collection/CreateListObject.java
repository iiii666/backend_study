package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>(30);
		List<Integer> li3 = new Vector<>();
		List<Integer> li4 = new Vector<>(30);
		List<Integer> li5 = new LinkedList<>();
		//List<Integer> li6 = new LinkedList<>(30);
		
		
		
		List<Integer> li7 = Arrays.asList(1,2,3,4);
		
		
		li7.set(1, 9);
		
		List<String> li8 = Arrays.asList("안녕", "방가");
		
		li8.set(1, "dkssuddkssud");
		System.out.println(li7);
		System.out.println(li8);
	}  
}
