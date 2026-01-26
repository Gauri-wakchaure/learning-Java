package constructor;

class Sample
{   
	int id;
	String name;
	
	public Sample(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display(Sample obj)
	{
		System.out.println("Display Method Executed");
		System.out.println("Id :"+id+ " "+"Name :"+name);
	}
	public void show()
	{
		System.out.println("Show Method Executed");
		display(this);
	}
	public void info()
	{
		System.out.println("Info Method Executed");
		display(this);
	}
	
}
public class PassMethodArgument {

	public static void main(String[] args) {
       Sample s = new Sample(101, "Gauri");
       s.show();
       
       Sample s2 = new Sample(101, "Sakshi");
       s2.info();

	}

}
