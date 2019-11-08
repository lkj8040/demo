package com.exer;

public class exer7 {
	public static int countStep(int n) {
		if(n <= 2) {
			return n;
		}else {
			return countStep(n - 1) + countStep(n - 2);
		}
	}
	public static void main(String[] args) {
		System.out.println(countStep(5));
	}
}
