package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileNotFound {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
      try {
		FileReader f= new FileReader("Missing.txt");
      }
      catch(Exception e)
      {
    	  System.out.println(e);

    	  System.out.println("File Not Found");
    	  
      }
      
	}

}
