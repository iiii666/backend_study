package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod2 {

	public static void main(String[] args) {

		List<Integer> li2 = new ArrayList<>();
		List<Integer> li = new LinkedList<>();

		long startTime = 0;
		long endTime = 0;
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			li2.add(0, i);
		}

		endTime = System.nanoTime();
		System.out.println("Arraylist 데이터 추가 시간 = " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			li.add(0, i);
		}

		endTime = System.nanoTime();
		System.out.println("Linkedlist 데이터 추가 시간 = " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			li2.get(i);
		}

		endTime = System.nanoTime();
		System.out.println("Arraylist 데이터 검색 시간 = " + (endTime - startTime) + "ns");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			li.get(i);
		}

		endTime = System.nanoTime();
		System.out.println("Linkedlist 데이터 검색 시간 = " + (endTime - startTime) + "ns");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			li2.remove(0);
		}

		endTime = System.nanoTime();
		System.out.println("Arraylist 데이터 삭제 시간 = " + (endTime - startTime) + "ns");
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			li.remove(0);
		}

		endTime = System.nanoTime();
		System.out.println("Linkedlist 데이터 삭제 시간 = " + (endTime - startTime) + "ns");

	}
}
