package collection;

import java.util.*;

public class MapMethods {

	public static void main(String[] args) {

      HashMap m1 = new HashMap();
		
		m1.put(1, "Gauri");
		m1.put(2, "Sakshi");
		m1.put(3, "Rani");
		m1.put(4, "Prajkta");
		m1.put(5, "Dipali");
		m1.put(6, "Tanvi");
		
		System.out.println("HashMap : "+m1);
		
		Set s = m1.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		m1.remove(3);
		System.out.println("After Removing HashMap : "+m1);
		
		System.out.println("Return keys from HashMap : "+m1.keySet());
		
		System.out.println("Return key is present or not in HashMap : "+m1.containsKey(67));
		
		System.out.println("Return value is present or not in HashMap : "+m1.containsValue("Gauri"));
		
		System.out.println("Get Value of 4th Key from HashMap : "+m1.get(4));
		
		m1.replace(4, "Riya");
		System.out.println("Replace value of element HashMap : "+m1);

	}

}
