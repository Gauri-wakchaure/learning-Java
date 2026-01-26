package innerclass;

class OuterClass1
{
	static String msg = "Hello from Nested Static";
	
	static class testNestedStatic
	{
		public void showMsg()
		{
			System.out.println("Message : "+msg);
		}
	}
}
public class NestedStatic {

	public static void main(String[] args) {
		
	// create object of Static Nested
     OuterClass1.testNestedStatic test = new OuterClass1.testNestedStatic();
     test.showMsg();
	}

}
