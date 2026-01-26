package filehandling;

import java.io.FileWriter;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) {
       
		try
		{
			Writer w = new FileWriter("Output.txt ");
			
			String content = "I like Dancing ";
			
			w.write(content);
			w.append("Hello I like also Travelling ");
			w.close();
			
			System.out.println("Write Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
