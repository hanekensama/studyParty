package aoj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.toLowerCase();
		char[] chars = input.toCharArray();
		
		Map<Character, Integer> counter = new HashMap<>();
		for (char c : chars) {
			Integer v = counter.get(c);
			if (v == null) {
				v = 1;
			} else {
				v++;
			}
			counter.put(c, v);
		}
		
		for (int i = 0; i < 26; i++) {
			char key = (char) ('a' + i);
			Integer value = counter.get(key);
			if (value == null) value = 0;
			System.out.println(key + " : " + value);
		}
	}
}
