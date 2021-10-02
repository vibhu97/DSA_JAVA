package linkedlist;

public class Main {
	public static void main(String[] args) throws Exception {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.append(0);
		//sl.removeAt(0);
		sl.append(10);
		sl.append(20);
		sl.append(30);
		sl.removeAt(2);
		sl.traverse();
		
	}

}
