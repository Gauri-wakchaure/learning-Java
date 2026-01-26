package constructor;


class CallMethod
{
   public void display(int b)
   {
	   System.out.println("Hello from Display " +b);
   }
   public void show(int a)
   {
	   System.out.println("Hello from Show "+a);
	   this.display(a);
   }

}

public class CallParameterMethod {

	public static void main(String[] args) {
        CallMethod m = new CallMethod();
        m.show(10);
        
        CallMethod m1 = new CallMethod();
        m1.show(20);
        
	}

}
