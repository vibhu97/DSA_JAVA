package linkedlist;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public void append(int data) {
		Node n=new Node();
		n.data=data;
		if(size==0) {
			head=n;
			tail=n;
			size++;
		}
		else {
			tail.next=n;
			tail=n;
			size++;
		}
	}
	public void traverse() {
		Node temp=new Node();
		temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
