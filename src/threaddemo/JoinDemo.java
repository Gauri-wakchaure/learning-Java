package threaddemo;

public class JoinDemo extends Thread
{
	public static void main(String[] args) {
        
		Thread t1 = new Thread(); 
		{
		    System.out.println("Processing...");
		}

		t1.start();

		try {
		    t1.join();   // Main thread waits for t1 to complete
		} catch (InterruptedException e) {
		    System.out.println("Thread interrupted");
		}

		System.out.println("Execution continues after t1 finishes");

	}

}
