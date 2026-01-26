package exceptionhandling;

public class StringIndex {

	public static void main(String[] args) {
     try {
		 String a ="Java";
			System.out.println("Print the Character :"+a.charAt(5));
     }
     catch(Exception e)
     {
			System.out.println("Invalid String Index");

     }
     finally
     {
			System.out.println("Finally Block Executed");

     }
	}

}
