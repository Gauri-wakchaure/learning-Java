package filehandling;

public class TestIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter Character ");
               
        try
        {
        int ch = System.in.read();
        System.err.println("Entered Character: "+(char)ch);
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
        System.err.println("Testerror System");
	}

}
