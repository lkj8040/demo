package com.exer;

public class exer6 {
	public static int getAge(int n) {
		if(n == 1) {
			return 10;
		}else {
			return getAge(n - 1) + 2;
		}
	}
	public static void main(String[] args) {
		System.out.println(getAge(8));
	}
}
