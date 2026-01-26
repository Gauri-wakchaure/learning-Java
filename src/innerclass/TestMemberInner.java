package innerclass;

class OuterClass
{
  int x = 100;   //OuterClass variable	
  
  class InnerClass
  {
	  public void innerMethod()
	  {
		  System.out.println("Value from outer class :"+ x);
	  }
  }
}
public class TestMemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         OuterClass oc = new OuterClass();
         
         // Upcasting
         OuterClass.InnerClass inner = oc.new InnerClass();
         inner.innerMethod();
	}

}
