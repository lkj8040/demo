package com.exception;

public class ExceptionTest {
	public static void main(String[] args)  {
		int n = -9;
		try {
			show(n);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void show(int n) throws MyException {//属于异常处理的一种方式，声明在方法的声明处
		if(n > 0) {
			System.out.println(n);
		}else {
			throw new MyException("不能是负数");//抛出一个异常类的对象，生成异常对象的过程
		}
	}
}
class MyException extends Exception{//自定义异常类

	public MyException(String message) {
		super(message);
	}
}
