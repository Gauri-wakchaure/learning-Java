package objectclassmethod;

class Employee implements Cloneable
{
  int id;
  String name;
  
  public Employee(int id, String name)
  {
	  this.id=id;
	  this.name=name;	  
  }
  
  public Object clone() throws CloneNotSupportedException
  {
	  return super.clone();
  }
}
public class CloneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try 
        {  
		Employee e= new Employee(101, "Gauri");
		Employee e2 =(Employee )e.clone();
		
		System.out.println(e.id+" "+e.name);
		System.out.println(e2.id+" "+e2.name);

		
        }
        catch(Exception e)
        {
        	System.out.println();
        }
           
	}

}
