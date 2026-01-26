package exceptionhandling;

class InvalidAgeException extends Exception
{
   public InvalidAgeException(String message)	
   {
	   super(message);
   }
}

public class AgeDemo 
{
	static void checkAge(int age) throws InvalidAgeException
	{ 
		if(age<18)
		{
			throw new InvalidAgeException("Age must be greater than 18");
		}
		else
		{
			System.out.println("Valid age :"+age);		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
		checkAge(15);
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
