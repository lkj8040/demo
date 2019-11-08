package com.exer;

import java.util.HashMap;
import java.util.Map;

public class exer9 {
	public static void numbeLetterCount( String str) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	public static void main(String[] args) {
		numbeLetterCount("中中国55kkfff");
	}
}