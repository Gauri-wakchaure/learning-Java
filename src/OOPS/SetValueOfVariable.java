package OOPS;

class Human
{
	//data members
	String name;
	int age;
	
	public void displayInfo() // member function
	{
		System.out.println("Name Of Human is :"+name);
		System.out.println("Age Of Human is :"+age);
	}
}

public class SetValueOfVariable {

	public static void main(String[] args) {
		//creating the object
		Human h = new Human();
		h.name = "Gauri";          //setting data member
		h.age = 21;
		
		h.displayInfo();  //calling member function
		
		System.out.println(h.name);  //display
		System.out.println(h.age);

	}

}
