package exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  	  System.out.println("Welcome to Exception");
  	  try
  	  {
  		  int a[]= new int[4];
  		  a[3]= 20/10;
  	  }
  	  catch(ArithmeticException e)
  	  {
    	  System.out.println(e);
    	  System.out.println("Cannot Divisible By Zero");

    	  

  	  }
  	catch(ArrayIndexOutOfBoundsException e)
  	  {
    	  System.out.println(e);
    	  System.out.println("Invalid Array Index");
  	  }
  	catch(Exception e)
  	  {
    	  System.out.println(e);

  	  }

	  System.out.println("Rest of Code ");

	}

}
