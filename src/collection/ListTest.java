package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		
		a1.add(101);
		a1.add("Gauri");
		a1.add("Female");
		a1.add("Pune");
		a1.add(40.53);
		
		a1.add(1, "Pari");
		
		System.out.println("Original array list :" +a1);
		
		//Update element at specific element
		  a1.set(1, "Raj");  
		
		
		System.out.println("Updated array list :" +a1);
		
		// Get element from Particular location
		System.out.println("Get element of index 4 : "+a1.get(4));

		
//======================================================
		
		ArrayList a2 = new ArrayList();
		
		a2.add(102);
		a2.add("Radha");
		a2.add("female");
		
		//Copies data from first list
		 a1.addAll(a2);   
		
		System.out.println(a1);
		
		
	/*	Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		} */
		
		

	}

}
