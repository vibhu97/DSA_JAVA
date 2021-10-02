package linkedlist;

public class Main {
	public static void main(String[] args) throws Exception {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addAt(0, 0);
		sl.addAt(1, 10);
		sl.addAt(2, 20);
		sl.addAt(3, 30);
		sl.addAt(2, 40);
		sl.traverse();
	}

}
