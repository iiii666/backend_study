package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Integer> li = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int avg = 0;
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			temp = Integer.parseInt(br.readLine());
			li.add(temp);
			sum += temp;
		}
	
		avg = sum / 5;
		Collections.sort(li);
		int mid = li.get(2);
		StringBuilder sb = new StringBuilder();

		sb.append(avg);
		sb.append(mid);
		System.out.println(sb);
	}

}
