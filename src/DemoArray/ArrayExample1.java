package DemoArray;

public class ArrayExample1 {

	public static void main(String[] args) {
      int a[] = {10, 20,30,40,50};
      System.out.println(a[3]);
      
      System.out.println();
      for(int i=0; i<a.length; i++)
      {
          System.out.print(a[i] + " ");

      }
      
      System.out.println();
      String fruits[] = {"Apple", "Banana", "Orange", "Guava", "Cherry"};
      
      for(int i =0; i<fruits.length; i++)
      {
          System.out.print(fruits[i] + " ");

      }
      
      System.out.println();
      System.out.println("Using for each loop");
      for(String f: fruits)
      {
          System.out.println(f);

      }
      
	}

}
