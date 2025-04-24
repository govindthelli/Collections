package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "ONE");
		m.put(2, "TWO");
		m.put(3, "Three");
		m.put(4, "Four");
		m.put(5, "Five");
		System.out.println(m);
		System.out.println(m.get(3));
	}

}
