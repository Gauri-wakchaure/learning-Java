package filehandling;

import java.io.FileOutputStream;

public class TestFileOutputStream {

	public static void main(String[] args)
	{
		try 
		{
			FileOutputStream fs = new FileOutputStream("C:\\Users\\shubh\\OneDrive\\Documents\\File Data\\test.txt");
			
			String s = "File handling Program";
			byte b[] = s.getBytes();
			fs.write(b);
			fs.close();
			
			System.out.println("Success...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


