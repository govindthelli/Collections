package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collection_methods {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
		System.out.println(a);
		Collections.sort(a);
//		Collections.reverse(a);
//		System.out.println(a);
//		Collections.shuffle(a);
//		System.out.println(a);
		System.out.println(Collections.min(a));
		System.out.println(Collections.max(a));
		
//		searching element 11 in list a
		int i=Collections.binarySearch(a,3);
		System.out.println(i);
		
//		------>swapping first element to last place and vice versa
		Collections.swap(a, 0, a.size()-1);
		System.out.println(a);
		
		
		
		ArrayList<String> al=new ArrayList<>(Arrays.asList("this","is","sindhu","samula"));
		System.out.println(al);
		
//		Collections.fill(al,"sindhu");
//		System.out.println(al);
//		
		
		ArrayList<String> a2=new ArrayList<>(Arrays.asList("techm","jfs","trainee","sindhu"));
		System.out.println(a2);
		
//		------->copying al to a2
		Collections.copy(a2, al);
		System.out.println(al);
		System.out.println(a2);
		
//		----->frequency of given element
		System.out.println(Collections.frequency(al, "sindhu"));

	}

}
