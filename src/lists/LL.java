package lists;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		LinkedList<Object> l=new LinkedList<Object>();
		l.add(2);
		l.add("hello");
		l.add(56);
		l.add(54);
		l.add("main");
		System.out.println(l);
		l.addFirst(123);
		System.out.println(l);
		l.addLast(45);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}

}
