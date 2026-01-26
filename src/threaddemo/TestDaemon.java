package threaddemo;

public class TestDaemon extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())   //t1.isDeamon
		{
		  System.out.println("Daemon thread Executed");
		}
		else
		{		
		  System.out.println("User thread Executed");
		}
	}

	public static void main(String[] args) {
		
		TestDaemon t1= new TestDaemon();
		TestDaemon t2= new TestDaemon();
		TestDaemon t3= new TestDaemon();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();


	}

}
