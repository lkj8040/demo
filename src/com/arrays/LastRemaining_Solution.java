package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class LastRemaining_Solution {
	public static int lastRemaining_Solution(int n, int m) {
        //一个队列中，循环数数，每次去除一个数
        //环形链表可以解决问题
        //如果使用数组？    
        if(n == 0 || m == 0){
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int j = 0;
        System.out.println(list);
        for(int i = 0; i < n - 1; i++){
        	int index = (j + m - 1) % list.size();
            Integer remove = list.remove(index);
            System.out.println(list + " " + remove);
            j = index;
        }
        int res = list.remove(0);
        return res;
    }
	public static void main(String[] args) {
		
		int solution = lastRemaining_Solution(8, 3);
		System.out.println(solution);
	}
}
