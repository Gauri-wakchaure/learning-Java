package inheritance;

class Device    //Parent class
{
	public void turnOn()
	{
		System.out .println("Device is turn on");
	}
}
class Phone extends Device    //child class
{
	public void call()
	{
		System.out .println("Phone is making call");
	}
}
class Laptop extends Device       //child class
{
	public void coding()
	{
		System.out .println("Laptop is used for Coding");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.turnOn();
		
		Laptop lp = new Laptop();
		lp.coding();
		lp.turnOn();
 
	}

}
