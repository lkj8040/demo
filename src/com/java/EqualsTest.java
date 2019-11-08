package com.java;

import java.util.Arrays;

/**
 * == 和 euqals方法的区别
 * @author liukuijian
 * @version 2019-9-24
 */
public class EqualsTest {
	public static void main(String[] args) {
		
		int p = 10;
		double q = 10.0;
		System.out.println(p == q);
		System.out.println("-----------------------------------");
		
		String a = "abc";
		String b = "abc";
		System.out.println(a == b);//放在JVM的常量池，地址值相等，true
		System.out.println(a.equals(b));//String的equals方法经过重写,true
		System.out.println("-----------------------------------");
		
		a = new String("abc");
		b = new String("abc");
		System.out.println(a == b);//比较地址值,false
		System.out.println(a.equals(b));//String的equals方法经过重写,true
		System.out.println("-----------------------------------");
		
		//不可变性：无论是重新赋值，字符串拼接，还是修改某个字符，都是重新创建一个字符串
		String c = "hello";
		final String d = "world";//final修饰为常量，在方法区字符串常量池
		String e = "helloworld";
		String f = c + d;//c是变量，此种方式相当于new String，在堆中
		String g = c + "world";
		String h = "hello" + d;//常量池
		String i = "hello";
		i += "world";
		c += "world";//new的方式创建
		System.out.println(e == f);
		System.out.println(e == g);
		System.out.println(e == h);
		System.out.println(e == c);
		System.out.println(i == c);
		System.out.println("-----------------------------------");
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//IntegerCache里面直接拿过来用，因此是同一个对象,true
		System.out.println(m.equals(n));//Integer的equals方法经过重写,true
		System.out.println("-----------------------------------");
		
		m = 128;
		n = 128;
		System.out.println(m == n);//比较地址值，128超出了IntegerCache的范围-128~127，实际上是在堆中new出来的,false
		System.out.println(m.equals(n));//Integer的equals方法经过重写,true
		System.out.println("-----------------------------------");
		
		int[]nums1 = {1,2,3};
		int[]nums2 = {1,2,3};

		System.out.println(nums1.toString());
		System.out.println(nums1 == nums2);//比较地址值
		System.out.println(nums1.equals(nums2));//原始的equals方法，没有被重写，对于引用数据类型，同样是比较地址值
		System.out.println(Arrays.equals(nums1, nums2));//重写了equals方法
		System.out.println("-----------------------------------");
		
		Person person = new Person("abc",12);//常量池：String name = "abc"
		Person person2 = new Person("abc",10);
		System.out.println(person.name == person2.name);
		
		System.out.println("----------------------------------");
		String mystr = "a0A";
		System.out.println(Arrays.toString(mystr.getBytes()));
		String str = new String(mystr.getBytes(), 1,2);
		System.out.println(str);
	}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}