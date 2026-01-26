package exceptionhandling;

class NegativeNumException extends Exception
{
  public NegativeNumException(String Message)
  {
	  super(Message);
  }
}
public class NumDemo 
{
	static void checkNum(int num) throws NegativeNumException
	{
		if(num<0)
		{
			throw new NegativeNumException("Number is Negative");
		}
		else
		{
			System.out.println("Positive Number :"+num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
		checkNum(-6);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}

}
