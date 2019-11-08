package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	49.给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
	示例：
	输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
	输出:
	[
	  ["ate","eat","tea"],
	  ["nat","tan"],
	  ["bat"]
	]
*/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	//重复字符算不算异位词
    	List<List<String>> List = new ArrayList<>();
    	Map<String, Map<Character, Integer>> str = new HashMap<>();
    	for(int i = 0; i < strs.length; i++) {
    		Map<Character, Integer> charCount = new HashMap<>();
    		for(int j = 0; j < strs[i].length(); j++) {
    			if(charCount.containsKey(strs[i].charAt(j))) {
    				charCount.put(strs[i].charAt(j), charCount.get(strs[i].charAt(j)) + 1);
    			}else {
    				charCount.put(strs[i].charAt(j), 1);
    			}
    		}
    		str.put(strs[i], charCount);
    	}
    	for(Map.Entry<String, Map<Character, Integer>> entry : str.entrySet()) {
    		Map<Character, Integer> map = entry.getValue();
    		
    	}
        return null;
    }
}
