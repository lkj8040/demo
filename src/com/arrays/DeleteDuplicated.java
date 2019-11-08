package com.arrays;

/**
 * 	删除有序数组中的重复元素，并返回删除重复元素后的数组长度
 * @author liukuijian
 * @version 2019-09-25
 */
public class DeleteDuplicated {
	//快慢指针
	public static int deleteDuplicated(int[] nums) {
		int fast = 1;
		int slow = 0;
		while(fast != nums.length - 1) {
			//如果快指针指向的元素不等于慢指针指向的元素
			//让慢指针替换为该元素
			if(nums[fast] != nums[slow]) {
				slow++;
				nums[slow] = nums[fast];
			}
			fast++;
		}
		return slow;
	}
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 5, 5, 8};//数组要求是有序的
		int res = deleteDuplicated(nums);
		System.out.println(res);
		for(int i = 0; i <= res; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
