package threaddemo;

public class SetPriorityThread extends Thread
{
	public void run()
	{
		System.out.println("Thread Executing");
	}

	public static void main(String[] args) {
		SetPriorityThread s1=new SetPriorityThread();
		SetPriorityThread s2=new SetPriorityThread();
		SetPriorityThread s3=new SetPriorityThread();
		
		System.out.println(s1.getPriority());
		System.out.println(s2.getPriority());
		System.out.println(s3.getPriority());
		
		//s2.setPriority(MAX_PRIORITY);
		
		s2.setPriority(8);
		s1.setPriority(3);
		s3.setPriority(9);
		System.out.println(s1.getPriority());
		System.out.println(s2.getPriority());

		System.out.println(s3.getPriority());


		s1.start();
		s2.start();
		s3.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		




		

	}

}
