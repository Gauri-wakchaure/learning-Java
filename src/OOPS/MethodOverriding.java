package OOPS;

class Addition
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

class TestAddition extends Addition
{
	public int add(int a, int b)
	{   
		System.out.println("Calling parent class method :" +super.add(12, 25));
		return a+b;
	}
}

class DemoAddition extends Addition
{
	public int add(int a, int b)
	{
		return a+b;
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
        Addition a;
        a = new TestAddition();
        System.out.println("Child class property Testaddition :" +a.add(30, 70));
       
        a = new DemoAddition();
        System.out.println("Child class property DemoAddition :" +a.add(30, 40));

        
	}

}
