package JavaTasks;

import java.util.Scanner;

public class TestWeekdays {
     //Switch Case- Test Weekdays
	public static void main(String[] args)
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter day Number from (1 to 7) :");
     int day = sc.nextInt();
     
     switch(day)
     {
     case 1:
    	 System.out.println("Day : Monday");
    	 break;
     case 2:
    	 System.out.println("Day : Tuesday");
    	 break;
     case 3:
    	 System.out.println("Day : Wenesday");
    	 break;
     case 4:
    	 System.out.println("Day : Thursday");
    	 break;
     case 5:
    	 System.out.println("Day : Friday");
    	 break;	 
     case 6:
         System.out.println("Day : Saturday");
         break;	 
     case 7:
         System.out.println("Day : Sunday");
         break;	 
     default:
    	 System.out.println("Invalid Day");
    	
     }
     sc.close();
	
	}

}
