package com.algorithm;

/**
6、找出数组中一个值，使其左侧值的加和等于右侧值的加和，例如：1,2,5,3,2,4,2，结果为：第4个值
 */
public class LeftRightEqual {
	//O(n^2)
	public static int leftRightEqual(int[] nums) {
		for (int i = 1; i < nums.length - 1; i++) {
			int left = i - 1;
			int right = i + 1;
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j <= left; j++) {
				leftSum += nums[j];
			}
			for (int j = right; j < nums.length; j++) {
				rightSum += nums[j];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}
	//O(n), 推荐用这个
	public static int findLeftRightEqual(int[] nums) {
		if(nums == null || nums.length < 3) {
			return -1;
		}
		int left = 0;
		int right = 0;
		for (int i = 1; i < nums.length; i++) {
			right += nums[i];
		}
		for (int i = 1; i < nums.length - 1; i++) {
			left += nums[i - 1];
			right -= nums[i];
			if (left == right) {
				return i;
			}
		}
		return -1;
	}

	public static long timeCalculate(int[] nums) {
		long start = System.currentTimeMillis();

		System.out.println(leftRightEqual(nums));

		long end = System.currentTimeMillis();

		return end - start;
	}
	public static long timeCalculate2(int[] nums) {
		long start = System.currentTimeMillis();

		System.out.println(findLeftRightEqual(nums));

		long end = System.currentTimeMillis();

		return end - start;
	}

	public static void main(String[] args) {

		int[] nums = new int[100000];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 100);
		}
		System.out.println("n^2时间：" + timeCalculate(nums));
		System.out.println("n时间：" + timeCalculate2(nums));

	}
}
