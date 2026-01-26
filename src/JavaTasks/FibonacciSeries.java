package JavaTasks;

public class FibonacciSeries {

    public static void main(String[] args) 
    {
        int n = 20;   // how many numbers you want
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for(int i = 3; i <= n; i++)
        {
            int c = a + b;
            System.out.print(" " + c);

            a = b;
            b = c;
        }
    }
}
