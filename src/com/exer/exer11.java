package com.exer;

public class exer11 {
	public static int binarySearch(char[] cs,char target) {
		int left = 0;
		int right = cs.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(cs[mid] > target) {
				right = mid - 1;
			}else if(cs[mid] < target) {
				left = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		char[] cs = {'a','b','c','d','e','f','g','h'};
		System.out.println(binarySearch(cs, 'g'));
	}
}
