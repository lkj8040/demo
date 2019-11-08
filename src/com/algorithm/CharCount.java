package com.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
2、1个字符串中可能包含a-z中的多个字符，字符也可能重复，例如：String data = “aabcexmkduyruieiopxzkkkkasdfjxjdsds”;
写一个程序，对于给定一个这样的字符串求出字符串出现次数最多的那个字母以及出现的次数（若次数最多的字母有多个，则全部求出）
 */
public class CharCount {
	public static void charCount(String data) {
		Map<Character, Integer> map = new HashMap<>();
		int maxCount = 0;
		for (int i = 0; i < data.length(); i++) {
			if (map.containsKey(data.charAt(i))) {
				map.put(data.charAt(i), map.get(data.charAt(i)) + 1);
			} else {
				map.put(data.charAt(i), 1);
			}
			if (map.get(data.charAt(i)) > maxCount) {
				maxCount = map.get(data.charAt(i));
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxCount) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
	public static void main(String[] args) {
		String data = "aaaabcexmkduyruieiopxzkkkkasdfjxjdsds";
		charCount(data);
		
	}
//	public static void main(String[] args) {
//		Integer[] datas = {1,2,3,4,5};
//		List<Integer> list = Arrays.asList(datas);
//		list.add(5);
//		System.out.println(list.size());
//	}

}
