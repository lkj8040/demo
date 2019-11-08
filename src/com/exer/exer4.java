package com.exer;

public class exer4 {
	public static long f(int n) {
		long sum = 0;
		if(n == 1) {
			sum = 1;
		}else {
			sum += n + f(n - 1);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(f(10));
	}
}
