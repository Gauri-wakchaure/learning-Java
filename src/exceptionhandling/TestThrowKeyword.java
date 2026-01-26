package exceptionhandling;

public class TestThrowKeyword 
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not allowed to vote");
		}
		else
		{
			System.out.println("Valid Voting Age");	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validate(55);
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		System.out.println("Rest of code");	

	}


	}


