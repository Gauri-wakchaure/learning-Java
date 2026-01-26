package exceptionhandling;

public class NullPointer {

	public static void main(String[] args) {
       
		try {
		String a=null;
		
		
		System.out.println("length :"+a.length());
		}
		catch(Exception e)
		{
			System.out.println("String Value is Null");
		}
	}

}
