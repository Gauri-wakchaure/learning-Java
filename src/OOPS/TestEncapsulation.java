package OOPS;

class Student2
{
	private String name;  //data hiding
	
	public void setname(String name)
	{
		this.name= name;  //set name method
	}
	
	public String getname()
	{
		return name;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
         Student2 s = new Student2();
         s.setname("Gauri");       // set name setter
         System.out.println(s.getname());   //get name getter
	}

}
