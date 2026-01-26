package innerclass;

class Demo
{
  public Demo()
  {
	 System.out.println("Inside demo Constructor");
	 
	 class Inner
	 {
		 public void show()
		 {
			 System.out.println("Hello From Local Inner Class");
		 }
	 }
	 
	 Inner c = new  Inner();
	 c.show();
  }
}

public class InConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Demo d = new Demo();
      
      
      
	}

}
