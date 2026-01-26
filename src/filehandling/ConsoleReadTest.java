package filehandling;

import java.io.Console;

public class ConsoleReadTest {

	public static void main(String[] args) 
	{
		
        Console c = System.console();
        
       
        System.out.println("Enter Your Name : ");
        String name = c.readLine();
        
        System.out.println("Thank You "+name);

       
 		}
		
	}


