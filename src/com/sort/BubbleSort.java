package com.sort;

import java.util.Arrays;

/**
 * 	冒泡排序
 * @author liukuijian
 * @version 2019-9-7
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*nums.length);
		}
		//System.out.println(Arrays.toString(nums));
		long start = System.currentTimeMillis();
		bubbleSort(nums);
		long end = System.currentTimeMillis();
		//System.out.println("-----------------------------------");
		//System.out.println(Arrays.toString(nums));
		System.out.println(nums.length + "个数bubbleSort时间：" + (end - start) + " ms");
		
	}
	private static void bubbleSort(int []nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
			}
		}
	}
}
