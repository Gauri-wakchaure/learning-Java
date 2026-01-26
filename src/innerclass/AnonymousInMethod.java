package innerclass;

class test
{
 public void SayHello()
 {
	 System.out.println("Hello My name is Gauree");
 }
}
public class AnonymousInMethod
{
	public void show()
	{
		test t1 = new test()
		{
            public void SayHello()
            {
            	System.out.println("Hello from Anonymous method");
            }
		};
	t1.SayHello();
				
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInMethod a = new AnonymousInMethod();
		a.show();
       	}

}
