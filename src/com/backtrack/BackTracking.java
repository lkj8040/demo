package com.backtrack;

import java.util.List;

/**
 * 	46.给定一个没有重复数字的序列，返回其所有可能的全排列。
 * 	输入: [1,2,3]
	输出:
	[
	  [1,2,3],
	  [1,3,2],
	  [2,1,3],
	  [2,3,1],
	  [3,1,2],
	  [3,2,1]
	]
 * 
 * @author liukuijian
 *
 */
public class BackTracking {
    public List<List<Integer>> permute(int[] nums) {
    	//对于n-1个数字已经确定的排列，第n个数字可以摆放的位置为n个，构成n种可能性
    	//这里由于没有重复数字，不需要考虑
    	
        return null;
    }
}
