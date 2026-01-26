package finalkeyword;

class Bank 
{
 final void processTransaction()
  {
		System.out.println("Process Bank Transaction");

  }
}

public class DemoFinalMethod extends Bank
{
	
	public void payBill()
	{
		System.out.println("Calling from Final method");

	}

	public static void main(String[] args)
	{
     DemoFinalMethod d = new DemoFinalMethod();
     d.payBill();
     d.processTransaction();
	}

}
