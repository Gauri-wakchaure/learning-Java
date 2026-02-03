package collection;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Monday");
		h1.add("Tuesday");
		h1.add("Wednesday");
		h1.add("Thursday");
		h1.add("Friday");
		h1.add("Saturday");
		h1.add("Sunday");
		h1.add(null);
		
		System.out.println("HashSet Elements:"+h1);
		
		//---------------------------------------------------------
		
		LinkedHashSet<String> h2 = new LinkedHashSet<String>();
		h2.add("Monday");
		h2.add("Tuesday");
		h2.add("Wednesday");
		h2.add("Thursday");
		h2.add("Friday");
		h2.add("Saturday");
		h2.add("Sunday");
		
		System.out.println("LinkedHashSet Elements:"+h2);
		
		//----------------------------------------------------------
		
		TreeSet<String> h3 = new TreeSet<String>();
		h3.add("Monday");
		h3.add("Tuesday");
		h3.add("Wednesday");
		h3.add("Thursday");
		h3.add("Friday");
		h3.add("Saturday");
		h3.add("Sunday");
		
		System.out.println("Tree HashSet :"+h3);
		
		

	}

}
