package threaddemo;

class customer
{
  int amount = 50000;
  
  synchronized void withdraw(int amount)
  {
	  System.out.println("Going to withdraw...");
	  
	  if(this.amount<amount);
	  {
		  System.out.println("less balance, Waiting for deposite...");
		  
		  try 
		  {
		       wait();
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  
	  }
	  this.amount-=amount;
	  
	  System.out.println("Withdraw Completed...");
  }
  synchronized void deposite(int amount)
  {
	  System.out.println("Going to Deposite...");
	  
      this.amount+=amount;
	  
	  System.out.println("Deposite Completed...");
	  
	  notify();
  }
 
}
public class DemoInterThreadCommunication {

	public static void main(String[] args) 
	{
		final customer c =new customer();
		
		// withdraw
		new Thread()
		{
			public void run() 
			{
				c.withdraw(15000);
			}
		}.start();
		
		// deposite 
		new Thread()
		{
			public void run() 
			{
				c.deposite(10000);
			}
		}.start();


	}
}



