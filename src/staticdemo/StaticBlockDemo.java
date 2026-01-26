package staticdemo;

public class StaticBlockDemo 
{
	int a;
	static int b;
	
	public StaticBlockDemo()
	{
		
	}
	
	static
	{
		b=10;
		System.out.println("Static block Executed");
	}
	
	public void show()
	{
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Executed");
		
		StaticBlockDemo d1 = new StaticBlockDemo();
		d1.a = 20;
     	d1.show();
				

	}

}
