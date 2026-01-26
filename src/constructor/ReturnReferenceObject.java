package constructor;

class A
{
	A getA()
	{
		return this;
	}
	
	public void message()
	{
		System.out.println("Welcome to this Keyword");
	}
}

public class ReturnReferenceObject {

	public static void main(String[] args) {
     
		new A().getA().message();
	}

}
