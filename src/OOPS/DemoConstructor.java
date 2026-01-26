package OOPS;

public class DemoConstructor 
{
   public DemoConstructor()
   {
	   System.out.println("Calling Constructor ");
   }
   public void show()
   {
	   System.out.println("Object method executed");
   }
	public static void main(String[] args) {
       
		DemoConstructor d = new DemoConstructor();
		d.show();		
	}

}
