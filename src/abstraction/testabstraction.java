package abstraction;

abstract class vehicle
{
   abstract void run();
   abstract void show();
   
   public void display()
   {
	   System.out.println("Non-Abstract Method");
   }
   
}
class Car extends vehicle
{
 public void run()
 {
		System.out.println("Bike is Running");

 }
 public void show()
 {
		System.out.println("Show Details");

 }
 

}

public class testabstraction {

	public static void main(String[] args) {
      vehicle v = new Car();
      v.run();
      v.display();
      
	}

}
