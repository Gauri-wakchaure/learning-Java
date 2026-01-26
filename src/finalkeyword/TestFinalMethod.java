package finalkeyword;

class FinalTest
{
  final void display(int a)
  {
		System.out.println("Final method");

  }
}

public class TestFinalMethod 
{
	public void display1(int a)
	{
		System.out.println("Child class final method");

	}

	public static void main(String[] args)
	{
      FinalTest f = new FinalTest();
      f.display(45);
  	 
      
      TestFinalMethod t = new TestFinalMethod();
      t.display1(75);
	}

}
