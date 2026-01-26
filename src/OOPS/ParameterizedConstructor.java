package OOPS;

class Employeee
{
  int id;
  String name;
  double marks;
  
  public Employeee(int i, String n, double m)
  {
	  id = i;
	  name = n;
	  marks = m;
  }
  
  public void display()
  {
	  System.out.println("ID :"+ id +""+ " Name :" + name + " " +" Marks :"+ marks+ " ");

  }
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
      Employeee e = new Employeee(101, "Gauri",91.80);
      e.display();
      
	}

}
