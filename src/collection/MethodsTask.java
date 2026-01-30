package collection;
import java.util.ArrayList;
import java.util.List;

public class MethodsTask {

	public static void main(String[] args) {
        
		ArrayList A1 = new ArrayList();
		
		A1.add("Pune");
		A1.add("Banglore");
		A1.add("Nagpur");
		A1.add("Mumbai");
		A1.add("Dehli");
		
		System.out.println("Original array List:"+A1);
		
		System.out.println("Check array List is Empty or not:"+A1.isEmpty());
		
		System.out.println("Returns index of last element array :"+A1.lastIndexOf("Mumbai"));
		
		System.out.println("Size of Array List :"+A1.size());
		
		System.out.println("Create a copy of Array list :"+A1.clone());
		
		Object[] array = A1.toArray();
		System.out.println("Array Elements :");
		for(Object obj : array)
		{
			System.out.println(obj);
        }
		
		List subList = A1.subList(1, 3);
		
		System.out.println("Original List :"+ A1);
		System.out.println("Sub List :"+ subList);


	}

}
