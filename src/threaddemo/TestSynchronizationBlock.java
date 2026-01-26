package threaddemo;

class Table1
{
   public void printTable(int n)
   {  
	  synchronized(this)
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
	  
	  for(int j=1; j<=5; j++)
	  {
		  System.out.println("Other Calculation in printable method");
		  
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

class MyThread extends Thread
{
    Table1 t;
    public MyThread(Table1 t1)
    {
    	this.t=t1;
    }
    
    public void run()
    {
    	t.printTable(5);
    }
}

class MyThread3 extends Thread
{
    Table1 t;
    public MyThread3(Table1 t2)
    {
    	this.t=t2;
    }
    
    public void run()
    {
    	t.printTable(100);
    }
}

public class TestSynchronizationBlock {

	public static void main(String[] args) {
		 
       Table1 t1=new Table1();
		
		MyThread t2= new MyThread(t1);
		
		MyThread3 t3= new MyThread3(t1);
		
		t2.start();
		t3.start();

	}

}
