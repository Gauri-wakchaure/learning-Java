package exceptionhandling;

public class DemoThrowThrows
{
	static void withdraw(int balance, int amount) throws Exception
	{
		if (amount > balance)
		{
			throw new Exception("Insufficient Balance");
		}
		System.out.println("Collect Your Money");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
		withdraw(8000, 6000);
     }
     catch(Exception e)
     {
         System.out.println("Transaction failed :"+e.getMessage());
         //System.out.println(e);


     }
     System.out.println("Rest of Code ");

	}

}
