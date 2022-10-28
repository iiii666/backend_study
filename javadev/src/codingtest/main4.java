package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class main4 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> m = new HashMap<>();
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int th = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		String[] arr = s.split(" ");
		Printer[] pt = new Printer();
		Queue<HashMap<Integer, Integer>> q = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			
			m.put(i, Integer.parseInt(arr[i]));
			q.add(m);
			 m = new HashMap<>();
		}
		List<Integer> temp = new ArrayList<>();
		int temp2 =0;
		HashMap<Integer, Integer> m2 = new HashMap<>();
		for (int i = 0; i < size; i++) {
			m2 = q.poll();
			temp2 = m2.get(i);
			temp.add(temp2);
			q.add(m2);
		}
		int max = Collections.max(temp);
		System.out.println(max);
		System.out.println(q);
		int count =0;
		HashMap<Integer, Integer> m3;
		
		

	}
	public class printer{
		int i;
		int prior;
		public printer(int i, int prior){
			this.i=i;
			this.prior =prior;
			
		}
		
	}
}
