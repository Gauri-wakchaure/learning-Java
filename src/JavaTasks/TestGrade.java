package JavaTasks;

import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		// If Else Ladder- Test Grade
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Marks :");
			int marks = sc.nextInt();
			
			if(marks>90) {
				System.out.println("Grade : A");
			}
			else if(marks>75) {
				System.out.println("Grade : B");
			}
			else if(marks>50) {
				System.out.println("Grade : C");
			}
			else if(marks>35) {
				System.out.println("Grade : D");
			}
			else {
				System.out.println("You are Fail");
			}
			sc.close();
		}

	}

}
