package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		try
		{
			  FileInputStream fin = new FileInputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test.txt");
			  BufferedInputStream bin = new BufferedInputStream(fin); 
              
			  int j;
			  
			  while((j=bin.read()) !=-1)
			  {
				  System.out.println((char)j);
			  }
			  fin.close();
			  bin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
