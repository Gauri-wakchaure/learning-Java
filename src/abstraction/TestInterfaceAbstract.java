package abstraction;

interface Shape
{
   public void draw();
   public void display();
   
   default void run()
   {
	   System.out.println("Default Method");
   }
}

class Circle implements Shape
{
  public void draw()
  {
	  System.out.println("Drawing circle");
  }
  
  public void display()
  {
	  System.out.println("Show circle");
  }
  
  public void Square()
  {
	  System.out.println("Drawing Square");
  }


}
public class TestInterfaceAbstract {

	public static void main(String[] args) {
          Shape s = new Circle();
          s.draw();
          s.display();
          s.run();
        
          Circle c = new Circle();
          c.Square();
	}

}
