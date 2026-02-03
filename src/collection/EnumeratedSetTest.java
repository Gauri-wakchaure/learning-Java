package collection;

import java.util.*;

enum colors{Green, Saffron, Blue, Red, Yellow, Pitch}

enum days{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}

enum city{Pune, Mumbai, Banglore, Surat, Nagpur}

public class EnumeratedSetTest {

	public static void main(String[] args) {
		
		Set<colors> s1 = EnumSet.allOf(colors.class);
		
		System.out.println("Name of Color : "+s1);
		
        Set<days> s2 = EnumSet.of(days.Monday, days.Thursday, days.Tuesday);
		
		System.out.println("Name of Days : "+s2);
		
        Set<days> s3 = EnumSet.noneOf(days.class);
		
		System.out.println("Name of Color : "+s3);
		
        List<city> l1 = List.of(city.Pune, city.Banglore);
        
        Set<city> s4 = EnumSet.copyOf(l1);
        
		System.out.println("Name of Cities : "+s4);

	}

}
