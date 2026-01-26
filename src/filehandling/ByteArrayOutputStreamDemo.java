package filehandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args)
	{
		try
		{
			  FileOutputStream fout1 = new FileOutputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test.txt");
			  FileOutputStream fout2 = new FileOutputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test2.txt");
			  FileOutputStream fout3 = new FileOutputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test3.txt");

			  ByteArrayOutputStream bout = new ByteArrayOutputStream();
			  bout.write(65);
			  
			  bout.writeTo(fout1);
			  bout.writeTo(fout2);
			  bout.writeTo(fout3);
			  
			  bout.flush();
			  bout.close();
			  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Write Successfully....");
	}

}
