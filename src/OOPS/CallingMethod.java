package OOPS;

class CallMethod
{
   public void display()
   {
	   System.out.println("Hello from Display");
   }
   public void show()
   {
	   System.out.println("Hello from Show");
	   this.display();
   }

}

public class CallingMethod {

	public static void main(String[] args) {
        CallMethod m = new CallMethod();
        m.show();
	}

}
