package filehandling;

import java.io.File;

public class FilePermissionDemo {

	public static void main(String[] args) {
		
		try
		{
			File f1 = new File("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\Sample.txt");
			
			if(f1.createNewFile())
			{
				System.out.println(f1.getName()+" is Created");
			}
			else
			{
				System.out.println(f1.getName()+"File Exists");
			}
			

            f1.setReadable(false);
            //f1.setWritable(false);
            //f1.setExecutable(true);
            
            System.out.println("Is File Readable :"+f1.canRead());
			System.out.println("Is File Writable :"+f1.canWrite());
			System.out.println("Is File Executable :"+f1.canExecute());

            }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
