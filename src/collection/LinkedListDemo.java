package collection;
import java.util.*;
public class LinkedListDemo {
   public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Pune");
		l1.add("Mumbai");
		l1.add("Dehli");
        System.out.println("Print the list :"+l1);
       
        l1.addFirst("Surat");
        System.out.println("Add Element at first Position :"+l1);
        
        l1.addLast("Jaipur");
        System.out.println("Add Element at last Position :"+l1);
        
        l1.push("Nashik");
        System.out.println("Push Element at first Position :"+l1);
        
        l1.offer("Udaipur");
        System.out.println("Add Element :"+l1);
        
        l1.offerFirst("Hydrabad");
        System.out.println("Add Element at First:"+l1);
        
        l1.offerLast("Solapur");
        System.out.println("Add Element at Last:"+l1);
        
        System.out.println("Element Get from Particular index :"+l1.get(3));
        System.out.println("Element Get from First index :"+l1.getFirst());
        System.out.println("Element Get from Last index :"+l1.getLast());
        
        System.out.println("Peek Returns First Element :" +l1.peek());
        System.out.println("PeekFirst Returns First Element :" +l1.peekFirst());
        System.out.println("PeekLast Returns Last Element :" +l1.peekLast());

        System.out.println("Removes Element at particular position :"+l1.remove(2));
        System.out.println(l1);
        
        System.out.println("Remove First Element:"+l1.pollFirst());
        System.out.println("Remove Last Element :"+l1.pollLast());
            
	}

}
