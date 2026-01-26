package exceptionhandling;

public class ArrayIndex {

	public static void main(String[] args) {

		
		try 
		{
			int a[]= {10, 20, 30, 40, 50};
			System.out.println(a[7]);
		}
		catch(Exception e)
		{
			System.out.println("array index out of range");

		}
		System.out.println("Rest of Code");

	
	
	}

}
