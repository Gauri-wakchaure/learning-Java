package collection;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args)
	{
		ArrayDeque<String> ad = new ArrayDeque<String>();
		
		ad.add("Mercedes");
		ad.add("Fortuner");
		ad.offer("Swift");
		ad.add("Mahindra");
		ad.add("Hundai");
		
		System.out.println("Print Elements :"+ad);
		
		ad.offer("RangeRover");
		System.out.println("Print After adding Elements :"+ad);
		
		ad.offerFirst("Lamborgini");
		System.out.println("After adding First Elements :"+ad);
		ad.offerLast("BMW");
		System.out.println("After adding Last Elements :"+ad);
		
		ad.remove();
		System.out.println("After Removing Elements :"+ad);
		
		ad.poll();
		System.out.println("After Removing Elements :"+ad);
		
		ad.pollFirst();
		System.out.println("After Removing 1st Elements :"+ad);
		
		ad.pollLast();
		System.out.println("After Removing Last Elements :"+ad);
		
		ad.offerFirst("Mercedes-Benz");
		System.out.println("Print After adding Elements :"+ad);
		
		




		

	}

}
