package com.string;

public class StringTest {
	/**
	 * 190.颠倒给定的 32 位无符号整数的二进制位
	 * 
	 * @param n
	 * @return
	 * 
	 */
    public int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
		while(binaryString.length() < 32) {
				binaryString = "0" + binaryString;
		}
        char[] res = binaryString.toCharArray();
        int number = 0;
        int x = 1;
        for(int i = 0; i < 32; i++){
            if(res[i] == '1'){
                number += x;
            }
            x *= 2;
        }
        return number;
    }

	public int reverseBits_1(int n) {
		int a = 0;
		for (int i = 0; i < 32; i++) {
			a = a + ((n & 1) << (31 - i));
			n = n >> 1;
		}
		return a;
	}
	
	/**
	 * 191.编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
	 * @param n
	 * @return
	 */
    public int hammingWeight(int n) {
        int count = 0;
        String str = Integer.toBinaryString(n);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
