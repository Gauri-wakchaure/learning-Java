package superkeyword;

class Animal 
{
  public void show()
  {
		System.out.println("This is Parent class property");

  }
}
class Tiger extends Animal
{
  public void display()
  {
	    super.show();
		System.out.println("This is Child Property");

  }
}
public class CallParentMethod {

	public static void main(String[] args) {
     Tiger t = new Tiger();
     t.display();
     //t.show();
	}

}
