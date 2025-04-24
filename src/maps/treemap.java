package maps;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> t=new TreeMap<Integer, String>();
		t.put(1, "govind");
		t.put(2, "meghesh");
		t.put(3, "mukesh");
		t.put(4, "lekha");
		System.out.println(t);
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.higherKey(3));
		System.out.println(t.lowerKey(3));
		System.out.println(t.floorKey(3));
		System.out.println(t.ceilingKey(3));
		t.remove(2);
		System.out.println(t);
	}

}
