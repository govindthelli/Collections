package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		q.add("hello");
		q.add("one");
		q.add("linked");
		q.add("appear");
		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q.remove());
//		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
	}

}
