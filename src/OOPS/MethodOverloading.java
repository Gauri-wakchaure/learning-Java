package OOPS;

class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public float add(float a, float b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) 
	{
      Calculator c = new Calculator();
      int res = c.add(34, 54);
      int res1 = c.add(43, 32, 10);
      float res2 = c.add(43.6F, 69.5F);
      double res3 = c.add(32.76547, 32.654321);
      
      System.out.println("1st Method : " + res);
      System.out.println("2nd Method : "+res1);

      System.out.println("3rd Method : "+res2);
      System.out.println("4th Method : "+res3);
   	}
}
