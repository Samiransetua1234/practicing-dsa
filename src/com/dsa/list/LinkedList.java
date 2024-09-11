
package com.dsa.list;
class Node{
	int data;
	Node next ;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
	}
	
	public void printList() {
		Node current = head;
		
		System.out.print("Head : ");
		while(current != null) {
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void delete(int key) {
		Node current = head, prev = null;
		
		if(current != null && current.data == key) {
			head = current.next;
			return;
		}
		
		while(current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		
		if(current == null) return;
		
		prev.next = current.next;
	}
	
	public Node findMiddle() {
		Node slow = head;
		Node fast = head;
		
		while( fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void deleteLast() {
		
		if(head == null) return;
		
		if(head.next == null) {
			head = null;
			return;
		}
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		
		current.next = null;
	}
}
