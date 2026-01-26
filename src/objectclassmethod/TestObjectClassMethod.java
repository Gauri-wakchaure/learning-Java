package objectclassmethod;

class TestObject
{
  int a,b;
  
  public TestObject(int a,int b)
  {
	  this.a=a;
	  this.b=b;
  }
  public int add()
  {
	  return a+b;
  }
  
}
public class TestObjectClassMethod {

	public static void main(String[] args) {
          TestObject t=new TestObject(6,8);
          
          System.out.println(t.add());
          
          System.out.println(t.getClass());
          
          System.out.println(t.hashCode());
          
          TestObject t1=new TestObject(6,8);

          System.out.println(t1.hashCode());
          
          System.out.println(t.equals(t1));
          
          t1=t;
          System.out.println(t.equals(t1));
          System.out.println(t1.hashCode());


          


          
          


	}

}
