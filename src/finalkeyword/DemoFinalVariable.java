package finalkeyword;

public class DemoFinalVariable 
{
	final int no =92;
	public void display()
	{
		//no=300;  Final cannot be reassign
		System.out.println(no);

	}

	public static void main(String[] args)
	{
       DemoFinalVariable d= new DemoFinalVariable();   
       d.display();
	}

}
