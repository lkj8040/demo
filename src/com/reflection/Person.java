package com.reflection;

public class Person {
	String name;
	int id;
	private void info() {
		System.out.println("name=" + name + ", id=" + id);
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}
