package superkeyword;

class Vehicle
{
    public Vehicle(int x)
    {
        System.out.println("Parent class constructor :" + x);
    }
}

class car extends Vehicle
{
    public car()
    {
        super(10);
        System.out.println("Child Class Constructor");
    }

    public void start()
    {
        System.out.println("Car is now operational");
    }
}

public class CallParentConstructor
{
    public static void main(String[] args)
    {
        car c = new car();
        c.start();   
    }
}
