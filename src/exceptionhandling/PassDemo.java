package exceptionhandling;

class InvalidPassException extends Exception
{
   public InvalidPassException(String message)	
   {
	   super(message);
   }
}

public class PassDemo 
{
	static void checkPass(String Username, int pass) throws InvalidPassException
	{ 
		if(!Username.equals("admin"))
		{
			throw new InvalidPassException("Invalid Username");
		}
		else if(pass!=1234)
		{
			throw new InvalidPassException("Invalid Password");
		}
		else
		{
			System.out.println("Valid Password :"+pass);	
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try
         {
		checkPass("admin",2345);
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
