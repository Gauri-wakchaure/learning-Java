package inheritance;

class Person
{
  public void showName()
  {
	  System.out.println("Name : Gauri Wakchaure");
  }
}

class Employee extends Person
{
  public void showJob()
  {
	  System.out.println("Job : Software Developer");
  }
}


public class SingleInheritance {

	public static void main(String[] args) {
           Employee emp = new Employee();
           emp.showName();
           emp.showJob();
           
           //Employee is a Person
	}

}
