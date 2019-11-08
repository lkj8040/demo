package com.dp;


public class DP_sequence {

	/**
	 * 53.对于数组 nums, 找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
	 * 输入：[-2, 1, -3, 4, -1, 2, 1, -5, 4]
	 * 输出：6
	 * 解释：[4, -1, 2, 1]的和最大， 为 6
	 */
	public static int maxSequence(int [] nums) {
		//i为第i个元素结尾的子序列的最大和
		//状态转移方程：dp[i] = max{dp[i - 1] + nums[i], dp[i - 1], nums[i]} 
		int dp = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(dp + nums[i] > 0) {
				dp += nums[i];
			}
			dp = Math.max(dp, nums[i]);
		}
		return dp;
		
	}
	public static void main(String[] args) {
		System.out.println(maxSequence(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}

}
