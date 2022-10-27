package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> li = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		;
		int temp;
		for (int i = 0; i < num; i++) {
			temp = Integer.parseInt(st.nextToken());
			li.add(temp);
			set.add(temp);
		}
		List<Integer> li2 = new ArrayList<>();

		li2.addAll(set);

		Collections.sort(li2);
		Map<Integer, Integer> m = new TreeMap<>();

		for (int i = 0; i < li2.size(); i++) {

			m.put(li2.get(i), i);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < num; i++) {
			sb.append(m.get(li.get(i))).append(' ');
		}
		System.out.println(sb);
	}

}
