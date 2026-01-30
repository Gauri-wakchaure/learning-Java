package collection;
import java.util.*;

class PersonInfo
{
  int id;
  String name;
  int age;
  String city;
  
  public PersonInfo(int id, String name, int age, String city)
  {
	  this.id=id;
	  this.name=name;
	  this.age=age;
	  this.city=city;
  }
}
public class TestPersonList
{

	public static void main(String[] args) {
		PersonInfo p1= new PersonInfo(101, "Gauri", 21, "Pune");
		PersonInfo p2= new PersonInfo(102, "Sakshi", 22, "Nagpur");

		PersonInfo p3= new PersonInfo(103, "Rani", 24, "Dehli");
		PersonInfo p4= new PersonInfo(104, "Pari", 20, "Surat");
 
		ArrayList<PersonInfo> a1 =new ArrayList<PersonInfo>();
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);

		Iterator itr = a1.iterator();
		
		while(itr.hasNext())
		{
			PersonInfo p=(PersonInfo)itr.next();
			System.out.println("Person id : "+p.id+ " "+" Person name : "+p.name+ " " +" Person age : "+p.age+" Person City : "+p.city);
		}
	}

}
