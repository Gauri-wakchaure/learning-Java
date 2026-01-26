package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrowskeyword 
{
	public static void readFile() throws IOException
	{
		FileReader fr = new FileReader("text.txt");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {  
		readFile();
        }
        catch(Exception e) {
          System.out.println(e);
        }
        System.out.println("Rest of code");

	}

}
