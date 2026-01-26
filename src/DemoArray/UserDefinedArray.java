package DemoArray;

import java.util.Scanner;

public class UserDefinedArray {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Size of Array: ");
      int s = sc.nextInt();
      
      int a[]= new int[s];
      
      System.out.println("Print the array elements :");

      for(int i=0; i<a.length; i++)
      {
    	  a[i]=sc.nextInt();
      }
      
      System.out.println("Print the User Defined Array :");
      
      for(int arr :a)
      {
          System.out.println(arr);

      }

      sc.close();
	}

}
