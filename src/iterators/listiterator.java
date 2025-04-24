package iterators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.addAll(Arrays.asList(20,24,34,13,11,67,54));
		System.out.println(a1);
	    ListIterator<Integer> l=a1.listIterator();
	    while(l.hasNext())
	    {
	    	System.out.println("index:"+l.nextIndex()+" name:"+l.next());
	    }
	    while(l.hasPrevious())
	    {
	    	System.out.println("index:"+l.previousIndex()+" name:"+l.previous());
	    }
//	    ------>update
	    while(l.hasNext())
	    {
	    	Integer i=l.next();
	    	if(i==13)
	    	{
	    		l.set(53);
	    	}
//	    	------>remove
	    	if(i==11)
	    	{
	    		l.remove();
	    	}
	    }
	    System.out.println(a1);

	    
	    
	    
	}

}