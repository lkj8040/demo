package com.atomic;

public class Increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		i = i++ + ++i + (i++);//1 + 3 + 3 = 7
		System.out.println(i);
	}
}
