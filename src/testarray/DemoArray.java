package testarray;

class Product 
{
	int id;
	String name;
	float price;
    public Product(int id, String name, float price)
  {
	 this.id=id;
	 this.name=name;
	 this.price=price;
  }
    
    public void show()
    {
    	System.out.println("Product id :"+id);
    	System.out.println("Product name :"+name);
    	System.out.println("Product price :"+price);
    	System.out.println();

    }
}
public class DemoArray {

	public static void main(String[] args) {
      // Product p = new Product (111, "Watch", 1000);
       //p.show();
		
		// Using Array 
		Product p[]=new Product[5];
		p[0] = new Product(111, "Watch", 1000);
		p[1] = new Product(112, "Iphone", 100000);
		p[2] = new Product(113, "laptop", 70000);

		p[3] = new Product(114, "Tab", 3500);
		p[4] = new Product(115, "SmartWatch", 15000);
		p[0].show();
		p[2].show();
		
		
		// Using ForEach Loop
		for (Product pr :p)
		{
			pr.show();
		}


	}

}
