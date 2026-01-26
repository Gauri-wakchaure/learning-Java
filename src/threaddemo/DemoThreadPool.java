package threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable
{
    private String message;

    public WorkerThread(String message)
    {
        this.message = message;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " (start) message " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (end)");
    }

    private void processMessage()
    {
        try
        {
            Thread.sleep(500);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class DemoThreadPool
{
    public static void main(String[] args)
    {
        ExecutorService exec = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++)
        {
            Runnable worker = new WorkerThread(" " + i);
            exec.execute(worker);
        }

        exec.shutdown();

        while (!exec.isTerminated())
        {
            // waiting for all threads to finish
        }

        System.out.println("All threads finished");
    }
}
