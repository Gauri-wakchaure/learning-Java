package filehandling;

import java.io.FileInputStream;
import java.io.DataInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) 
	{
		try 
		{
			  FileInputStream fin = new FileInputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test.txt");
              
			  DataInputStream din = new DataInputStream(fin);
			  
			  int count = fin.available();
			  
			  byte[] arr = new byte[count];
			  
			  din.read(arr);
			  
			  for(byte bt : arr)
			  {
				  char k=(char)bt;
				  System.out.print(k+ " ");
			  }
			  
			  din.close();
			  
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
