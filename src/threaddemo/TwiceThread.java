package threaddemo;

public class TwiceThread extends Thread
{
	public void run()
	{
		System.out.println("Thread Exception");
	}

	public static void main(String[] args) 
	{
		TwiceThread t1= new TwiceThread();
		t1.start();
	}

}
