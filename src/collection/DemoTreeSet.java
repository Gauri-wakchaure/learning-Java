package collection;

import java.util.*;

public class DemoTreeSet {

	public static void main(String[] args) {
     
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(156);
		t1.add(654);
		t1.add(628);
		t1.add(906);
		t1.add(1656);
		t1.add(173);
		
		System.out.println(t1);
		t1.pollFirst();
		System.out.println("Pool First : "+t1);
		
		//t1.pollLast();
		//System.out.println("Pool Last : "+t1);

		System.out.println("Descending Set : "+t1.descendingSet());
		
		System.out.println("Headset Method: "+t1.headSet(628, true));
		System.out.println("Tailset Method: "+t1.tailSet(628, true));
		
		System.out.println("Subset Method: "+t1.subSet(173, true, 906, true));
		
		System.out.println("Higher Method: "+t1.higher(628));

		System.out.println("Lower Method: "+t1.lower(628));
		
		System.out.println("Ceiling of 256: "+t1.ceiling(256));
		System.out.println("Floor of 190: "+t1.floor(190));



		
		


	}

}
