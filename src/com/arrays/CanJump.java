package com.arrays;

/**
	55.给定一个非负整数数组，你最初位于数组的第一个位置。
	数组中的每个元素代表你在该位置可以跳跃的最大长度。
	判断你是否能够到达最后一个位置。	
	示例 1:	
	输入: [2,3,1,1,4]
	输出: true
	解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
	示例 2:
	输入: [3,2,1,0,4]
	输出: false
	解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
*/

public class CanJump {
	
    public static boolean canJump(int[] nums) {
    	//满足两个条件：①某个结点必须是0，②必须经过这个结点
    	//对于条件①，线性查找就能解决
    	//对于条件②，什么样的点必定会被经过呢？
    	//就是从该点之前任意一个点出发，都必定到达该点
    	//这样的点有什么特征
    	//在该点之前都是有序的吗？
    	//并不是，而是符合这样的规则：
    	//在该点之前有若干个结点符合..., 4,3,2,1,0 的特点,且再往前的点必定小于5
    	//根据递推关系, n 结点之前的每一个点 k 与该点 n 的关系应该满足 nums[k] <= n - k，这样该点就必然经过 n 结点
    	boolean flag = true;
    	for(int i = 0; i < nums.length - 1; i++) {
    		if(nums[i] == 0) {
    			int k = 0;
    			for(; k < i; k++) {
    				if(nums[k] > i - k) {
    					break;
    				}
    			}
    			if(k == i) {//说明没有一个是能越过0的
    				flag = false;
    			}
    		}
    	}
        return flag;
    }
    public static void main(String[] args) {
		System.out.println(canJump(new int[] {2,3,1,1,4}));
		System.out.println(canJump(new int[] {3,2,1,0,4}));
		System.out.println(canJump(new int[] {4,3,2,1,0}));
	}

}
