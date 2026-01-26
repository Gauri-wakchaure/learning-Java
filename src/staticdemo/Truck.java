package staticdemo;

public class Truck
{
    int speed;

    public Truck()
    {
        System.out.println("Speed Of The Truck is :" + speed);
        System.out.println("Constructor Executed....");
    }

    {
        speed = 80;
        System.out.println("Instance initializer Block Executed");
    }

    public void showSpeed()
    {
        System.out.println("Operational Speed : " + speed);
    }

    public static void main(String[] args)
    {
        Truck t = new Truck();
        t.showSpeed();

        Truck t1 = new Truck();
        t1.showSpeed();   
    }
}
