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
	
	public  void add(int item) {
		Node n=new Node();
		n.data=item;
		if(size==0) {
			head=n;
			tail=n;
			size++;
		}
		else {
			n.next=head;
			head=n;
			size++;
		}
	}
	public int getFirst() throws Exception {
		if(size==0) {
			throw new Exception("LL is Empty");
		}
		else {
			return head.data;
		}
	}
	
	public int getLast() throws Exception {
		if(size==0)
			throw new Exception("LL is Empty");
		else
			return tail.data;
			
	}
	public int getAt(int index) throws Exception {
		if(size==0)
			throw new Exception("LL is Empty");
		else if(index<0 || index>=size)
			throw new Exception("Invalid Index");
		else {
			Node temp=new Node();
			temp=head;
			for(int i=0;i<index;i++)
				temp=temp.next;
			return temp.data;
				
		}
			
	}

}
