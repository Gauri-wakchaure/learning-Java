package mypackage;

public class ExecuteStudent {
	
  public static void main(String[] args) {
       TestStudent t = new TestStudent();
       t.setName("Gauri");
       System.out.println(t.getName());
       
       t.setAge(22);
       System.out.println(t.getAge());
	}

}
