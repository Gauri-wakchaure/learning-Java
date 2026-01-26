package innerclass;

class Animal
{
   public void sound()
   {
	   System.out.println("Animal makes sound");
   }
}

public class DemoAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a = new Animal()
      {
    	   public void sound()
    	   {
    		   System.out.println("Dog Barks ");
    	   }

       };
       
       a.sound();
       
	}

}
