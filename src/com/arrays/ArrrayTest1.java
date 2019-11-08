package com.arrays;

import java.util.Arrays;

public class ArrrayTest1 {
	public static void main(String[] args) {
		int [] arr = new int[] {1,24,4,2,9,-1};
		System.out.println(arr);
		System.out.println("----------------------------");
		rotate(arr, 3);
		System.out.println("----------------------------");
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	//数组循环向右移动k个索引
    public static void rotate(int[] nums, int k) {

        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[(i + k) % nums.length] = nums[i];
        }
        //nums = temp;//nums 跟arr 是两个变量，两者只是初始指向的对象相同，因此这种做法是错误的
        
        //下面这种做法才是正确的数组复制方法
        for(int i = 0; i < nums.length; i++) {
        	nums[i] = temp[i];
        }
        
        String s = "1";
        
        System.out.println(nums);
    }
}
