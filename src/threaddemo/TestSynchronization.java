package threaddemo;

class Table
{
   synchronized public void printTable(int n)
   {
	  for(int i=1; i<=5; i++)
	  {
		  System.out.println(n*i);
		  
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

class MyThread1 extends Thread
{
    Table t;
    public MyThread1(Table t)
    {
    	this.t=t;
    }
    
    public void run()
    {
    	t.printTable(5);
    }
}

class MyThread2 extends Thread
{
    Table t;
    public MyThread2(Table t)
    {
    	this.t=t;
    }
    
    public void run()
    {
    	t.printTable(100);
    }
}
public class TestSynchronization {

	public static void main(String[] args) {
		Table t1=new Table();
		
		MyThread1 t2= new MyThread1(t1);
		
		MyThread2 t3= new MyThread2(t1);
		
		t2.start();
		t3.start();

	}

}
