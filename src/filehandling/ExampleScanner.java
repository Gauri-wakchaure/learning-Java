package filehandling;

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
		
				Scanner sc= new Scanner("Hello I am Software Developer");
				
		        while(sc.hasNext())
		        {
		        	System.out.println(sc.next());
		        }
								
				sc.close();

	}


}


