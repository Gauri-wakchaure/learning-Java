package JavaTasks;

class Person
{
	public void details()
	{
		System.out.println("Person : Basic Details");
	}
}
class Employee extends Person
{
	public void work()
	{
		System.out.println("Employee is working in a Company");
	}
}
class Manager extends Employee
{
	public void manage()
	{
		System.out.println("Manager is managing the Team");
	}
}


public class MultiLevelInheritanceEx {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.details();
		m.work();
		m.manage();
	}

}
