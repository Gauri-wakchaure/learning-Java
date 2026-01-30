package collection;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) 
	{
	   Vector<String> v1 = new Vector<String>();
	   
	   v1.add("Apple");
	   v1.add("Banana");
	   v1.add("Mango");
	   v1.add("Guava");
	   v1.add("Strawberry");
	   v1.add("Papaya");
	   
	   System.out.println("Fruits :"+v1);
	   
	   v1.addElement("Watermelon");
	   System.out.println("Add Element :"+v1);
	   
	   System.out.println("Retrieve First Element :"+v1.firstElement());
	  
	   System.out.println("Retrieve Last Element :"+v1.lastElement());
	   
	   System.out.println("Random number :"+v1.elements());
	   
	   System.out.println("Retrieve Specific Element :"+v1.elementAt(3));
	   
	   System.out.println("Remove Element :"+v1.remove(3));
	   System.out.println(v1);
	   
	   v1.removeElementAt(4);
       System.out.println(v1);





	   
	   

	}

}
