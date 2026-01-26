package staticdemo;


public class TestStaticVariable 
{
	int id;
	String name;
	static String company ="ABC";
	
	public TestStaticVariable(int id, String name)
	{
		this.id= id;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println("Name of Employee :"+name);
		System.out.println("Employee ID :"+id);
		System.out.println("Company Name :"+company);
	}

	public static void main(String[] args) {
       TestStaticVariable t= new TestStaticVariable(101, "Gauri");
       t.show();
       
       TestStaticVariable t1= new TestStaticVariable(102, "Sakshi");
       t1.show();
       
       TestStaticVariable t3= new TestStaticVariable(103, "Pari");
       t3.show();

	}

}
