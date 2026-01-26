package JavaTasks;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		// If Else Ladder- Traffic Signal
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Traffic Signal Light :");
			String light = sc.nextLine();
			
			if(light.equals("Red")) {
				System.out.println("Stop");
			}
			else if(light.equals("Green")) {
				System.out.println("Go Now ");
			}
			else if(light.equals("Yellow")) {
				System.out.println("Reday to Go");
			}
			else {
				System.out.println("Invalid Signal Light");
			}
			sc.close();
		}

	}

}
