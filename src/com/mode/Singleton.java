package com.mode;
import com.algorithm.*;
public class Singleton {
	public static void main(String[] args) {
		MyInterface.info();//表明這個info方法是public static的
	}
}
//饿汉式一：
class Giant{
	private Giant() {}
	public static Giant instance = new Giant();
}
//饿汉式二：
class Bank{
	private Bank() {}
	private static Bank instance = new Bank();
	public static Bank getInstance() {
		return instance;
	}
}
//饿汉式三：
enum Customer{
	instance;
}

//懒汉式一：
class Team{
	private Team(){}
	private static Team instance = null;
	public static Team getInstance() {
		synchronized(Team.class) {
			if(instance == null) {
				instance = new Team();
			}
		}
		return instance;
	}
}