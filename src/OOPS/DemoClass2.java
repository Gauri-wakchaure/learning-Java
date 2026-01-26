package OOPS;

class Student
{
	static void name()
	{
		System.out.println("This is Student Property");
	}
}

public class DemoClass2 
{
	public static void display()
	{
		System.out.println("This is user defined method");
	}
	
		public static void goOut()
		{
			System.out.println("This is Static Method");
		}
	

	public static void main(String[] args) 
	{
       //DemoClass2 d = new DemoClass2();
		//d.display();
       display();
       goOut();
      
       Student.name();
	}

}
