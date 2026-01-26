package threaddemo;

public class DemoThreadLifeCycle extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThreadLifeCycle t= new DemoThreadLifeCycle();
		System.out.println("Born State :"+t.getState());
		
		t.start();
		System.out.println("Ready to Execute State :"+t.getState());
		
		System.out.println("Execution State :"+t.getState());
		
		System.out.println("Dead State :"+t.getState());

	}

}
