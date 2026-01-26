package exceptionhandling;

class GauriException extends Exception
{
  public GauriException(String msg)
  {
	  super(msg);
  }
}

public class CustomException 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try 
    {
    	throw new GauriException("Own Exception");
    }
    catch(GauriException e)
    {
        System.out.println(e);
     }
	}

}
