package OOPS;

interface Test
{
    public void slow();
    
}

interface Test1 
{
    public void slow1();
    
}

class Father 
{
  public void name()
  {
	  System.out.println("Core Java");
  }
}
class Test2 extends Father implements Test   
{
    public void slow1()
    {
    	System.out.println("Java");
    }
    public void slow()
    {
    	System.out.println("Java Programming");

    }
    public void slow3()
    {
    	System.out.println("Java Programming Language");

    }

}


public class Demo {

	public static void main(String[] args) {
     
		Test2 t = new Test2();
		t.slow();
		t.slow1();
		t.slow3();
		t.name();
	}

}
