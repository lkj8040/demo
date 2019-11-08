package com.algorithm;

/**
5、编程实现单向链表，并实现单向链表的反转。比如一个链表是这样的：1->2->3->4->5，通过反转后成为5->4->3->2->1，
注：即实现单向链表类，在该类中提供一个单向链表的反转方法reverse，请写出完整代码
 */
class Node{
	int val;
	Node next;
	public Node(int val) {
		super();
		this.val = val;
	}
	
}
public class ReverseLinkedList {
	
	public static Node reverse(Node head) {
		Node pre = null;
		Node cur = head;
		while(cur != null) {
			Node temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp = head;
		head.next = new Node(2);
		head = head.next;
		head.next = new Node(3);
		head = head.next;
		head.next = new Node(4);
		head = head.next;
		head.next = new Node(5);
		head = temp;
		head = reverse(head);
		while(head != null) {
			System.out.print(head.val + "->");
			head = head.next;
		}
		System.out.println();
		
	}
}
