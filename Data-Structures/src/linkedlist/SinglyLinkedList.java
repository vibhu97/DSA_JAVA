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
	private Node getNodeAt(int index) throws Exception {
		if(size==0)
			throw new Exception("LL is Empty");
		else if(index<0 || index>=size)
			throw new Exception("Invalid Index");
		else {
			Node temp=new Node();
			temp=head;
			for(int i=0;i<index;i++)
				temp=temp.next;
			return temp;
				
		}
			
	}
	
	public void addAt(int index,int item) throws Exception {
		if(index<0 || index>size)
			throw new Exception("Invalid Index");
		else if(index==0)
			add(item);
		else if(index==size)
			append(item);
		else {
			Node n=new Node();
			n.data=item;
			Node prev=getNodeAt(index-1);
			Node next=getNodeAt(index+1);
			prev.next=n;
			n.next=next;
			
			size++;
			
		}
		
	}
	
	public int removeFirst() throws Exception {
		
		if(size==0)
			throw new Exception("Invalid Index");
		else if(size==1) {
			int data=head.data;
			head=null;
			tail=null;
			size--;
			return data;
			
		}
		else {
			int data=head.data;
			head=head.next;
			size--;
			return data;
		}
	}
	
	public int removeLast() throws Exception {
		if(size==0)
			throw new Exception("Invalid Index");
		else if(size==1) {
			int data=head.data;
			head=null;
			tail=null;
			size--;
			return data;
			
		}
		else {
			Node n=getNodeAt(size-2);
			int data=n.data;
			tail=n;
			tail.next=null;
			size--;
			return data;
		}
		
	}
	public int removeAt(int index) throws Exception {
		if(size<=0 || index>=size)
			throw new Exception("Invalid Index");
		else if(index==0)
			return removeFirst();
		else if(index==size-1)
			return removeLast();
		else {
			Node n1=getNodeAt(index-1);
			Node n2=getNodeAt(index+1);
			int data=n1.next.data;
			n1.next=n2;
			size--;
			return data;
			
		}
		
	}

}
