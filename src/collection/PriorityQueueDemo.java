package collection;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Cat");
        pq.add("Sparrow");
        pq.add("Dog");
        pq.add("Crow");
        pq.add("Parrot");
        
        System.out.println("Print Queue :"+pq);
        
        System.out.println("Print head of Queue :"+pq.peek());
        System.out.println("Print head of the Queue :"+pq.element());
        
        pq.poll();
        System.out.println("Remove head Element of Queue :"+pq);
        
        pq.remove();
        System.out.println("After removing print queue :"+pq);
        
        pq.offer("Lion");
        System.out.println("Print Queue After adding Element :"+pq);




	}

}
