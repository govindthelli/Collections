package Set;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		System.out.println(h);
		h.remove("B");
		System.out.println(h);
		System.out.println(h.size());
	}

}
