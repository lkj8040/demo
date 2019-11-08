package com.exer;

public class exer2 {
	public static void main(String[] args) {
		double j = 100;
		double sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += j;
			j /= 2;
			if(i != 10) {
				sum += j;
			}
		}
		System.out.println(sum);
		System.out.println(j);
	}
}
