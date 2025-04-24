package maps;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "govind");
		m.put(2, "meghesh");
		m.put(3, "mukesh");
		m.put(4, "lekha");
//		m.put(5, "govind");
		System.out.println(m);
//		System.out.println(m.remove(3));
		System.out.println(m.get(1));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("govind"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		m.replace(1, "hello");
		m.replace(1, "hello", "govind");
		System.out.println(m);
	}

}
