package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try
		{
			Writer w = new FileWriter("Output1.txt ");
			BufferedWriter bw= new BufferedWriter(w);
			
			String Content = "I am Software Developer\n";
			
			bw.write(Content);
			bw.append("\nI live in Pune");
			bw.close();
		
			
			System.out.println("Write Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
