package JavaTasks;

class Vehicle
{
	public void type()
	{
		System.out.println("Vehicle Type : Four Wheeler");
	}
}
class Car extends Vehicle
{
	public void car()
	{
		System.out.println("Car Model : Mercedes-Benz");
	}
}

public class SingleInheritanceEx {

	public static void main(String[] args) {
		Car c = new Car();
		c.type();
		c.car();
		
		//Car is a Vehicle
	}

}
