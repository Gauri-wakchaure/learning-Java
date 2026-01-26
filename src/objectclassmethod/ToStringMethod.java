package objectclassmethod;

class Student
{
  int rollNo;
  String name;
  
  public Student(int rollNo, String name)
  {
	  this.rollNo=rollNo;
	  this.name=name;
  }
  
  public void show() 
  {
	  System.out.println("Roll Number :"+rollNo);
	  System.out.println("Name of Student :"+name);

  }
  
  public String toString()
  {
	  //return "Student id :"+rollNo + ", Name : " +name;
	  
	  //String s=  new String("Student id :"+rollNo+ ", Name :"+name);
	  //return s;
	  
	  return "Student id :".concat(rollNo + " ").concat(", Name :").concat(name);
  }
}
public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s= new Student(4,"Gauri");
    s.show();
    System.out.println(s);
	}

}
