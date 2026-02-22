package com.sdet.coding.interview.questions;

public class ReverseaLinkedList {

	public static Node reverse(Node head) {
		Node previous = null;
		Node current=head;
		while(current!=null) {
			Node next = current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	
	public static void print(Node head) {
		while(head!=null) {
			System.out.print(head.getData()+" ");
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next =new Node(40);
		head.next.next.next=new Node(60);
		System.out.print("Original Linked List: ");
		print(head);
		head=reverse(head);
		System.out.print("\nReversed Linked List: ");
		print(head);  
	}

}
