package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
7、编程实现：线程A向队列Q中不停写入数据，线程B从队列Q中不停读取数据（只要Q中有数据）
 */
public class ThreadTest {
	public static void main(String[] args) {
		Queue<Integer> list = new LinkedList<>();
		new Thread() {
			@Override
			public void run() {
				int i = 1;
				while(true) {
					synchronized(Object.class) {
						list.offer(i);
						System.out.println(Thread.currentThread().getName()+":" + i++);
					}
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while(true) {
					synchronized(Object.class) {
						if(!list.isEmpty()) {
							System.out.println(Thread.currentThread().getName()+ ":" + list.poll());
						}
					}
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}
