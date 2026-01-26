package JavaTasks;

public class FindPrimeNumbers {

    public static void main(String[] args) 
    {
        for(int num = 1; num <= 20; num++)
        {
            int count = 0;

            // check how many numbers divide num
            for(int i = 1; i <= num; i++)
            {
                if(num % i == 0)
                {
                    count++;
                }
            }

            // prime number has exactly 2 factors
            if(count == 2)
            {
                System.out.print(num + " ");
            }
        }
    }
}
