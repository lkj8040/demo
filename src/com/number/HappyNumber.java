package com.number;

public class HappyNumber {
	/**
	 * 	202.一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
	 * 	也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
	 * 	输入: 19
	 *	输出: true
	 *	解释:
	 *	1^2 + 9^2 = 82
	 *	8^2 + 2^2 = 68
	 *	6^2 + 8^2 = 100
	 *	1^2 + 0^2 + 0^2 = 1
	 *
	 * @param n
	 * @return
	 */
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = bitSum(slow);
            fast = bitSum(fast);
            fast = bitSum(fast);
        }while(slow != fast);
        if(fast == 1)
            return true;
        else 
        	return false;
    }
    
    private int bitSum(int m){
        int bitsum = 0;
        while(m != 0){
            int a = m % 10;
            bitsum += a * a;
            m /= 10;
        }
        return bitsum;
    }
}
