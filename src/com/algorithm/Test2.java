package com.algorithm;

public class Test2 {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					clerk.addProduct();
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					clerk.getProduct();
				}
			}
		}).start();

	}
}

class Clerk {
	private int product;

	public synchronized void addProduct() {
		if (product >= 20) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("生产者生产第" + ++product + "个产品");
			notify();
		}
	}

	public synchronized void getProduct() {
		if (product <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("消费者消费第" + product-- + "个产品");
			notify();
		}
	}
}
