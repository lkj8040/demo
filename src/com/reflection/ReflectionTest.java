package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) throws Exception {
		String name = "com.reflection.Person";
		Class clazz = Class.forName(name);
		Constructor personConstructor = clazz.getConstructor(String.class, int.class);
		Person p = (Person) personConstructor.newInstance("二哈", 1010);
		Method method = clazz.getDeclaredMethod("info");
		method.setAccessible(true);
		method.invoke(p);
		ClassLoader loader = clazz.getClassLoader();
		ClassLoader loader2 = loader.getParent();
		ClassLoader loader3 = loader2.getParent();
		System.out.println(loader);
		System.out.println(loader2);
		System.out.println(loader3);
	}
}
