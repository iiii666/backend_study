package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			li.add(Integer.parseInt(br.readLine()));
		}

		double avg = 0.0;
		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += li.get(i);
		}
		avg = sum / N;
		System.out.println(Math.round(avg));

		Collections.sort(li);
		System.out.println(li.get(Math.round(N / 2)));

		// 최빈값구할 차례
		int[] arr = new int[4000];
		int[] arr2 = new int[4000];
		for (int i = 0; i < N; i++) {
			if (li.get(i) >= 0) {
				arr[li.get(i)]++;
			}else {
				arr2[li.get(i) * -1]++;
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i =0;i <N;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}

		System.out.println(li.get(N - 1) - li.get(0));

	}

}
