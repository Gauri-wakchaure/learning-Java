package collection;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
     ArrayList a3 = new ArrayList();
		
		a3.add(10);
		a3.add(45);
		a3.add(90);
		a3.add(85);
		a3.add(60);
		
		System.out.println("Original array List:"+a3);
		
		System.out.println("Index of 85 in array List:"+a3.indexOf(85));

		System.out.println("96 is available in  array List:"+a3.contains(96));

		System.out.println("90 is available in  array List:"+a3.contains(90));
		
		a3.clear();
		System.out.println("Clearing all elements from array List:"+a3);
		
	


	}

}
