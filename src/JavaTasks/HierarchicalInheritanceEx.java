package JavaTasks;

class Vehiclee1
{
	public void travel()
	{
		System.out.println("Vehicle is used for Travelling");
	}
}
class Car1 extends Vehiclee1
{
	public void drive()
	{
		System.out.println("Car is used for Driving");
	}
}
class Bike extends Vehiclee1
{
    public void ride()
    {
    	System.out.println("Bike is used for Riding");
    }
}

public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		c1.drive();
		c1.travel();
		
		Bike b = new Bike();
		b.ride();
		b.travel();	

	}

}
