package Set;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(5);
		ts.add(89);
		ts.add(9);
		System.out.println(ts);
//		System.out.println(ts.pollFirst());
//		System.out.println(ts.pollLast());
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(1));
		System.out.println(ts.lower(5));
		System.out.println(ts.floor(6));
		System.out.println(ts.ceiling(4));
		System.out.println(ts.headSet(5));
		System.out.println(ts.tailSet(5));
		System.out.println(ts.subSet(1, 9));
		System.out.println(ts.descendingSet());
	}
}
