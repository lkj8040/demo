package com.java;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = new int[10];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100);
		}
		Arrays.sort(nums);//api
		System.out.println(nums.toString());//调用的是Object的toString方法
		System.out.println(Arrays.toString(nums));//调用的是Arrays类的toString静态方法 
		System.out.println("---------------------------------------");
		System.out.println(binarySearch(nums, nums[3]));//api
		System.out.println(Arrays.binarySearch(nums, nums[3]));
	}
	public static int binarySearch(int[] nums, int target) {//nums已排好序
		int left = 0;
		int right = nums.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(nums[mid] > target) {
				right = mid - 1;
			}else if(nums[mid] < target) {
				left = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;//没有找到
	}
}
