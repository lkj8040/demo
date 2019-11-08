package com.linkedlist;


public class LinkedlistDemo {
	public static void main(String[] args) {
		Node temp = new Node((int) (Math.random() * 10));
		Node head = temp;
		for(int i = 0; i < 10; i++) {
			temp.next = new Node((int) (Math.random() * 10));
			temp = temp.next;
		}
		while(head != null) {
			if(head.next != null) {
				System.out.print(head.val + "-->");
			}else {
				System.out.println(head.val);
			}
			head = head.next;
		}
	}

}
class Node{
	int val;
	Node next;
	public Node(int val) {
		super();
		this.val = val;
	}
}