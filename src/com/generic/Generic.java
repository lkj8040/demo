package com.generic;

import java.util.Arrays;

public class Generic {

	public static <E extends Comparable<E>>  int binarySearch(E e[], E target) {
		int left = 0;
		int right = e.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(e[mid].compareTo(target) == 0){
				return mid;
			}else if(e[mid].compareTo(target) < 0){
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static <E extends Comparable<E>> void quickSort(E e[]) {
		quickSort(e, 0, e.length - 1);
	}
	public static <E extends Comparable<E>> void quickSort(E e[], int left, int right) {
		if(left <= right) {
			int i = left;
			int j = right + 1;
			int temp = i;
			while(i < j) {
				while(i < right && e[++i].compareTo(e[temp]) <= 0);
				while(j > left && e[--j].compareTo(e[temp]) >= 0);
				if(i < j) {
					E tmp = e[i];
					e[i] = e[j];
					e[j] = tmp;
				}
			}
			E temperary = e[temp];
			e[temp] = e[j];
			e[j] = temperary;
			quickSort(e, 0, j - 1);
			quickSort(e, j + 1, right);
		}
	}
	public static void main(String[] args) {
		Integer[] nums = new Integer[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		System.out.println("------------quickSort------------");
		System.out.println(Arrays.toString(nums));
		quickSort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println("----------binarySearch-----------");
		Integer [] number = new Integer[]{91, 46, 32, 30, 10, 1, 99, 23, 79, 99};
		quickSort(number);
		int res = binarySearch(number, new Integer(10));
		System.out.println(Arrays.toString(number));
		if(res != -1) {
			System.out.println("10对应的索引位置为：" + res);
		}else {
			System.out.println("没有找到该元素~~");
		}
	}


}
