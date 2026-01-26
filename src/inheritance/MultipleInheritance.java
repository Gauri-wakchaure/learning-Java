package inheritance;

interface Phone1
{
    public void makeCall();
}

interface Internet
{
   public void browse();
   
}
 class SmartPhone implements Phone1, Internet
 {
	 public void makeCall() 
	 {
		 System.out.println("Making Call");
	 }
	 public void browse() 
	 {
		 System.out.println("Browsing information");
	 }
}
 
public class MultipleInheritance {

	public static void main(String[] args) {
      SmartPhone sp = new SmartPhone();
      sp.makeCall();
      sp.browse();
	}

}
