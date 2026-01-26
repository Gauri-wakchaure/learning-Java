package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
	
				try
				{
					Reader r = new FileReader("Output1.txt ");
					BufferedReader br= new BufferedReader(r);
				     
					int d;
					while((d=br.read())!= -1)
					{
						System.out.print((char)d);
					}
					br.close();
					r.close();
				
					
					System.out.println("\nRead Successful");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}

		


	}


