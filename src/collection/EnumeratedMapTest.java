package collection;

import java.util.*;

enum colors1{Green, Saffron, Blue, Red, Yellow, Pitch}

public class EnumeratedMapTest {

	public static void main(String[] args) {
		
		EnumMap<colors1, String> map = new EnumMap<colors1, String>(colors1.class);
		
		map.put(colors1.Green, "1");
		map.put(colors1.Saffron, "2");
		map.put(colors1.Blue, "3");
		map.put(colors1.Red, "4");
		map.put(colors1.Yellow, "5");
		map.put(colors1.Pitch, "6");
		
		System.out.println(map);

	}

}
