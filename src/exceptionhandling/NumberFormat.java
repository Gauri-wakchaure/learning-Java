package exceptionhandling;

public class NumberFormat {

	public static void main(String[] args) {
   
		try {
		String s= "abc";
		
		int num = Integer.parseInt(s);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Number Format");
		}
	}

}
