package collection;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
	 
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(12);
		h1.add(10);
		h1.add(86);
		h1.add(90);
		h1.add(65);
		h1.add(34);
		h1.add(59);
		
	  System.out.println("HashSet Elements:"+h1);
		
	  System.out.println("Create Same Copy of HashSet:"+h1.clone());
	  
	  System.out.println("Check Set Contains Element or Not :"+h1.contains(86));
	  
	  System.out.println("Check Set is Empty or Not :"+h1.isEmpty());
		
	  h1.remove(34);
	  System.out.println("HashSet After Removing Element:"+h1);
	  
	  System.out.println("Size of HashSet :"+h1.size());
		
	  h1.clear();
	  System.out.println("Clear All HashSet Elements:"+h1);
		
	}
}
