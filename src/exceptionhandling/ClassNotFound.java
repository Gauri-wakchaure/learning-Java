package exceptionhandling;

public class ClassNotFound {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
       try
       {
		Class.forName("com.exam.test");
       }
       catch(Exception e)
       {
     	  System.out.println("Class Not Found");

       }
	}

}
