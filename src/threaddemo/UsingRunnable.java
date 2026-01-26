package threaddemo;

class ThreadDemo implements Runnable
{
    public void run()
    {
    	System.out.println("Thread is Running");
    }
}

public class UsingRunnable 
{
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		
		//t1.run();
		
		Thread t2 =new Thread(t1);  //create object of thread class & gives it reference of child class
		t2.start();
	}

}
