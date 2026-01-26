package LoopingStatement;
 
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		int rev = 0; 
		int temp =num;
		
		while(num > 0)
		{
			int digit = num % 10;
			
			rev = rev * 10 + digit;
			
			num = num/10;
		}
		if(temp == rev)
		{
			System.out.println(" Palindrome Number :" + temp);
		}
		else {
			System.out.println("  Not Palindrome Number :" + temp);

		}
		sc.close();
	}

}
