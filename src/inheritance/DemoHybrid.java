package inheritance;

class User
{
    String name;
     public void login()
     {
	System.out.println(name + " logged in. ");
     }
}
interface videoPlayer
{
	public void playVideo(String courseName);
}
class Student extends User implements videoPlayer
{
	public void playVideo(String courseName)
	{
		System.out.println("Student is watching : "+courseName);
	}
}
class Teacher extends User implements videoPlayer
{
	public void playVideo(String courseName)
	{
		System.out.println("Teacher is reviewing video : "+courseName);
	}
}

public class DemoHybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = " Gauri ";
		s.login();
		s.playVideo("Java OOPS Concepts");
		
		Teacher t = new Teacher();
		t.name = " Mrs. Wakchaure Mam ";
		t.login();
		t.playVideo("Java OOPS Concept Review");

	}

}
