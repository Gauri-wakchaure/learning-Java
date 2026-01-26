package JavaTasks;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// If Else Ladder- Electricity Bill
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Usage Units :");
			int units = sc.nextInt();
			
			if(units<100) {
				System.out.println("Your Electricity Consumption : LOW");
			}
			else if(units>100 && units<300) {
				System.out.println("Your Electricity Consumption : MEDIUM");
			}
			else if(units>300 && units<500) {
				System.out.println("Your Electricity Consumption : HIGH");
			}
			else {
				System.out.println("Your Electricity Consumption is Very High");
			}
			sc.close();
		}


	}

}
