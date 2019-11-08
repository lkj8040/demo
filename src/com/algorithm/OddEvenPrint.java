package com.algorithm;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
4、入参为一个整型数组（Integer[] input），要求对入参(input)按奇偶数分成两个数组，要求启动两个线程，
分别将入参(input)中的奇数和偶数输出到一个文件中，需要偶数线程每打印10个偶数以后，就将奇数线程打印10个奇数，
如此交替进行。同时需要记录输出进度，每完成1000个数就在控制台中打印当前完成数量，并在所有线程结束后，在控制台打印“Done”
 */
public class OddEvenPrint {
	static int printCount = 0;
	static boolean printOdd = false;
	static boolean alive = true;
	public static void main(String[] args) {
		Integer[] input = new Integer[5000];
		for (int i = 0; i < 5000; i++) {
			input[i] = (int) (Math.random() * 100);
		}
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		for(int i = 0; i < input.length; i++) {
			if(input[i] % 2 != 0) {
				odd.add(input[i]);
			}else {
				even.add(input[i]);
			}
		}
		
		Thread oddPrint = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					synchronized(Object.class) {
						if(!printOdd && alive) {
							try {
								(Object.class).wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							int i = 0;
							String number = "";
							while(!odd.isEmpty() && i++ < 10) {
								number += odd.remove(0) + " ";
							}
							number += "|";
							FileOutputStream fos = null;
							try {
								fos = new FileOutputStream("a.txt",true);
								fos.write(number.getBytes());
							} catch (IOException e) {
								e.printStackTrace();
							}finally {
								if(fos != null) {
									try {
										fos.close();
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
							}
							printCount += i - 1;
							printOdd = false;
							(Object.class).notify();
							if(odd.isEmpty()) {
								break;
							}
							if(printCount % 1000 == 0) {
								System.out.println("打印了" + printCount + "个数字");
							}
						}
					}
				}
				printOdd = true;
				alive = false;
				++printCount;
				if(printCount % 1000 == 0) {
					System.out.println("打印了" + printCount + "个数字");
				}
				if(printCount == input.length) {
					System.out.println( "DONE!");
				}
			}
		});
		
		Thread evenPrint = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					synchronized(Object.class) {
						if(printOdd && alive) {
							try {
								(Object.class).wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							int i = 0;
							String number = "";
							while(!even.isEmpty() && i++ < 10) {
								number += even.remove(0) + " ";
							}
							number += "|";
							FileOutputStream fos = null;
							try {
								fos = new FileOutputStream("a.txt",true);
								fos.write(number.getBytes());
							} catch (IOException e) {
								e.printStackTrace();
							}finally {
								if(fos != null) {
									try {
										fos.close();
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
							}
							printCount += i - 1;
							printOdd = true;
							(Object.class).notify();
							if(even.isEmpty()) {
								break;
							}
							if(printCount % 1000 == 0) {
								System.out.println("打印了" + printCount + "个数字");
							}
						}
					}
				}
				printOdd = true;
				alive = false;
				++printCount;
				if(printCount % 1000 == 0) {
					System.out.println( "打印了" + printCount + "个数字");
				}
				if(printCount == input.length) {
					System.out.println( "DONE!");
				}
			}
		});
		oddPrint.setName("奇数线程：");
		evenPrint.setName("偶数线程：");
		oddPrint.start();
		evenPrint.start();
	}

}