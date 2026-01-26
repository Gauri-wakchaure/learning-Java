package finalkeyword;

final class A
{
	public void print()
	{
		System.out.println("Parent Final Class Called");

	}
	
}

public class TestFinalClass 
 {
	public void print1()
	{
		System.out.println("Child Final class called");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		TestFinalClass t = new TestFinalClass();
		t.print1();
	
		}

}
