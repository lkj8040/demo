package com.oop;

public class OOP {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.age = 1;
		cat.name = "猫";
		cat.leg = 4;
		cat.faviroute = "鱼";
		cat.show();
		new Animal("狗", 4, "骨头").show();
		new Animal().show();
	}
}
class Animal{
	String name;
	int age;
	int leg;
	String faviroute;
	public void eat() {
		System.out.println("吃");
	}
	public void breath() {
		System.out.println("呼吸");
	}
	public void show() {
		System.out.println(name +"有" + leg + "条腿，喜欢" + faviroute);
	}
	public Animal() {
		
	}
	public Animal(String name, int leg, String faviroute) {
		this.name = name;
		this.leg = leg;
		this.faviroute = faviroute;
	}
}