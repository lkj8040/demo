package com.java;

public class PrimeNumber{

	public static void main(String[]args){
		//打印质数
		loop:
		for(int i = 2; i < 1000000; i++){
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					continue loop;
				}
			}
			System.out.println(i);
		}
		
	}
}
