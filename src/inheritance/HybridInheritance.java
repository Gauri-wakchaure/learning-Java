package inheritance;

interface Printable
{
    public void print();
}

interface Scannable
{
    public void scan();
}

class Machine
{
  public void powerOn()
  {
	  System.out.println("Machine is Powered On");
  }
}

class Printer extends Machine implements Printable, Scannable
{
  public void print()
  {
	  System.out.println("Printing Documents");
  }
  public void scan()
  {
	  System.out.println("Scanning Documents");
  }
  public void status()
  {
	  System.out.println("Printer is Ready");
  }
}
public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer p = new Printer();
		p.powerOn();
		p.status();
		p.scan();
		p.print();

	}

}
