package threaddemo;

public class ThreadName extends Thread
{
    public void run() {
        System.out.println("Running Thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadName t1 = new ThreadName();
        ThreadName t2 = new ThreadName();
        ThreadName t3 = new ThreadName();

        System.out.println("Name of Thread t1 : " + t1.getName());
        System.out.println("Name of Thread t2 : " + t2.getName());
        System.out.println("Name of Thread t3 : " + t3.getName());

        t1.setName("Fortune");
        t3.setName("Cloud");

        System.out.println("Updated Name of Thread t1 : " + t1.getName());
        System.out.println("Updated Name of Thread t2 : " + t2.getName());
        System.out.println("Updated Name of Thread t3 : " + t3.getName());

        t1.start();
        t2.start();
        t3.start();
    }
}
