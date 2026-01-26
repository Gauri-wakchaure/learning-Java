package innerclass;

abstract class Greeging
{
   abstract void SayHello();
   
}
public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeging greet = new Greeging()
		{
			public void SayHello()
			{
				System.out.println("Hello from Anonymous Class");
			}
		};
				
		 greet.SayHello();
	}

}
