package com.exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exer12 {
	public static List<Integer> deleteDuplicated(List<Integer> list){
		Set<Integer> set = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		for(int ele : list) {
			set.add(ele);
		}
		for(int ele : set) {
			result.add(ele);
		}
		return result;
		
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
		System.out.println(deleteDuplicated(list));
	}
}
