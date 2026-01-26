package superkeyword;

class parent
{
   int x = 10;
   
}

class child extends parent
{
	int y= 20;
	public void display()
	{
		System.out.println("Y : "+y);

		System.out.println("X : " +super.x);
		
		System.out.println(x);


	}
	
}
public class CallInstanceVariable {

	public static void main(String[] args) {
   child c = new child();
   c.display();
	}

}
