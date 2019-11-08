package com.sort;

import java.util.Arrays;
/**
 *    	快速排序
 * @author liukuijian
 * @version 2019-9-6
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*nums.length);
		}
		//System.out.println(Arrays.toString(nums));
		long start = System.currentTimeMillis();
		quickSort(nums);
		long end = System.currentTimeMillis();
		//System.out.println("-----------------------------------");
		//System.out.println(Arrays.toString(nums));
		System.out.println(nums.length + "个数quickSort时间：" + (end - start) + " ms");

	}
	public static void quickSort(int[] nums) {
		//快排本质上就是个双指针的应用
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
}
