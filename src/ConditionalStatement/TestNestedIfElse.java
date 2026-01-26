package ConditionalStatement;

public class TestNestedIfElse {

	public static void main(String[] args) {
		{
			int num=0;
			
			if(num>=0)
			{
				if(num==0)
				{
				System.out.println("The number is Zero");
			}
			else
			{
				System.out.println("Positive number");

			}
			}
			else {
				System.out.println("Negative Number");
			}
		}
	}

}
