package exceptionhandling;

class EmptyStringException extends Exception
{
   public EmptyStringException(String message)	
   {
	   super(message);
   }
}

public class StringDemo 
{
	static void checkMsg(String msg) throws EmptyStringException
	{ 
		if(msg==null)
		{
			throw new EmptyStringException("String should not be null");
		}
		else
		{
			System.out.println("Message :"+msg);		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
		    checkMsg(null);

         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
