package com.sort;

import java.util.Arrays;

/**
 * 	合并排序
 * @author liukuijian
 * @version 2019-9-8
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * nums.length);
		}
		//System.out.println(Arrays.toString(nums));
		long start = System.currentTimeMillis();
		mergeSort(nums);
		long end = System.currentTimeMillis();
		//System.out.println("-----------------------------------");
		//System.out.println(Arrays.toString(nums));
		System.out.println(nums.length + "个数mergeSort时间：" + (end - start) + " ms");
	}
	public static void mergeSort(int [] nums) {
		sort(nums, 0, nums.length - 1);
	}
	private static void sort(int[] nums, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			sort(nums, left, mid);
			sort(nums, mid + 1, right);
			merge(nums, left, mid, right);
		}
	}
	private static void merge(int[] nums, int left, int mid, int right) {
		int [] tempArr = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int index = 0;
		while(i <= mid  && j <= right) {
			if(nums[i] > nums[j]) {
				tempArr[index++] = nums[j++];
			}else{
				tempArr[index++] = nums[i++];
			}
		}
		while(j <= right) {
			tempArr[index++] = nums[j++];
		}
		while(i <= mid ) {
			tempArr[index++] = nums[i++];
		}
		index = 0;
		for(int k = left; k < right + 1; k++) {
			nums[k] = tempArr[index++];
		}
	}
}
