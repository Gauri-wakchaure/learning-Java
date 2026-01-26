package constructor;

class Student
{
  	String name;
  	int age;
  	
  	Student()
  	{
  		name = "Swara";
  		age = 16;
  		System.out.println("Default Constructor Called :");
  		
  	}
}

public class DemoDefault {

	public static void main(String[] args) {
     Student s = new Student();
     System.out.println(s.name);
     System.out.println(s.age);

	}

}
