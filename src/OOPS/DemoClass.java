package OOPS;

class Person
{
	public void walk()
	{
		System.out.println("Person is Walking");
	}
}

class Person1
{
	public void drink()
	{
		System.out.println("Person is drinking water");
	}
}

public class DemoClass {

	public static void main(String[] args) {
     
		Person p1 =  new Person();
		p1.walk();
		
		Person p2 =  new Person();
		Person p3 =  new Person();
		Person p4 =  new Person();
		
		p2.walk();
		p3.walk();
		p4.walk();
		
		Person1 p = new Person1();
		p.drink();
		



	}

}
