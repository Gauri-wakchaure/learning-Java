package scannerDemo;

import java.util.Scanner;

		public class MultiplyThreeNumbers {
		    public static void main(String[] args) {
		        
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();

		        System.out.print("Enter third number: ");
		        int c = sc.nextInt();

		        int result = a * b * c;

		        System.out.println("Multiplication of the three numbers is: " + result);

		        sc.close();
	}

}
		
