package collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList a3 = new ArrayList();
		
		a3.add(10);
		a3.add(45);
		a3.add(90);
		a3.add(85);
		a3.add(60);
		
		System.out.println("Original array List:"+a3);
		
		// Sorting Array 
		Collections.sort(a3);
		
		System.out.println("  Ascending Sorded array List:"+a3);
		
        Collections.reverse(a3);        
		System.out.println("  Descending Sorded array List: "+a3);


		
		ArrayList a4 =new ArrayList();
		a4.add("Rabbit");
		a4.add("Sparrow");
		a4.add("Krow");
		a4.add("Cow");
		a4.add("Dog");
		
		System.out.println(" \nOriginal array List: "+a4);
		
		Collections.sort(a4);
		
		System.out.println("  Ascending Sorded array List:"+a4);
		
        Collections.reverse(a4);
        
		System.out.println("  Descending Sorded array List:"+a4);

        a4.remove(2);
		System.out.println("After Removing array List element:"+a4);
         
		a4.remove("Cow");
		System.out.println("After Removing array List Element:"+a4);
		
		a4.addAll(a3);
		System.out.println("Add All array List:"+a4);
		
		a4.removeAll(a3);
		System.out.println("After using Remove All array List:"+a4);
		
		




	}

}
