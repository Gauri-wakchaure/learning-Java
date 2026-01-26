package exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	  System.out.println("Thank You");
  	  
  	  try 
  	  {
  		int a[]=new int[5];
  		  try
  		  {
  			  
  			  a[7]=30/5;
  		  }
  		  catch(ArithmeticException e)
  		  {
  		  	  System.out.println(e);
  		  	  System.out.println("Can not divisible by Zero");

  			
  		  }
  		  String n = null;
  	  	  System.out.println(n.length());

  	  }
  	  catch(Exception e)
  	  {
  	  	  System.out.println(e);

  	  }

	}

}
