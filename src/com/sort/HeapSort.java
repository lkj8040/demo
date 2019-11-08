package com.sort;

import java.util.Arrays;

/**
 *  	 堆排序
 * @author liukuijian
 * @version 2019-9-9
 *
 */
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * nums.length);
		}
		//System.out.println(Arrays.toString(nums));
		long start = System.currentTimeMillis();
		heapSort(nums);
		long end = System.currentTimeMillis();
		//System.out.println("-----------------------------------");
		//System.out.println(Arrays.toString(nums));
		System.out.println(nums.length + "个数heapSort时间：" + (end - start) + " ms");
	}
	public static void heapSort(int[] nums) {
		int lastIndex = nums.length - 1;
		for(int i = 0; i < nums.length - 1; i++) {
			buildHeap(nums, lastIndex);
			int tmp = nums[0];
			nums[0] = nums[lastIndex];
			nums[lastIndex] = tmp;
			lastIndex--;
		}
	}
	//建堆
	private static void buildHeap(int[] nums, int lastIndex) {
		for(int i = lastIndex / 2; i >= 0; i--) {//从最后一个非叶子结点往前创建
			int k = i;
			//左结点是2 * k, 右结点是 2 * k + 1
			if(2 * k + 1 <= lastIndex) {
				int biggerIndex = 2 * k + 1;
				if(biggerIndex < lastIndex && nums[biggerIndex] < nums[biggerIndex + 1]) {//不是最后结点
						biggerIndex++;
				}
				if(nums[k] < nums[biggerIndex]) {//父结点比子结点小，把子结点提上来
					int tmp = nums[k];
					nums[k] = nums[biggerIndex];
					nums[biggerIndex] = tmp;
				}
			}
		}
	}
}
