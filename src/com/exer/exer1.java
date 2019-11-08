package com.exer;

public class exer1 {
	public static void main(String[] args) {
		loop:
			for(int i = 101; i <= 200; i++) {
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						continue loop;
					}
				}
				System.out.println(i);
			}
	}
}
