package collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet {
public static void main(String[] args) {
	TreeSet<Integer> treeSet = new TreeSet<>();
	
	for(int i =50;i>0;i-=2) {
		treeSet.add(i);
	}
	
	System.out.println(treeSet);
	
	
	System.out.println(treeSet.first());
	System.out.println(treeSet.last());
	
	
	System.out.println(treeSet.lower(26));
	System.out.println(treeSet.higher(26));
	
	System.out.println(treeSet.floor(25));System.out.println(treeSet.floor(26));
	
	System.out.println(treeSet.ceiling(25));
	
	System.out.println(treeSet.ceiling(26));
	
	System.out.println();
	int treeSetSize = treeSet.size();
	
	System.out.println(treeSetSize);
	
	
	
	for(int i =0;i<treeSetSize;i++) {
		System.out.print(treeSet.pollFirst() + " ");
	}
	
	System.out.println();
	System.out.println(treeSet.size());
	for(int i =50;i>0;i-=2) {
		treeSet.add(i);
	}
	treeSetSize  =treeSet.size();
	
	for(int i =0;i<treeSetSize;i++) {
		System.out.print(treeSet.pollLast() + " ");
		
	}
	
	
	System.out.println(treeSet.size());
	for(int i =50;i>0;i-=2) {
		treeSet.add(i);
	}
	SortedSet<Integer> sSet = treeSet.headSet(20);
	
	
	System.out.println(sSet.toString());
	sSet = treeSet.tailSet(20,false);
	System.out.println(sSet);
	sSet = treeSet.subSet(10, 20);
	System.out.println(sSet);
	
	NavigableSet<Integer> decendingSet = treeSet.descendingSet();
	
	System.out.println(decendingSet);

	
}
}
