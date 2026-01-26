package threaddemo;

class printDetails
{
	public static synchronized void printMessage(String s)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Good Evening...");
			System.out.println(s);
			
			try
			  {
				  Thread.sleep(500);
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
			
		}
	}
}

class MyThread11 extends Thread
{
  printDetails d;
  String s;
  public MyThread11(printDetails d, String s)
  {
	  this.d=d;
	  this.s=s;
  }
  
  public void run()
  {
	  d.printMessage(s);
  }
}
public class TestStaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDetails obj1=new printDetails();
		
		printDetails obj2=new printDetails();
		
		MyThread11 t1 = new MyThread11(obj1, "Gauri");
		
		MyThread11 t2 = new MyThread11(obj2, "Wakchaure");
		
		t1.start();
		t2.start();
		
		
	}

}
