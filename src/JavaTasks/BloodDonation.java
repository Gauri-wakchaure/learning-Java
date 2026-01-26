package JavaTasks;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) 
	{
		//Nested If Else-Blood Donation Example1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age :");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Weight :");
		int weight = sc.nextInt();
			
			if(age>=18)
			{
				if(weight>=50)
				{
				System.out.println("Eligible for Donating Blood");
			}
			else
			{
				System.out.println("Weight is less than 50 not eligible for Donating Blood");

			}
			}
			else {
				System.out.println("Not Eligible for Donating Blood");
			}
			
			sc.close();
		}
	}
	
	

