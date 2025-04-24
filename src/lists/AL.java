package lists;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
//		ArrayList<Object> a1=new ArrayList<>();
		a.add("A");
		a.add(67);
		a.add("hello");
		a.add(43);
		a.add("Main");
		System.out.println(a);
		a.add(2, 23);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		System.out.println(a.get(4));
		a.set(2, 101);
		System.out.println(a);
	}

}
