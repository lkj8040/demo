package com.exer;

public class exer5 {
	public static long sum(int n) {
		long sum = 0;
		long dp = 1;
		for(int i = 1; i <= 20; i++) {
			dp *= i;
			sum += dp;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(20));
	}
}
