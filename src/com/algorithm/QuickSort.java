package com.algorithm;

import java.util.Arrays;

/**
8、写一个排序算法1-100随机数字，进行排序，要求效率（例如：冒泡、选择、快排.....等）
 */
public class QuickSort {
	public static void quickSort(int[] nums) {
		dataSort(nums, 0, nums.length - 1);
	}
	private static void dataSort(int [] nums, int left, int right) {
		if(left <= right) {
			int i = left;
			int j = right + 1;
			while(i < j) {
				while(i < right && nums[++i] <= nums[left]) ;//加=是为了越过相等的值
				while(j > left && nums[--j] >= nums[left]) ;
				if(i < j) {
					int cur = nums[i];
					nums[i] = nums[j];
					nums[j] = cur;
				}
			}
			int temp = nums[left];
			nums[left] = nums[j];
			nums[j] = temp;
			dataSort(nums, left, j - 1);
			dataSort(nums, j + 1, right);
		}
	}
	public static void main(String[] args) {
//		int [] nums = new int[100000];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = (int)(Math.random()*nums.length);
//		}
//		//System.out.println(Arrays.toString(nums));
//		long start = System.currentTimeMillis();
//		quickSort(nums);
//		long end = System.currentTimeMillis();
//		//System.out.println("-----------------------------------");
//		//System.out.println(Arrays.toString(nums));
//		System.out.println(nums.length + "个数字quickSort时间：" + (end - start) + " ms");
		int[] nums = new int[] {2,4,5,1,0};
		System.out.println(Arrays.toString(nums));
		quickSort(nums);
		System.out.println(Arrays.toString(nums));

	}
}
