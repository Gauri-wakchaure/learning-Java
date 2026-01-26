package abstraction;

interface Drawable
{
   public void draw();
   
   static int cube(int a)
   {
	   return a*a*a;
   }
   
   default void show()
   {
	   System.out.println("Default Method ");
   }
}

class Rectangle implements Drawable
{
  public void draw()
  {
     System.out.println("Drawing Rectangle");
  }
}
public class TestStaticInterface {

	public static void main(String[] args) {
    
		Drawable d = new Rectangle();
		d.draw();
		d.show();
		
		System.out.println(Drawable.cube(6));
		
	}

}
