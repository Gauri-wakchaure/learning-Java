package filehandling;

import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) 
	{
	  try
	  {
		  FileOutputStream fout1 = new FileOutputStream("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\test.txt");
		  
		  DataOutputStream dout = new DataOutputStream(fout1);
		  
		  dout.writeInt(65);
		  dout.flush();
		  dout.close();

	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  System.out.println("File Write SuccessFully");
	}

}
