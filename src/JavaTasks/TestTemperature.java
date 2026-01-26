package JavaTasks;

import java.util.Scanner;

public class TestTemperature {

	public static void main(String[] args) {
		// If Else Ladder- Test Temperature
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Temperature :");
			int Temp = sc.nextInt();
			
			if(Temp>=40) {
				System.out.println("Temperature : Very Hot");
			}
			else if(Temp>=30) {
				System.out.println("Temperature : Hot");
			}
			else if(Temp>=20) {
				System.out.println("Temperature : Normal");
			}
			else if(Temp>=10) {
				System.out.println("Temperature : Cold");
			}
			else {
				System.out.println("Temperature : Very Cold");
			}
			sc.close();
		}

	}

}
