package com.java;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ListNode reverseLinkedList(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode pre = null;
		ListNode cur = head;
		while(cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return cur;
	}
}
class ListNode{
	int val;
	ListNode next;
	public ListNode() {
		this.val = val;
	}
}