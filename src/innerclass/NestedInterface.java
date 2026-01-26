package innerclass;

class B
{
   interface showable
   {
	   public void show();
	   
   }
}
public class NestedInterface implements B.showable
{

	public void show()
	{
		System.out.println("Nested Interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B.showable s1 = new NestedInterface();
      s1.show();
	}

}
