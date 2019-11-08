package com.exer;

public class exer8 {
	public static long f(long number) {
		StringBuilder str = new StringBuilder(number + "");
		str.reverse();
		String s = str.toString();
		return Long.parseLong(s);
	}
	public static void main(String[] args) {
		System.out.println(f(98765));
	}
}
