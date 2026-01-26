package scannerDemo;

import java.util.Scanner;

public class AllDataTypesWithScanner {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     
     //int
     System.out.println("Enter a integer number: ");
     int myInt = sc.nextInt();
     
   //float
     System.out.println("Enter a float number: ");
     float myFloat = sc.nextFloat();
     
   //double
     System.out.println("Enter a double number: ");
     double myDouble = sc.nextDouble();
     
   //char
     System.out.println("Enter an charcter: ");
     char myChar = sc.next().charAt(0);
     
   //boolean
     System.out.println("Enter boolean number: ");
     boolean myBoolean = sc.nextBoolean();
     
   //string
     sc.nextLine();
     System.out.println("Enter an String with Spaces: ");
     String myString = sc.nextLine();
     
     //output of all values
     System.out.println();
     
     System.out.println("integer :"+myInt);
     System.out.println("float :"+myFloat);
     System.out.println("Double :"+myDouble);
     System.out.println("Char :"+myChar);
     System.out.println("Boolean :"+myBoolean);
     System.out.println("String :"+myString);
  
     
     sc.close();
	}

}
