package sample;

//import mypackage.TestEmployee;
import mypackage.TestStudent;


public class TestPackage {

	public static void main(String[] args) {

		System.out.println("My Java Package");
		
		TestStudent t1 = new TestStudent();
		t1.setName("Gauri");
		System.out.println("Name: "+t1.getName());
		
		t1.setAge(22);
		System.out.println("Age: "+t1.getAge());

		
		//TestEmployee t = new TestEmployee();
		}

}
