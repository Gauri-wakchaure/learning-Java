package filehandling;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args)
	{
		try 
		{
			byte[]buf = {55, 35, 36, 38, 42};
			
			ByteArrayInputStream bout = new ByteArrayInputStream(buf);
			
			int k=0;
			
			while((k=bout.read()) != -1)
			{
				char ch = (char)k;
				System.out.println("ASCII Value of Characters is :"+k +" Character is :"+ch);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Convert Successfully");
	}

}
