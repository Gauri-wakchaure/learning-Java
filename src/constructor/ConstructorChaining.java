package constructor;

class TestStudent
{
  int rollNo;
  String name, course;
  float fees;
  
  public TestStudent(int rollNo, String name, String course)
  {  
	  //Assign or Initialize the Variables
	  this.rollNo=rollNo;
	  this.name=name;
	
  }
  public TestStudent(int rollNo, String name, String course, float fees)
  {  
	  //Reusing Constructor Chaining
	  this(rollNo, name, course);
	  this.fees=fees;
  }
  
  
  
  public void display()
  {
	  System.out.println("Roll no :"+rollNo);
	  System.out.println("Student Name :"+name);

	  System.out.println("Student Course :"+course);

	  System.out.println("Student Fees :"+fees);
	  
  }
}

public class ConstructorChaining {

	public static void main(String[] args) {
     TestStudent t = new TestStudent(101, "Gauri", "BE");
     t.display();
     
     System.out.println();     
     TestStudent t1 = new TestStudent(102, "Sakshi", "BE", 40000);
     t1.display();

	}

}
