package threaddemo;

public class TestThread extends Thread
{
	public void run()    // use to create thread
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {

		TestThread t= new TestThread();
		
		t.start();       //use to start thraed
		     
	}

}
