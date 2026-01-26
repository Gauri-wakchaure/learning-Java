package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;


public class ZipDemo {

	public static void main(String[] args) 
	{
		String sourceFile = "C:\\\\\\\\Users\\\\\\\\shubh\\\\\\\\OneDrive\\\\\\\\Documents\\\\\\\\File Data\\\\\\\\Sample.txt";
		String zipFile = "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\shubh\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\File Data\\\\\\\\\\\\\\\\Output.zip";
		
		
	try
    {
		FileOutputStream fos= new FileOutputStream(zipFile);
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		File fileToZip = new File(sourceFile);
		
		FileInputStream fis = new FileInputStream(fileToZip);
		
		ZipEntry entry = new ZipEntry(fileToZip.getName());
		
		zos.putNextEntry(entry);
		
		byte[] bytes = new byte[1024];
		
		int length;
		
		while((length = fis.read()) >=0)
		{
			zos.write(bytes, 0, length);
		}
		zos.close();
		fis.close();
		fos.close();
		
		System.out.println("Zip File Created");	
			
	}
		catch(Exception e)
	{
		 System.out.println(e);	
    }
  }

}
