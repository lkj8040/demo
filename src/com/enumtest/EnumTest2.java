package com.enumtest;

class A{}




enum Season2{
	
	 //必须在枚举类的第一行声明枚举类对象
	 SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天"); //列出的实例系统会自动添加 public static final 修饰
	
	 //枚举类对象的属性不应允许被改动, 所以应该使用 private final 修饰
	 private final String name;
	
	//构造器的权限修饰符默认是private
	Season2(String name){
		this.name = name;
	} 
		 
	public String getName() {
		return name;
	}
}

public class EnumTest2 {
	public static void main(String[] args) {
		/*
		 *  values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
		    valueOf(String str)：可以把一个字符串转为对应的枚举类对象。
				要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。

		 */
		// values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
		Season2[] values = Season2.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i].getName());
		}
		
		System.out.println("-------------------------------------------");
		
		// valueOf(String str)：可以把一个字符串转为对应的枚举类对象。
//		要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
		Season2 spring = Season2.valueOf("WINTER");//注意大小写
		System.out.println(spring.getName());
	}
}









