package OOPS;

class Animal
{
   String name = "Generic Animal";	
}

class Dog extends Animal 
{
  public void printName()
  {
	  String name = "Marfi";
	  System.out.println("Child name : "+name);
	  System.out.println("Parent name : "+super.name);

  }
}

public class CallingParentClassObject {

	public static void main(String[] args) {
       Dog d = new Dog();
       d.printName();
	}

}
