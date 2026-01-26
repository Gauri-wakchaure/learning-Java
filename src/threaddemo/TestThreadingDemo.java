package threaddemo;

public class TestThreadingDemo implements Runnable
{
	public void run()
	{
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) 
	{
	
		Runnable r=new TestThreadingDemo();
        Thread t1= new Thread(r, "My Thread1");
        t1.start();
   
        String s1 =t1.getName();
        System.out.println(s1);
	
	
	}

}
