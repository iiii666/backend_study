package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		String str = "";
		for (int i = 0; i < num; i++) {
			str = br.readLine();
			map.put(str, str.length());
		}
		List<String> keyList = new ArrayList<>(map.keySet());
		keyList.sort((s1, s2) -> s1.compareTo(s2));
		for (String key : keyList) {
			map2.put(key, map.get(key));
			}
		dictionary[] d = new dictionary[map2.size()];

		for (int i = 0; i < map2.size(); i++) {
			d[i] = new dictionary(keyList.get(i),map2.get(keyList.get(i)));
		}
		Arrays.sort(d);

		for (int j = 0; j < map2.size(); j++) {
			System.out.println(d[j].word);
		}

	}

}

class dictionary implements Comparable<dictionary> {
	String word;
	int number;

	public dictionary(String word, int number) {
		this.word = word;
		this.number = number;
	}

	@Override
	public int compareTo(dictionary o) {

		if (this.number > o.number) {
			return 1;
		} else if (this.number == o.number) {
			return 0;
		} else {
			return -1;
		}
	}

}