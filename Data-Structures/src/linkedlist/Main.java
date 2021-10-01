package linkedlist;

public class Main {
	public static void main(String[] args) throws Exception {
		SinglyLinkedList sl=new SinglyLinkedList();
		//System.out.println(sl.getFirst());
		
		System.out.println(sl.getAt(1));
		sl.add(0);
		sl.append(10);
		sl.append(20);
		System.out.println(sl.getAt(1));
		sl.append(30);
		sl.append(40);
		sl.append(50);
		sl.add(60);
		//System.out.println(sl.getAt(1));
		//System.out.println(sl.getFirst());
		//System.out.println(sl.getLast());
		System.out.println(sl.getAt(0));
		sl.traverse();
	}

}
