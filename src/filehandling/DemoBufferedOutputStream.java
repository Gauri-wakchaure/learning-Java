package filehandling;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class DemoBufferedOutputStream {

	public static void main(String[] args)
	{
	   try
		{
		  FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test.txt");
		  BufferedOutputStream bout= new BufferedOutputStream(fout);
		
		  String s= "Welcome to buffered string";
		  byte b[]=s.getBytes();
		
		  bout.write(b);
		  bout.flush();
		
		  fout.close();
		  bout.close();
		
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("File write Successfully...");
	}
	}


