package innerclass;

class Action
{
   String name = "Gauri";
   
   public void display()
   {
	   System.out.println("Name :"+name);
   }
   
   class Replay
   {
	   public void print()
	   {
	   System.out.println("Name is inner class :"+name);
	   }
   }
}
public class DemoMemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Action a = new Action();
        a.display();
        
        Action.Replay r = a.new Replay();
        r.print();
        
	}

}
