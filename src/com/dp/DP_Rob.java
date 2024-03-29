package com.dp;

public class DP_Rob {
	/**
	 * 
	 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
	 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，
	 * 能够偷窃到的最高金额。
	 * 例：
	 * 输入：[2,1,1,2]
	 * 输出：4
	 * @param num
	 * @return
	 */
    public int rob(int[] num) {
        int prevMax = 0;//f(k – 2)
        int currMax = 0;//f(k – 1)
        for (int x : num) {
            int temp = currMax;
            //状态转移方程：f(k) = max(f(k – 2) + Ax, f(k – 1))
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
