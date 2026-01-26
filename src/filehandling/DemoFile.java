package filehandling;

import java.io.File;


public class DemoFile {

    public static void main(String[] args) {

        try {
            File f1 = new File("C:\\\\Users\\\\shubh\\\\OneDrive\\\\Documents\\\\File Data\\\\Sample.txt");

            if (f1.delete()) {
                System.out.println("File name " + f1.getName() + " is deleted");
            } else {
                System.out.println("File doesn't exists");
            }
            
            System.out.println("Path of File :"+f1.getAbsolutePath());
            System.out.println("Do we have read a data :"+f1.canRead());
            System.out.println("Do we have write a data :"+f1.canWrite());
            System.out.println("Length of Character :"+f1.length());


        } catch (Exception e) {
            System.out.println("Error Occured during Deletion");
        }
    }
}
