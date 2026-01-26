package abstraction;

interface MyyInterface1
{
  default void show()
  {
	  printDetails();
	  System.out.println("Show Method");
  }
  
  default void display()
  {
	  System.out.println("display Method");
  }
  
  private void printDetails()
  {
	  System.out.println("Private Method");
  }
}


class PrivateInterface1 implements MyyInterface1
{
  public void name()
  {
	  System.out.println("Child Method");
  }
}

public class PrivateInterface {
   
	public static void main(String[] args) {
   PrivateInterface1 p = new PrivateInterface1();
   p.show();
   p.display();
   p.name();
  
   
   }

}
