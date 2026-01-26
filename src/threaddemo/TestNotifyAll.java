package threaddemo;

class NotTest
{
  synchronized void waitingMethod()
  {
	  System.out.println(Thread.currentThread().getName()+ " is Waiting");
	  
	  try
	  {
		  wait();
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  System.out.println(Thread.currentThread().getName()+ " resumed");

  }
  
  synchronized void NotifyMethod()
  {
	  System.out.println("Notify All Method");
	  notifyAll();
	  
  }
}

class MyThreadDemo1 extends Thread
{
  NotTest t;
  public MyThreadDemo1(NotTest t)
  {
	  this.t=t;
  }
  public void run()
  {
	  t.waitingMethod();
  }
}

public class TestNotifyAll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 NotTest obj = new  NotTest();
		 
		 MyThreadDemo1 t1= new MyThreadDemo1(obj);
		 
		 MyThreadDemo1 t2= new MyThreadDemo1(obj);
		 
		 t1.setName("thread - 1");
		 t2.setName("thread - 2");
		 
		 t1.start();
		 t2.start();
		 		 
		 Thread.sleep(1000);
		 
		 obj.NotifyMethod();
		 
	}

}
