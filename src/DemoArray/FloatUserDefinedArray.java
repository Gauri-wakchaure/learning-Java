package DemoArray;

import java.util.Scanner;

public class FloatUserDefinedArray {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of Array: ");
      int s = sc.nextInt();
      
      float a[]= new float[s];
      
      System.out.println("Print the array elements :");

      for(int i=0; i<a.length; i++)
      {
    	  a[i]=sc.nextFloat();
      }
      
      System.out.println("Print the User Defined Array :");
      
      for(float arr :a)
      {
          System.out.println(arr);

      }

      sc.close();
	}

}
