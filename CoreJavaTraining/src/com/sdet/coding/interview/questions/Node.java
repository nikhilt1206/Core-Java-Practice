package com.sdet.coding.interview.questions;

public class Node {

	private int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public static void TraverseLinkedList(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		// Linked List (Linear Data Structure)
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		TraverseLinkedList(head);

	}

}
