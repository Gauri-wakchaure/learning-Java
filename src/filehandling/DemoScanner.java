package filehandling;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a mesage :");
		String msg=sc.nextLine();
		
		System.out.println("Your Message is :"+msg);
		sc.close();

	}

}
