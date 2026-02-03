package collection;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) 
	{
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

//-------------------------------------------------------------------------
		
       LinkedHashMap m2 = new LinkedHashMap();
		
		m2.put(1, "Monday");
		m2.put(2, "Tuesday");
		m2.put(3, "Wednesday");
		m2.put(4, "Thursday");
		m2.put(5, "Friday");
		m2.put(6, "Saturday");
		
		System.out.println("LinkedHashMap : "+m2);
		
		Set s1 = m2.entrySet();
		
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
//-----------------------------------------------------------------------------------
		
       
		TreeMap m3 = new TreeMap();
		
		m3.put(1, "Gauri");
		m3.put(2, "Sakshi");
		m3.put(3, "Rani");
		m3.put(4, "Prajkta");
		m3.put(5, "Dipali");
		m3.put(6, "Tanvi");
		
		System.out.println("TreeMap : "+m3);
		
		Set s2 = m3.entrySet();
		
		Iterator itr1 = s2.iterator();
		while(itr1.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr1.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}

	}

}
