package JavaTasks;

import java.util.Scanner;

public class TestEvenOddPositive {

	public static void main(String[] args) {
		// Nested If Else- Test Number Is Positive/Even/Odd
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		if(num >= 0)
		{
			if(num % 2 == 0) {
				System.out.println("Number is Even and Positive");
			}
			else {
				System.out.println("Number is Odd");
				
			}
		}
		else {
			System.out.println("Number is Negative");
		}	
		
		sc.close();
		}

	}


