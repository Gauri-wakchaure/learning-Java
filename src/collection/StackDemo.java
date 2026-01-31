package collection;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack<Integer> s1= new Stack<Integer>();
		
		boolean res = s1.empty();
		System.out.println("Is stack Empty :"+res);
		
		s1.push(4);
		s1.push(46);
		s1.push(98);
		s1.push(60);
		s1.push(43);
		System.out.println("Elements of Stack :"+s1);
		
		s1.pop();
		System.out.println("Pop 1st Element :"+s1);
		s1.pop();
		s1.pop();
		System.out.println("Pop 2nd & 3rd Element :"+s1);
		
		System.out.println("Top Element of the Stack :"+s1.peek());
		
		System.out.println("Index of 50 Elements of Stack :"+s1.search(46));
		
		System.out.println("Index of 50 Elements of Stack :"+s1.search(50));	

	}

}
