package JavaTasks;

import java.util.Scanner;

public class TestGrade2 {
     //Switch Case- Test Grades
	public static void main(String[] args)
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Your Grade :");
     char grade = sc.next().charAt(0);
     
     switch(grade)
     {
     case 'A':
    	 System.out.println("Genius");
    	 break;
     case 'B':
    	 System.out.println("Merit");
    	 break;
     case 'C':
    	 System.out.println("Average");
    	 break;
     case 'D':
    	 System.out.println("Pass");
    	 break;
     case 'F':
    	 System.out.println("Fail");
    	 break;	 
     default:
    	 System.out.println("Invalid Grade");
    	
     }
     sc.close();
	
	}

}
