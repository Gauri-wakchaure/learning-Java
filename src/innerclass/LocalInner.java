package innerclass;

class A
{
    private String name = "Gauri";
    public void display()
    {
    	System.out.println("Name :"+name);
    	
    	class ReAction
    	{
    		public void print()
    		{
    			System.out.println("Name is inner class:"+name);
    		}
    		
    	}
    	ReAction r = new ReAction();
    	r.print();
    }
}

public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a1 = new A();
       a1.display();
      
       
              
	}

}
